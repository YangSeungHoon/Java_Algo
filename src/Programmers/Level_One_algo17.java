package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12918
//문자열 다루기 기본
public class Level_One_algo17 {
    class Solution {
        public boolean solution(String s) {
            boolean answer = true;
            if(s.length() == 4 || s.length() == 6) {
                for(int i = 0; i < s.length(); i++) {
                    if(s.charAt(i) < 48 || s.charAt(i) > 57)answer = false;
                }
            }else answer = false;

            return answer;
        }
    }
}
