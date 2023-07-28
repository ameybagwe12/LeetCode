package StackQueue;
import java.util.*;
public class StackClass {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5); // for dynamic size and not fixed size
        Stack<Integer>s = new Stack<>();
        s.push(5);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        System.out.println(s);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
