package Programmers.Level_One;

import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12916
//문자열 내 p와 y의 개수
public class Level_One_algo15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean answer = true;
        String s = sc.next();
        s = s.toLowerCase();
        int pcount = 0;
        int ycount = 0;
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if(s.charAt(i)=='p')pcount++;
            else if(s.charAt(i)=='y')ycount++;
        }

        if(pcount == ycount) answer =  true;
        else answer = false;

    }
}
