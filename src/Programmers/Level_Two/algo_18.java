package Programmers.Level_Two;

import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/62048
//멀쩡한 사각형
public class algo_18 {

    static long w,h;

    static void input() {
        Scanner sc = new Scanner(System.in);
        w = sc.nextLong();
        h= sc.nextLong();
    }
    public static void main(String[] args) {
        input();
        System.out.println(w*h - (w+h - gcd(w,h)));
    }

    public static long gcd(long a, long b) {
        long x = Math.max(a,b);
        long y = Math.min(a,b);

        while(true){
            long r = x % y;
            if(r == 0) break;
            x = y;
            y = r;
        }
        return y;
    }
}

