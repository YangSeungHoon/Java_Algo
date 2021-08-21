package BaekJoon.number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1092
// 배
public class algo_1092 {

    static int N,M;
    static ArrayList<Integer> crains = new ArrayList<>();
    static ArrayList<Integer> boxes = new ArrayList<>();

    static boolean input() {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        N = sc.nextInt();
        for(int i = 0; i <  N; i++){
            crains.add(sc.nextInt());
        }
        crains.sort(Collections.reverseOrder());

        M = sc.nextInt();
        for(int i = 0; i < M; i++) {
            boxes.add(sc.nextInt());
        }
      boxes.sort(Collections.reverseOrder());

        return crains.get(0) >= boxes.get(0);
    }
    public static void main(String[] args) {

       boolean canMove =  input();

       if(!canMove) {
           System.out.println(-1);
       }else {
           start();
       }
    }

    static void start() {
        int count = 0;

        while(!boxes.isEmpty()) {
            int idx = 0;

            for(int i = 0; i < crains.size();) {
                if(idx == boxes.size()) break;
                else if(crains.get(i) >= boxes.get(idx)) {
                    boxes.remove(idx);
                    i++;
                }
                else idx++;
            }

            count++;
        }
        System.out.println(count);
    }
}

