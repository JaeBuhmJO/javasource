package thread;

public class UserMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		User user1 = new User(cal);
		User2 user2 = new User2(cal);
		
		user1.start();
		user2.start();
		
		//user1은 setMemory 값이 100인데, 1 슬립타임에 user2가 접근해서 50으로 변경함
		//슬립 깨서 user1도 접근, user2도 접근해서 값을 읽어왔더니 각각 50 읽어옴.
		
	}

}
