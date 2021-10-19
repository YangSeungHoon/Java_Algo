package BaekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10798
// 세로 읽기
public class Impl10798 {

    static int row = 5;
    static String[][] matrix;

     static void input() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        matrix = new String[15][15];
        for(int i = 0; i < row; i++) {

            String[] str = br.readLine().split("");
           int  n = str.length;
            for(int j = 0; j < n; j++) {
             matrix[i][j] = str[j];
            }
        }
    }

    public static void main(String[] args) throws IOException {

        input();
        getResult();
    }

    static void getResult() {
         StringBuilder sb = new StringBuilder();
         for(int i = 0; i < matrix.length; i++){
             for(int j = 0; j < matrix.length; j++) {

                 if(matrix[j][i] != null) {
                     sb.append(matrix[j][i]);
                 }
             }
         }
        System.out.println(sb.toString());
    }
}
