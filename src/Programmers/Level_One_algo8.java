package Programmers;
//https://programmers.co.kr/learn/courses/30/lessons/12901
//2016년
public class Level_One_algo8 {
    class Solution {
        public String solution(int a, int b) {
            String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
            int count = 0;
            for(int i = 1; i <= 12; i++) {

                if( i == a)break;
                if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i ==12) {
                    count += 31;
                }
                else if(i == 4 || i == 6 || i == 9 || i == 11){
                    count += 30;
                }
                else if(i == 2){
                    count += 29;
                }
            }
            count += b;
            return days[(count-1)%7];
        }
    }
}
