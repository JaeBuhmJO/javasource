package ch7;

public class ExceptionEx4 {

	public static void main(String[] args) {
		//참조형 초기화
		//null : 아직 값이 할당되지 않았음
		
		String data = null;
		Account account = null;
		int[] arr=null;
		
		System.out.println(data);
		System.out.println(account);
		System.out.println(arr);
		
		//참조변수 null이 가리키고 있는 곳을 접근 시 - NullPointerException
//		System.out.println(arr[0]);
		//Null Pointer Access
//		System.out.println(data.length());
		
	}

}
