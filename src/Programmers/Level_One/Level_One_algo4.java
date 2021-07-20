package Programmers.Level_One;


import java.util.HashSet;
import java.util.*;


//https://programmers.co.kr/learn/courses/30/lessons/68644
//두 개 뽑아서 더하기
public class Level_One_algo4 {

    class Solution {
        public int[] solution(int[] numbers) {
            HashSet<Integer> hs = new HashSet<>();
            for(int i = 0; i < numbers.length; i++) {
                for(int j = i+ 1; j < numbers.length; j++) {
                    hs.add(numbers[i]+numbers[j]);
                }
            }
            ArrayList<Integer> list = new ArrayList<>(hs);
            Collections.sort(list);
            int[] answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
