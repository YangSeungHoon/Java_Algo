package Programmers;
import java.util.ArrayList;
import java.util.Arrays;
//https://programmers.co.kr/learn/courses/30/lessons/12910
//나누어 떨어지는 숫자 배열
public class Level_One_algo11 {
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % divisor == 0) {
                    list.add(arr[i]);
                }
            }
            if(list.size() == 0) {
                int[] newArr = {-1};
                return newArr;
            }
            int[] newArr = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                newArr[i] = list.get(i);
            }
            Arrays.sort(newArr);
            return newArr;
        }
    }
}
