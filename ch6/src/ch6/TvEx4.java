package ch6;

import java.util.Arrays;

public class TvEx4 {

	public static void main(String[] args) {
		// 객체 배열: 많은 수의 객체를 다뤄야 할 때 배열로 처리

		int arr[]=new int[3];
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		arr[0]=15;
		arr[1]=25;
		arr[2]=35;
		System.out.println(Arrays.toString(arr));
		
		int arr2[] = new int[] {25,35,45};
		System.out.println(Arrays.toString(arr2));
		
		//참조타입[] 배열명 = new 참조타입[크기]; => 다 null로 세팅됨
		Tv[] tvArr = new Tv[3]; // 공간만 마련, 객체 생성한 적 없음
		System.out.println(tvArr); // tvArr[i] 주소값
		System.out.println(tvArr[0]); //null - Tv 객체를 담을 수 있는 공간
		System.out.println(tvArr[1]); //null
		System.out.println(tvArr[2]); //null
		
		//초기화
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		System.out.println(tvArr[0].channel); // new Tv 객체의 주소값 나옴
		System.out.println(tvArr[1].channel); // 동일
		System.out.println(tvArr[2].channel); // 동일
		
		//int arr[] = {25,35,45};
		Tv tvArr2[] = {new Tv(), new Tv(), new Tv()};
		
	}
}
