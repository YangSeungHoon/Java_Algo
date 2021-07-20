package Programmers.Level_One;

//https://programmers.co.kr/learn/courses/30/lessons/12921
//소수 찾기
public class Level_One_algo19 {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int[] list = new int[n+1];

            for(int i = 0; i < list.length; i++) {
                list[i] = i;
            }

            for(int i = 2; i < list.length; i++) {
                if(list[i] == 0) continue;

                for(int j = i*2; j < list.length; j+=i){
                    list[j] = 0;
                }
            }

            for(int i = 2; i < list.length; i++) {
                if(list[i] != 0 )answer++;
            }
            return answer;
        }
    }
}
