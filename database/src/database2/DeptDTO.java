package database2;

/* 클래스간 데이터 전달을 위해 사용되는 객체
 * %DTO(Data Transfer Object)
 * %VO(Value Object)
 * 
 * db 데이터 내용을 전송하는 용도로 사용
 * table의 column과 동일하게 작성
 * 
 * 기본 생성자
 * 매개변수 생성자
 * getter/setter
 * tostring 다 만들기
 */

public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDTO() {
		super();
	}
	
	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
}
