package Programmers.Level_One;
import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/12915
//문자열 내 마음대로 정렬하기
public class Level_One_algo13 {

    class Solution {
        public String[] solution(String[] strings, int n) {
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0; i < strings.length; i++) {
                list.add(strings[i].charAt(n)+strings[i]);
            }
            Collections.sort(list);
            String[] answer = new String[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i).substring(1);
            }
            return answer;
        }
    }
}
