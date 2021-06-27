package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12917
//문자열 내림차순으로 배치하기


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Level_One_algo16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();

        Character[] list = new Character[s.length()];
        for(int i = 0; i < s.length(); i++) {
            list[i] = s.charAt(i);
        }
        Arrays.sort(list,Collections.reverseOrder());

        String answer ="";
        for(int i = 0; i < list.length;i++){
            System.out.println(list[i]);
            answer+=list[i];
        }
    }
}
