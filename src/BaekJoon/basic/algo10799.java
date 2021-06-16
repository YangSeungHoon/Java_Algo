package BaekJoon.basic;

import java.util.Scanner;
import java.util.Stack;

// 백준 10799번 쇠막대기
//https://www.acmicpc.net/problem/10799
public class algo10799 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String str = sc.nextLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            } else if (str.charAt(i) == ')' && stack.peek() + 1 == i) {
                stack.pop();
                count += stack.size();
            } else {
                stack.pop();
                count += 1;
            }
        }
        System.out.println(count);
    }
}
