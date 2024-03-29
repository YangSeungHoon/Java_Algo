package BaekJoon.number;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//https://www.acmicpc.net/problem/11650
// 좌표 정렬하기.
public class algo_11650 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // x좌표
            arr[i][1] = sc.nextInt(); // y좌표
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}

//람다 풀이.
//Arrays.sort(arr, (e1, e2) -> {
//        if(e1[0] == e2[0]) {
//        return e1[1] - e2[1];
//        }
//        else {
//        return e1[0] - e2[0];
//        }
//        });