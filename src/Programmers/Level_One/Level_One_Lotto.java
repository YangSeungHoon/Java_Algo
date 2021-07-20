package Programmers.Level_One;

//https://programmers.co.kr/learn/courses/30/lessons/77484
//로또의 최고 순위와 최저 순위
public class Level_One_Lotto {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] result = {0,6,5,4,3,2};
            int max = 6;
            int min = 6;
            int countZero= 0;
            int count = 0;
            for(int e: lottos){
                if(e == 0)countZero++;
                for(int i: win_nums) {
                    if(e == i)count++;
                }
            }

            for(int i = 1; i < result.length; i++){
                if(count == result[i] ) {
                    min = i;
                }
                if(count+countZero == result[i]){
                    max = i;
                }
            }
            int[] answer = {max,min};
            return answer;
        }
    }
}
