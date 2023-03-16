package polymorphism;

public class PartTime extends Employee{
	@Override
	public void work() {
		System.out.println(super.getName()+" "+super.getPosition()+"이(가) 주어진 시간동안 일을 합니다.");
	}
	
	
}
