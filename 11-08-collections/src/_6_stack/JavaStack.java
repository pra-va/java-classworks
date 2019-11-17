package _6_stack;

import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(); // LIFO - Last input - first output
		stack.push(5);
		stack.push(2);
		stack.push(4);
		stack.push(1);

		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());

	}

}
