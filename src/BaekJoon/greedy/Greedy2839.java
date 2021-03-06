package BaekJoon.greedy;


import java.util.Scanner;

//백준 2839번 설탕배달
//https://www.acmicpc.net/problem/2839
public class Greedy2839 {

    Scanner sc = new Scanner(System.in);

    public int runner() {
        int n = sc.nextInt();
        int answer = 0;

        if(n == 4 || n == 7) {
            answer = -1;
        }
        if(n % 5 == 2 || n % 5 == 4) {
            answer = (n/5)+2;
        }
        if(n % 5 == 1 || n % 5 == 3) {
            answer = (n/5)+1;
        }

        return answer;
    }

    public static void main(String[] args) {

        Greedy2839 run = new Greedy2839();
        int answer = run.runner();
        System.out.println(answer);
    }
}



//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        if (N == 4 || N == 7) {
//            System.out.println(-1);
//        }
//        else if (N % 5 == 0) {
//            System.out.println(N / 5);
//        }
//        else if (N % 5 == 1 || N % 5 == 3) {
//            System.out.println((N / 5) + 1);
//        }
//        else if (N % 5 == 2 || N % 5 == 4) {
//            System.out.println((N / 5) + 2);
//        }
//    }
//}
