package board.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import board.domain.BoardDTO;
import board.domain.PageDTO;

public class BoardDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public Connection getConnection() {
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myoracle");
			Connection con = ds.getConnection();
			con.setAutoCommit(false);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean insertArticle(BoardDTO dto) {
		boolean flag = false;

		try {
			// reRef = bno, reLev=0, reSeq=0
			con = getConnection();
			String sql = "insert into board(bno, name, password, title, content, " + "attach, re_ref, re_lev, re_seq) "
					+ " values(board_seq.nextval,?,?,?,?,?,board_seq.currval,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getTitle());
			pstmt.setString(4, dto.getContent());
			pstmt.setString(5, dto.getAttach());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				flag = true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	public List<BoardDTO> getRows(PageDTO pageDTO) {
		List<BoardDTO> list = new ArrayList<>();
		try {
			int start = pageDTO.getPage() * pageDTO.getAmount();
			int end = (pageDTO.getPage() - 1) * pageDTO.getAmount();
			con = getConnection();
			String sql = "";
			if (pageDTO.getCriteria().isEmpty()) {
				sql = "SELECT * ";
				sql += "FROM (SELECT ROWNUM AS RNUM, bno, title, name, regdate, cnt, re_lev ";
				sql += "FROM (SELECT bno, title, name, regdate, cnt, re_lev ";
				sql += "FROM BOARD ORDER BY RE_REF DESC, RE_SEQ) ";
				sql += "WHERE ROWNUM <= ?) ";
				sql += "WHERE RNUM > ? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, start);
				pstmt.setInt(2, end);
			} else {
				// sql = "select bno, title, name, regdate, cnt, re_lev from board where upper("
				// + pageDTO.getCriteria()
				// + ") like ? order by re_ref desc, re_seq";
				sql = "SELECT * ";
				sql += "FROM (SELECT ROWNUM AS RNUM, bno, title, name, regdate, cnt, re_lev ";
				sql += "FROM (SELECT bno, title, name, regdate, cnt, re_lev ";
				sql += "FROM BOARD where + upper(" + pageDTO.getCriteria() + ") like ? ";
				sql += "ORDER BY RE_REF DESC, RE_SEQ) ";
				sql += "WHERE ROWNUM <= ?) ";
				sql += "WHERE RNUM > ? ";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%" + pageDTO.getKeyword().toUpperCase() + "%");
				pstmt.setInt(2, start);
				pstmt.setInt(3, end);
			}
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setReLev(rs.getInt("re_lev"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

	public BoardDTO getRow(int bno) {
		BoardDTO dto = null;
		try {
			con = getConnection();
			String sql = "select bno,name,title,content,attach,re_ref,re_lev,re_seq from board where bno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new BoardDTO();
				dto.setBno(bno);
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setAttach(rs.getString("attach"));
				dto.setReRef(rs.getInt("re_ref"));
				dto.setReLev(rs.getInt("re_lev"));
				dto.setReSeq(rs.getInt("re_seq"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;
	}

	public int totalRows(PageDTO pageDTO) {
		int total = 0;
		try {
			con = getConnection();
			String sql = "select count(*) from board ";

			if (!pageDTO.getCriteria().isEmpty()) {
				sql += "where upper(" + pageDTO.getCriteria() + ") like ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%" + pageDTO.getKeyword().toUpperCase() + "%");
			} else {
				pstmt = con.prepareStatement(sql);
			}

			rs = pstmt.executeQuery();
			if (rs.next()) {
				total = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return total;
	}

	public boolean readCnt(int bno) {
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "update board set cnt = cnt + 1 where bno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				commit(con);
				flag = true;
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	public boolean updateArticle(BoardDTO dto) {
		boolean flag = false;
		// title, content는 수정. attach는 옵션
		try {
			con = getConnection();
			String sql = "";
			if (dto.getAttach() != null) {
				sql = "update board set title = ? , content =?, attach = ? where bno =? and password =?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dto.getTitle());
				pstmt.setString(2, dto.getContent());
				pstmt.setString(3, dto.getAttach());
				pstmt.setInt(4, dto.getBno());
				pstmt.setString(5, dto.getPassword());
			} else {
				sql = "update board set title = ? , content =? where bno =? and password =?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dto.getTitle());
				pstmt.setString(2, dto.getContent());
				pstmt.setInt(3, dto.getBno());
				pstmt.setString(4, dto.getPassword());
			}
			int result = pstmt.executeUpdate();
			if (result > 0) {
				commit(con);
				flag = true;
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	public boolean deleteArticle(int bno, String password) {
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "delete board where bno = ? and password = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.setString(2, password);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				commit(con);
				flag = true;
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	public boolean reply(BoardDTO updateDto) {
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "update board set re_seq = re_seq + 1 where re_ref=? and re_seq > ?";
			// 부모값 가져오기
			int reRef = updateDto.getReRef();
			int reLev = updateDto.getReLev();
			int reSeq = updateDto.getReSeq();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, reRef);
			pstmt.setInt(2, reSeq);
			pstmt.executeUpdate();

			sql = "insert into board(bno,name,password,title,content,attach,re_ref,re_lev,re_seq) ";
			sql += "values(board_seq.nextval,?,?,?,?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, updateDto.getName());
			pstmt.setString(2, updateDto.getPassword());
			pstmt.setString(3, updateDto.getTitle());
			pstmt.setString(4, updateDto.getContent());
			pstmt.setString(5, updateDto.getAttach());
			pstmt.setInt(6, reRef);
			pstmt.setInt(7, reLev + 1);
			pstmt.setInt(8, reSeq + 1);
			int result = pstmt.executeUpdate();
			if (result > 0) {
				commit(con);
				flag = true;
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	public List<BoardDTO> searchRows(String criteria, String keyword) {
		List<BoardDTO> list = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select bno, title, name, regdate, cnt, re_lev from board where upper(" + criteria
					+ ") like ? order by re_ref desc, re_seq";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toUpperCase() + "%");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setReLev(rs.getInt("re_lev"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;

	}
}
