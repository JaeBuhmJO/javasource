package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* Arrays 클래스
 *  - 배열을 다루는 데 유용한 메서드가 정의되어있음
 *  - 모든 메서드는 static임
 * 
 */

public class ArraysEx1 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int arr1[] = {1,2,3,4,5};
		
		//toString() : 배열의 요소를 문자열로 출력
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		int arr2[][] = {{11,12},{21,22}};
		int arr22[][] = {{11,12},{21,22}};

		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr2[0]));
		System.out.println(Arrays.deepToString(arr2)); // 2차원 배열 toString

		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		
		//equals
		String[] str1 = {"aaa","bbb"};
		String[] str2 = {"AAA","BBB"};
		String[] str3 = {"AAA","BBB"};
		System.out.println("int 1차원 배열 : "+Arrays.equals(arr, arr1));
		System.out.println("int 2차원 배열 : "+Arrays.equals(arr2, arr22));
		System.out.println("String 1차원 배열 대소문자 구별: "+Arrays.equals(str1, str2));
		System.out.println("String 1차원 배열 대소문자 구별: "+Arrays.equals(str2, str3));
		System.out.println("String 2차원 배열 equals: "+Arrays.equals(str2D, str2D2));
		System.out.println("String 2차원 배열 행 간 비교: "+Arrays.equals(str2D[0], str2D2[0]));
		System.out.println("String 2차원 배열 deepEquals: "+Arrays.deepEquals(str2D[0], str2D2[0]));
		
		int arr3[] = new int[5];
		//arr 배열을 arr3로 복사
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr3));
		
		// copyOf( , )
		int arr4[] = new int[5];
		arr4 = Arrays.copyOf(arr, 4);
		System.out.println(Arrays.toString(arr4));
		arr4 = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(arr4));
		arr4 = Arrays.copyOf(arr, 6);
		System.out.println(Arrays.toString(arr4));
		
		//copyOfRange( , , )
		arr4 = Arrays.copyOfRange(arr, 2,5); //from 2 ~,  from 5~
		System.out.println(Arrays.toString(arr4));
		
		//fill() : 배열의 모든 요소를 지정된 값으로 채우기
		int arr7[] = new int[5];
		Arrays.fill(arr7, 12345);
		System.out.println(Arrays.toString(arr7));
		
		//sort() : 정렬
		int arr8[] = {3,2,0,1,4};
		Arrays.sort(arr8);
		System.out.println(Arrays.toString(arr8));
		
		//BinarySearch() : 검색
		// 검색
		// 순차검색 : 차례대로 검색하는 방식
		// 이진검색 : 검색할 범위를 반복적으로 절반씩 줄여나가는 방식
		//  1) 무조건 정렬이 되어있어야 함
		//  2) 값을 찾는데 성공하면 요소의 index를 리턴
		
		System.out.println(Arrays.binarySearch(arr8, 4));
		System.out.println(Arrays.binarySearch(arr8, 5)); // -6?
		
		//asList(T... a) : 배열을 List로 변환
		//T : 참조 타입 / ... : 가변인수
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
//		List<Integer> list = Arrays.asList(arr8); // 타입 미스매치
		Integer[] arr9 = {14,76,89,25};
		List<Integer> list = Arrays.asList(arr9);
		System.out.println(list);
		//근데 이 list는 add작업안된다. asList는 array의 특성도 가져옴
		List<Integer> list3 = new ArrayList<>(Arrays.asList(arr9));
		System.out.println(list3);
		list3.add(13);
		// new 작업을 해주면 arraylist의 특성만 갖게 된다
		
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
