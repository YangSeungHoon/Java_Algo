package BaekJoon.greedy;

import java.util.Scanner;


//백준 1541번 잃어버린 괄호
//https://www.acmicpc.net/problem/1541
public class Greedy1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        String inputStr = sc.nextLine();

        String[] dividedArr = inputStr.split("\\-"); //-로 분할.

        for (int i = 0; i < dividedArr.length; i++) {
            String[] plusDivied = dividedArr[i].split("\\+"); //+로 나눈다.
            for (String s : plusDivied) {
                if (i == 0) {
                    result += Integer.parseInt(s);
                } else {
                    result -= Integer.parseInt(s);
                }
            }
            }
        System.out.println(result);
    }
}

// 입력받은 문자열을 -를 기준으로 나누자. ex)20-30+20-30 을 나누면 20  30+20  30 이 될 것이다.
// 그리고 각각의 수들을 더해준다. 그러면 20 50 30이 될 것이다. 첫 번째 문자는 숫자라 했으니 첫번째 값은 무조건 양수일 것이다.
