package Programmers.Level_One;

import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12930
//이상한 문자 만들기
public class Level_One_algo24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String answer = "";
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i);
            if(count % 2 == 0 && tmp >= 97 && tmp <= 122) {
                answer+= Character.toString(tmp-32);
                count++;
            }else if(count % 2 == 1 && tmp >=65 && tmp <= 90) {
                answer += Character.toString(tmp+32);
                count++;
            }else if(tmp == 32) {
                answer += " ";
                count = 0;
            }
            else {
                answer += Character.toString(tmp);
                count++;
            }
        }
        System.out.println(answer);
    }
}
