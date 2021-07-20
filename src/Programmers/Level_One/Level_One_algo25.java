package Programmers.Level_One;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12931
//자릿수 더하기
public class Level_One_algo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int answer = 0;
        String s = n+"";
        for(int i = 0; i < s.length(); i++) {
            answer += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(answer);
    }
}
