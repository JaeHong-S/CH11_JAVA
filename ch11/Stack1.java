package ch11;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		String[] nations = {"미국", "중국", "한국", "영국", "종국", "떡국"};
		Stack<String> stack = new Stack<>();
		for(String nation : nations) {
			stack.push(nation); // 데이터 저장
		}
		while(!stack.isEmpty()) { //데이터가 없으면 종료
			//System.out.println(stack.pop());
			System.out.println(stack.peek());
		}

	}

}
