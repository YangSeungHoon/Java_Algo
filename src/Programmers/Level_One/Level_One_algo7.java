package Programmers.Level_One;

//https://programmers.co.kr/learn/courses/30/lessons/77884
//약수의 개수와 덧셈
public class Level_One_algo7 {

    class Solution {
        public int solution(int left, int right) {
            int answer = 0;

            for(int i = left; i <= right; i++) {
                if(even_or_odd(i)){
                    answer+= i;
                }else{
                    answer-=i;
                }
            }
            return answer;
        }

        public boolean even_or_odd(int num) {
            int count = 0;
            for(int i = 1; i <= num; i++) {
                if(num % i == 0){
                    count++;
                }
            }
            if(count % 2 ==0)return true;
            else return false;
        }
    }
}
