package Programmers.Level_One;
import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/12935
//제일 작은 수 제거
public class Level_One_algo29 {

    class Solution {
        public int[] solution(int[] arr) {

            if(arr.length == 1){
                int[] answer = {-1};
                return answer;
            }
            int min = arr[0];
            int mindex = 0;
            for(int i = 1; i < arr.length; i++) {
                if(min > arr[i]){
                    mindex = i;
                    min = arr[i];
                }
            }
            arr[mindex] = -1;
            int[] answer = new int[arr.length-1];
            int j = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != -1){
                    answer[j] = arr[i];
                    j++;
                }
            }
            return answer;
        }
    }
}
