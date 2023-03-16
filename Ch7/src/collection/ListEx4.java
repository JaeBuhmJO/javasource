package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* Stack : 수식계산, 수식 괄호 검사, 워드 undo/redo, 웹브라우저 뒤로 가기 앞으로 가기 등
 * Queue : 최근 사용문서, 인쇄작업 대기목록, 버퍼
 */

public class ListEx4 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		Queue<String> queue = new LinkedList<>();

		// 스택 삽입
		stack.push("0");
		stack.push("1");
		stack.push("2");
		stack.push("3");

		// Queue 삽입
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");

		System.out.println("==========stack=========");
		while (!stack.isEmpty()) {
			System.out.print(stack + " => " + stack.pop());
		}
		System.out.println();
		System.out.println();

		System.out.println("==========queue=========");
		while (!queue.isEmpty()) {
			System.out.print(queue + " => " + queue.poll());
		}
		System.out.println();
	}

}
