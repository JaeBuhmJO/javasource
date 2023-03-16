package ch6;

public class Student {
	// 이름
	String name;
	// 반
	int ban;
	// 번호
	int no;
	// 국어점수
	int kor;
	// 영어점수
	int eng;
	// 수학점수
	int math;

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		//동일 명명시 지역변수가 인스턴스 변수보다 인식이 우선시됨
	}

	String info() {
		int sum = kor + eng + math;
		double avg = (double) sum / 3;
		return String.format("%s,%d,%d,%d,%d,%d,%d,%.1f", name, ban, no, kor, eng, math, sum, avg);
	}

	//마우스 우클릭 - Source - Generate to string..
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
}
