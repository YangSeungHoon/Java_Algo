package Programmers;


//https://programmers.co.kr/learn/courses/30/lessons/70128
//내적
public class Level_One_algo1 {

    class Solution {
        public int solution(int[] a, int[] b) {
            int answer = 0;

            for(int i = 0; i < a.length; i++) {
                answer += a[i]*b[i];
            }

            return answer;
        }
    }
}
