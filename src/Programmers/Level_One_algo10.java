package Programmers;
import java.util.*;
import java.util.Stack;
//https://programmers.co.kr/learn/courses/30/lessons/12906
//같은 숫자는 싫어
public class Level_One_algo10 {

    public class Solution {
        public int[] solution(int []arr) {
            ArrayList<Integer> result = new ArrayList<>();
            Stack<Integer> st = new Stack<>();
            st.push(arr[0]);
            result.add(arr[0]);
            for(int i = 1; i < arr.length; i++) {
                if(st.peek() != arr[i]){
                    result.add(arr[i]);
                    st.push(arr[i]);
                }
            }
            int[] answer = new int[result.size()];
            for(int i = 0; i < result.size(); i++) {
                answer[i] = result.get(i);
            }
            return answer;
        }
    }
}
