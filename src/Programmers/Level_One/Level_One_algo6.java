package Programmers.Level_One;
import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/12982
//예산
public class Level_One_algo6 {

    class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;
            Arrays.sort(d);
            for(int i = 0; i < d.length; i++) {
                if(budget >= d[i]){
                    answer++;
                    budget -= d[i];
                }
            }
            return answer;
        }
    }

}
