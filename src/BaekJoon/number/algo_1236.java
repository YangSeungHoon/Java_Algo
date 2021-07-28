package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/1236
//성 지키기
public class algo_1236 {

    static char[][] castle;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s =br.readLine();
        StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열 넣음
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken()); //첫번째 호출


        boolean[] rArr = new boolean[n];
        boolean[] cArr = new boolean[m];

        int row = 0;
        int col = 0;
        castle = new char[n][m];

        for (int i = 0; i < n; i++) {
           castle[i] = br.readLine().toCharArray();

            for (int j = 0; j < m; j++) {
                if(castle[i][j] == 'X'){
                    rArr[i] = true;
                    cArr[j] = true;
                }
            }
        }

        for(int i = 0; i < rArr.length; i++){
            if(!rArr[i]) row++;
        }
        for(int i = 0; i < cArr.length; i++){
            if(!cArr[i]) col++;
        }

        System.out.println(Math.max(col, row));

    }
}
