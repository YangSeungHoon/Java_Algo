package BaekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

//https://www.acmicpc.net/problem/2490
// 윷놀이
public class Impl2490 {

    static String[] score = {"E","A","B","C","D"};
    public static void main(String[] args) throws IOException {

        run();
    }

    static void run() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            String[] s = br.readLine().split(" ");
            int behindCount = 0;
            for(int j = 0; j < 4; j++) {
                if(Objects.equals(s[j], "0")) {
                        behindCount++;
                }
            }
            System.out.println(score[behindCount]);
        }
    }
}
