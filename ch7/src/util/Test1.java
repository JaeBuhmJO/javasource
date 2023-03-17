package util;

public class Test1 {

	private String name;
	private int no;
	private String tel;

	public Test1(String name, int no, String tel) {
		super();
		this.name = name;
		this.no = no;
		this.tel = tel;
	}

	public void print() {
	}

	public int sum() {
		return 0;
	}

	@Override
	public String toString() {
		return "Test1 [name=" + name + ", no=" + no + ", tel=" + tel + "]";
	}

}
