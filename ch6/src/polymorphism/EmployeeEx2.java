package polymorphism;

public class EmployeeEx2 {

	public static void main(String[] args) {
//		Employee employee = new Employee();
//		employee.setName("홍길동");
//		employee.setPosition("사원");
//		workPrint(employee);
		
		//다형성
		//자손에서 메소드가 오버라이딩 되었다면 오버라이딩 된 메소드가 실행됨
		Ceo employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("CEO");
//		employee2.work(); 부모 변수, 메소드를 쓰게 되는데 work는 자손거?
		workPrint(employee2);
		
		Administrator employee3 = new Administrator();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
		workPrint(employee3);
		
		PartTime employee4 = new PartTime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
		workPrint(employee4);
		
	}
	
	static void workPrint(Employee employee) { // 매개변수의 다형성
//		받아오는 타입을 자손 중 1개로 하면 나머지 자손을 못받는다
//		Employee 로 자손들을 받아오는건 인정된다 - workPrint 하나로 여럿 처리
		employee.work();
	}

}
