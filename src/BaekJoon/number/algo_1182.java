package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1182
//부분수열의 합
public class algo_1182 {

    static BufferedReader br;
    static StringTokenizer st;
    static int N,S,ans;
    static int[] list;
    public static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        list = new int[N+1];
        for(int i = 1; i <= N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        ans = 0;
    }

    public static void main(String[] args) throws IOException {

        input();

        recur(1,0);
        if(S == 0) ans--;
        System.out.println(ans);
    }

    public static void recur(int k, int value){
        if(k == N+1) {
            if(S == value) ans++;
        }
        else{
            recur(k+1,value+list[k]);
            recur(k+1,value);
        }
    }
}
