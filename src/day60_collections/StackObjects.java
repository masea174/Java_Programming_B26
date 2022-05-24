package day60_collections;

import java.time.LocalTime;
import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack <Character> stack=new Stack<>();

        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("top of my stack : "+stack.peek());
        stack.pop();
        System.out.println(stack);
        System.out.println("top of my stack : " + stack.peek());

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.remove(0));// removing the lement from index 0 not folowin

        System.out.println("top of my stack : "+stack.peek());
        System.out.println(LocalTime.now().getHour());

    }
}
