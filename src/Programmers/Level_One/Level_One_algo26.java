package Programmers.Level_One;

import java.util.Scanner;
import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/12932
//자연수 뒤집어 배열로 만들기
public class Level_One_algo26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = n+"";
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            st.push(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        System.out.println(st.size());
        int[] answer = new int[st.size()];

        for(int i = 0; i < answer.length; i++) {
            System.out.println(i);
            answer[i] = st.pop();

        }

    }
}
