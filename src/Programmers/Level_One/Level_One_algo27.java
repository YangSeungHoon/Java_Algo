package Programmers.Level_One;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12933
//정수 내림차순으로 정렬하기
public class Level_One_algo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long answer = 0;
        StringBuilder sAnswer = new StringBuilder();
        String s= n+"";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< s.length(); i++){
            list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        list.sort(Collections.reverseOrder());
        for (Integer integer : list) {
            sAnswer.append(integer);
        }
        System.out.println(Long.parseLong(sAnswer.toString()));
    }
}
