package ch6;

public class StudentEx2 {

	public static void main(String[] args) {
		// Student2 객체 배열
		Student2 stuArr[]= new Student2[5];
		
		System.out.println(stuArr);
		System.out.println(stuArr[0]); // null
		System.out.println(stuArr[1]);
		System.out.println(stuArr[2]);
		System.out.println(stuArr[3]);
		System.out.println(stuArr[4]);
		
		//초기화
		stuArr[0] = new Student2("홍길동", 1, 1, 45, 55, 65);
		stuArr[1] = new Student2("성춘향", 1, 2, 65, 75, 85);
		stuArr[2] = new Student2("서유기", 1, 3, 35, 75, 85);
		stuArr[3] = new Student2("김미남", 1, 4, 67, 77, 87);
		stuArr[4] = new Student2("이서진", 1, 5, 68, 69, 65);
		
		System.out.println(stuArr);
		System.out.println(stuArr[0]); // Student2 객체의 주소값
		System.out.println(stuArr[1]); // class 에서 Source, tostring..
		System.out.println(stuArr[2]);
		System.out.println(stuArr[3]);
		System.out.println(stuArr[4]);
		
		//홍길동 학생의 정보 출력
		for (int i = 0; i < stuArr.length; i++) {
		System.out.print(stuArr[i].name+" ");
		System.out.print(stuArr[i].ban+" ");
		System.out.print(stuArr[i].no+" ");
		System.out.print(stuArr[i].kor+" ");
		System.out.print(stuArr[i].eng+" ");
		System.out.print(stuArr[i].math+" ");
		System.out.print(stuArr[i].getTotal()+" ");
		System.out.print(stuArr[i].getAverage()+" \n");
		}
		
		
	}

}
