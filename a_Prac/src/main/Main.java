package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	static boolean error = false;

	public static void main(String args[]) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			Stack<Character> stack = new Stack<>();

			String string = br.readLine();
			String bomb = br.readLine();

			for (int i = 0; i < string.length(); i++) {
				char push = string.charAt(i);
				stack.push(push);
				if (push == bomb.charAt(bomb.length() - 1) && stack.size() >= bomb.length()) {
					boolean flag = true;
					for (int j = 0; j < bomb.length(); j++) {
						if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
							flag = false;
							break;
						}
					}
					if (flag) {
						for (int j = 0; j < bomb.length(); j++) {
							stack.pop();
						}
					}
				}
			}
			
			if (stack.isEmpty()) {
				bw.write("FRULA");
			} else {
				for (Character character : stack) {
					bw.write(character);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}