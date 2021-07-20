package Programmers.Level_Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/12973
//짝 지어 제거하기
public class algo_1 {
    public static void main(String[] args) throws IOException {
   Scanner sc=  new Scanner(System.in);
    String s =sc.next();
    Stack<Character> st = new Stack<>();
    int answer = 0;
    st.push(s.charAt(0));
    for(int i = 1; i < s.length(); i++) {
        if(!st.isEmpty() && st.peek() == s.charAt(i)){
            st.pop();
        }else{
            st.push(s.charAt(i));
        }
    }
    if(st.size() == 0) answer =1;
        System.out.println(answer);

    }
}
