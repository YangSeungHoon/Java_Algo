package BaekJoon.basic;


import java.util.Scanner;
import java.util.Stack;

// 백준 17413번 단어 뒤집기2
//https://www.acmicpc.net/problem/17413
public class algo17413 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String str = sc.nextLine();
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<') {
                flag = true;

                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(str.charAt(i));
            } else if (str.charAt(i) == '>') {
                flag = false;
                System.out.print(str.charAt(i));
            } else if (flag) {
                System.out.print(str.charAt(i));
            } else if (!flag) {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(str.charAt(i));
                } else {
                    stack.push(str.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
