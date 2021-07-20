package Programmers.Level_Two;

import java.util.Scanner;
//https://programmers.co.kr/learn/courses/30/lessons/49993
//스킬트리
public class algo_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        String skill ="CBD";
       int answer = 0;
        for (String s : skill_trees) {
            boolean flag = true;
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if(skill.indexOf(s.charAt(j)) > -1){ //선행 스킬 목록에 해당 스킬이 존재하는가??
                    if(skill.charAt(count) == s.charAt(j)){ //선행 스킬에서 가장 첫 번째 녀석이 해당 스킬인가??
                        count++;
                    }else {
                        flag= false;
                        break;
                    }
                }
            }
            if(flag) answer++;
        }
        System.out.println(answer);
    }
}
