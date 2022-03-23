package ss11_stack_queue.bai_tap.InvertElement;

import java.util.Scanner;
import java.util.Stack;

public class InvertElementString {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi để đảo ngược : ");

        String[] words = sc.nextLine().split("");
        System.out.print("Chuỗi sau khi tách ra : ");
        for (String w : words) {
            System.out.print(w + " ");
            stack1.push(w);
        }
        System.out.println("");
        System.out.print("Chuỗi đảo ngược thành : ");
        while (!stack1.isEmpty()) {
            String ch = stack1.pop();
            System.out.print(ch + " ");
        }

    }
}
