package BaekJoon.greedy;


import java.util.Arrays;
import java.util.Scanner;


//
//백준 11399번 ATM
//https://www.acmicpc.net/problem/11399
public class Greedy11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int people = sc.nextInt();
        int[] waiting = new int[people];

        for (int i = 0; i < people; i++) {
            waiting[i] = sc.nextInt();
        }

        Arrays.sort(waiting);

        for(int i = 0; i < people; i++){
            int count = 0;
            for(int j = 0; j <= i; j++) {
                count += waiting[j];
            }
            sum+= count;
        }

        System.out.println(sum);
    }
}

//import java.util.Arrays;
//        import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int people = sc.nextInt();
//        int[] waiting = new int[people];
//
//        for (int i = 0; i < people; i++) {
//            waiting[i] = sc.nextInt();
//        }
//
//        Arrays.sort(waiting);
//
//        for(int i = 0; i < people; i++){
//            int count = 0;
//            for(int j = 0; j <= i; j++) {
//                count += waiting[j];
//            }
//            sum+= count;
//        }
//
//        System.out.println(sum);
//    }
//}