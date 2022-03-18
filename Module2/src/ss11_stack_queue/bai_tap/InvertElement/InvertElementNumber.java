package ss11_stack_queue.bai_tap.InvertElement;

import java.util.Stack;

public class InvertElementNumber<T> {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            stack1.push(i);
        }
        System.out.println("Mảng đã khởi tạo là : " + stack1);

        while (!stack1.isEmpty()) {
            Integer ch = stack1.pop();
        }
        System.out.println("Mảng sau đó là : " + stack1);
    }

}
