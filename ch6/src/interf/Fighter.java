package interf;
//implements : 구현
//인터페이스를 구현할 때 사용

public class Fighter extends Unit implements Fightable {
//attack, move 둘 다? ==> fightable이 attackable과 movable을 상속 받았기에
//Fighter class 가 Fightable을 구현했다
//근데 구현 단계에는 인터페이스의 추상 메소드가 넘어오므로, 모두 구현해야함
//상속과 구현 동시에 가능하다
	
	@Override
	public void attack() {
	}

	@Override
	public void move(int x, int y) {
	}

}
