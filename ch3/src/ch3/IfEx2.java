package ch3;

public class IfEx2 {

	public static void main(String[] args) {

		int point = 70;
		char grade = ' '; 
		// 블랭크 주는 이유는, 밑의 범주에 포함되지 않는 grade의 경우도 생기기때문. 뭐라도 값을 주기 위해서
		// else 로 끝나면 오류가 안나기는 하지만, 선언한 변수는 초기화를 하도록 하자.
		if (point >= 90) {
			grade = 'A';
		}else if (point >=80){
			grade = 'B';
		}else if (point >=70){
			grade = 'C';
		}else if (point >=60){
			grade = 'D';
		}else if (point >=50){
			grade = 'E';
		}
		System.out.printf("점수 : %d, 등급 : %c\n", point, grade);
		

	}

}
