package ch4;

public class Prac {

	public static void main(String[] args) {
		// 2이하의 눈이 나올 때 까지 주사위 시도 횟수
			int dice = 7;
			int trials = 0;
			while (dice > 2) {
				dice = (int) (Math.random() * 6) + 1;
				trials++;
			}
			System.out.println("주사위 눈" + dice);
			System.out.println("시도 횟수" + trials);
				
		// 2가 1000번, 3이 500번 나올 때 까지 전체 시도횟수
			int countTwo = 0;
			int countThree = 0;
			while (countTwo < 1000 || countThree < 500) {
				dice = (int) (Math.random() * 6) + 1;
				trials++;
				if (dice ==2) {
					countTwo++;					
				}else if (dice==3) {
					countThree++;
				}				
			}
			System.out.printf("2 등장 횟수 : %d, 3 등장 횟수 :%d, 총 시도 횟수 : %d",countTwo,countThree,trials);
				
	}

}
