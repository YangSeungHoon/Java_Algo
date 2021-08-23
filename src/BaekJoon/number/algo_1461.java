package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1461
// 도서관
public class algo_1461 {

    static int N,M,max;
    static PriorityQueue<Integer> nQ = new PriorityQueue<>();
    static PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
    static void input() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        max = Integer.MIN_VALUE;
        while(st.hasMoreTokens()){
           int token = Integer.parseInt(st.nextToken());

           if(token < 0){
               nQ.add(token);
               max = Math.max(max,Math.abs(token));
           }else {
               pQ.add(token);
               max = Math.max(max,token);
           }
        }
    }


    public static void main(String[] args) throws IOException {
        input();

        startGreedy();
    }

    public static void startGreedy(){

        int result = 0;
        while(!nQ.isEmpty()){

            result += Math.abs(nQ.poll())*2;
            for(int i = 1; i <M; i++){
                if(!nQ.isEmpty()){
                    nQ.poll();
                }
            }
        }

        while(!pQ.isEmpty()){

            result += pQ.poll()*2;
            for(int i = 1; i <M; i++){
                if(!pQ.isEmpty()){
                    pQ.poll();
                }
            }
        }

        System.out.println(result-max);
    }
}
