package Programmers.Level_One;

//https://programmers.co.kr/learn/courses/30/lessons/12926
//시저 암호
public class Level_One_algo23 {
    class Solution {
        public String solution(String s, int n) {
            StringBuilder answer = new StringBuilder();

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 32) {
                    answer.append(" ");
                    continue;
                }
                if(s.charAt(i)>= 65 && s.charAt(i) <=90) {
                    if(s.charAt(i) + n > 90) {
                        int over = s.charAt(i) +n;
                        answer.append(Character.toString(((over - 65) % 25) + 64));
                    }else {
                        String answer1 = Character.toString(s.charAt(i) + n);
                        answer.append(answer1);
                    }
                }else {
                    if(s.charAt(i) + n > 122) {
                        int over = s.charAt(i) +n;
                        answer.append(Character.toString(((over - 97) % 25) + 96));
                    }else {
                        answer.append(Character.toString(s.charAt(i) + n));
                    }
                }
            }
            return answer.toString();
        }
    }
}
