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

	public List<BoardDTO> getRows() {
		List<BoardDTO> list = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select bno, title, name, regdate, cnt from board order by bno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setCnt(rs.getInt("cnt"));
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
			String sql = "select bno,name,title,content,attach from board where bno = ?";
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
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;
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
}
