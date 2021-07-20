package Programmers.Level_One;
import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/12925
//문자열을 정수로 바꾸기
public class Level_One_algo21 {

    class Solution {
        public int solution(String s) {

            if(s.charAt(0) == '-') return Integer.parseInt(s.substring(1))* -1;
            else return Integer.parseInt(s);

        }
    }
}
