package BaekJoon.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//https://www.acmicpc.net/problem/1753
//최단경로
public class graph1753 {

    static int V,E,K;
    static void input() throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());

        for(int i = 0; i < E; i++) {

        }
    }

    public static void main(String[] args) throws IOException {
        input();
    }
}
