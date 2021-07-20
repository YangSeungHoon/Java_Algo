package Programmers.Level_One;

//https://programmers.co.kr/learn/courses/30/lessons/12934
//정수 제곱근 판별
public class Level_One_algo28 {
    class Solution {
        public long solution(long n) {
            long answer = 0;
            double dAnswer = 0;
            boolean flag = false;
            for(int i = 1; i <= n; i++) {
                if(Math.pow(i, 2) < n)continue;
                else if(Math.pow(i, 2) > n) {
                    break;
                }else {
                    flag = true;
                    answer = i;
                }
            }
            if(flag){
                dAnswer = Math.pow(answer+1, 2);
            }else{
                dAnswer = -1;
            }
            answer = (long)dAnswer;
            return answer;
        }
    }
}


//class Solution {
//    public long solution(long n) {
//        if (Math.pow((int)Math.sqrt(n), 2) == n) {
//            return (long) Math.pow(Math.sqrt(n) + 1, 2);
//        }
//
//        return -1;
//    }
//}