package ch6;

public class Student2 {

	String name;// 이름
	int ban; // 반
	int no;// 번호
	int kor;// 국어점수
	int eng;// 영어점수
	int math;// 수학점수

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", getTotal()=" + getTotal() + ", getAverage()=" + getAverage() + "]";
	}

	public Student2(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		// 동일 명명시 지역변수가 인스턴스 변수보다 인식이 우선시됨
	}

	String getName() {
		return name;
	}

	int getTotal() {
		int sum = kor + eng + math;
		return sum;
	}

	double getAverage() {
		return Math.round((double) getTotal() / 3*100)/100.0;
	}

}
