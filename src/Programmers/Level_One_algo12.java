package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/12912
//두 정수 사이의 합
public class Level_One_algo12 {
    class Solution {
        public long solution(int a, int b) {
            long answer = 0;

            if(a - b > 0) {
                for(int i = b; i <= a; i++) {
                    answer += i;
                }
            }
            else if ( a- b < 0) {
                for(int i = a; i <= b; i++) {
                    answer += i;
                }
            }else {
                answer = a;
            }
            return answer;
        }
    }
}
