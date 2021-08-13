package BaekJoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//실패.. 반례를 못찾겠음.
//https://www.acmicpc.net/problem/2655
//가장 높은 탑 쌓기
public class dp2665 {

    static int N;
    static BufferedReader br;
    static StringTokenizer st;
    static int num = 0;
    static Block[] blocks;
    static int[] dp;
    static int max;


    public static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        blocks = new Block[N+1];
        dp = new int[N+1];
        for(int i = 0; i <= N; i++) {
            if( i== 0) {
                Block block = new Block(num,0,0,0);

                blocks[i] = block;
                num++;

            }else {
                st = new StringTokenizer(br.readLine());
                int area = Integer.parseInt(st.nextToken());
                int height = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());
                Block block = new Block(num,area,height,weight);
                blocks[i] = block;
                num++;
            }

        }
    }

    public static void main(String[] args) throws IOException {

        input();

        start_dp();
    }

    public static void start_dp(){
        Arrays.sort(blocks);

        max= Integer.MIN_VALUE;
        for(int i = 0; i <=N; i++ ) {

            int sumHeight = 0;
            for(int j = 0; j <= i; j++) {

                if(blocks[i].area > blocks[j].area){
                    sumHeight +=blocks[j].height;
                }
                if(blocks[i].area == blocks[j].area){
                    sumHeight +=blocks[i].height;
                }
            }
            dp[i] = sumHeight;
            max = Math.max(max,sumHeight);
        }
        StringBuilder s= new StringBuilder();
        for(int i = dp.length-1; i > 0; i--) {

            if(dp[i] == max){
               max  -= blocks[i].height;
               s.append(blocks[i].num);
            }
        }
        System.out.println(s.length());
        for(int i = s.length()-1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }


    public static class Block implements Comparable<Block>{
        int num;
        int area;
        int height;
        int weight;

        public Block(int num, int area, int height, int weight) {
            this.num = num;
            this.area = area;
            this.height = height;
            this.weight = weight;
        }


        @Override
        public int compareTo(Block other) {
            return this.weight - other.weight;
        }
    }
}
