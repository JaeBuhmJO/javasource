package polymorphism;

public class EmployeeEx {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("홍길동");
		employee.setPosition("사원");
		workPrint(employee);
		
		//다형성
		//자손에서 메소드가 오버라이딩 되었다면 오버라이딩 된 메소드가 실행됨
		Employee employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("CEO");
//		employee2.work(); 부모 변수, 메소드를 쓰게 되는데 work는 자손거?
		workPrint(employee2);
		
		Employee employee3 = new Administrator();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
		workPrint(employee3);
		
		Employee employee4 = new PartTime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
		workPrint(employee4);
		
	}
	
	static void workPrint(Employee employee) {
		employee.work();
	}

}
