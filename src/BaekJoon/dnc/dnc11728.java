package BaekJoon.dnc;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


//백준 11728번 배열합치기 (Divide and Conquer)
//https://www.acmicpc.net/problem/11728
public class dnc11728 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arrA = new int[N];
        int[] arrB = new int[M];
        int[] result = new int[N+M];



        String[] input1 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(input1[i]);
        }
        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            arrB[i] = Integer.parseInt(input2[i]);
        }

        int index = 0;
        for (int i = 0; i < N; i++) {
            result[index++] = arrA[i];
        }
        for (int i = 0; i < M; i++) {
            result[index++] = arrB[i];
        }
        Arrays.sort(result);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            builder.append(result[i]).append(" ");
        }
        System.out.println(builder.toString());
    }


}