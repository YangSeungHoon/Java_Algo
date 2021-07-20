package Programmers.Level_Two;
//https://programmers.co.kr/learn/courses/30/lessons/70129
//이진 변환 반복하기

import java.util.Scanner;

public class algo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next());

        int count = 0;
        int zeroCnt = 0;

        while (!s.toString().equals("1")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zeroCnt++;
                }
            }

            s = new StringBuilder(s.toString().replace("0", "")); //0제거된 상황
            int n = s.length();
            s = new StringBuilder();
            while(n > 0){
                s.insert(0, n % 2);
                System.out.println(s);
                n /= 2;

            }
            count++;
        }
        int[] answer = new int[2];
        answer[0]= count;
        answer[1] = zeroCnt;
    }
}
