package collection;

/* 정렬
 * 
 * Comparable 인터페이스 : 기본 정렬 기준을 구현할 때
 *  1) compareTo(Object o)
 * 
 * Comparator 인터페이스 : 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 때
 *  1) compare(Object o)
 *  
 *  
 */

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {

	public static void main(String[] args) {
		Integer arr[] = {84,75,62,15,32,98,48,65,19,25};
		String strArr[] = {"cat", "dog", "lion", "tiger", " ", " 78"};
		
		//오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//사전 순서로 정렬(공백 - 숫자 - 대문자 - 소문자 - 오름차순)
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		//내림차순 정렬 - 기타 다른 방법의 정렬 - Comparator
		//sort(T a[], Comparator<? super T> c) - 구현한 Comparator 사용
		Arrays.sort(strArr, new DescComp());
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr, Comparator.naturalOrder());
		System.out.println(Arrays.toString(strArr));
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		
	}

}
// Descript Comparator
class DescComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2)*-1; // 내림차순
	}

}
