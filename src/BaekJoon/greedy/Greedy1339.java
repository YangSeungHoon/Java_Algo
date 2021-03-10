package BaekJoon.greedy;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//백준 1339번 단어 수학
//https://www.acmicpc.net/problem/1339
public class Greedy1339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] words = new String[N];

        for(int i = 0; i < N; i++) {
            words[i] = sc.next();
        }

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length() - o2.length())*-1;
            }
        });



    }
}
