package datastructures.collections;

import java.util.Stack;

/**
 * Stack Collection Example with its common methods
 */
public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
