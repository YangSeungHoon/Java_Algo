package Programmers.Level_One;

//https://programmers.co.kr/learn/courses/30/lessons/12922
//수박수박
public class Level_One_algo20 {
    class Solution {
        public String solution(int n) {
            String answer = "";
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) answer+="수";
                else answer+="박";
            }
            return answer;
        }
    }
}
