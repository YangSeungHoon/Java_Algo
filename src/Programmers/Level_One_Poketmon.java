package Programmers;
import java.util.HashSet;
import java.util.Set;

//https://programmers.co.kr/learn/courses/30/lessons/1845
//포켓몬
public class Level_One_Poketmon {


    class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            int select = nums.length/2;
            Set<Integer> sets = new HashSet<>();
            for(int e: nums) {
                sets.add(e);
            }
            if(sets.size() <= select) {
                answer = sets.size();
            }else {
                answer = select;
            }

            return answer;
        }
    }
}
