package ch6;

public class StudentEx {

	public static void main(String[] args) {
		Student stu = new Student("홍길동", 1, 1, 100, 60, 76);

		// msg = 홍길동,1,1,100,60,76,점수합계,평균
		
		String msg = stu.info();
		System.out.println(msg);
		
		System.out.println(stu); //ch6.Student@1060b431
		//클래스에 to string 메소드 추가하면 멤버변수들 출력
		
		//Student2 객체 생성, 변수 임의부여
		Student2 stu2 = new Student2("성춘향",1,1,100,60,76);
		System.out.println("name "+stu2.getName());
		System.out.println("total "+stu2.getTotal());
		System.out.println("average "+stu2.getAverage());
		
		System.out.println(stu2); //ch6.Student2@11758f2a
		
	}
}
