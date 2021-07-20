package Programmers.Level_Two;

import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12899
//124 나라의 숫자
public class algo_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] list = {"4","1","2"};
        String answer= "";


        while(n > 0) {
            int remain = n % 3;
            n /= 3;
            if(remain == 0) n--;

            answer = list[remain]+answer;
        }

        System.out.println(answer);
    }
}
