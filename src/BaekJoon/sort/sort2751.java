package BaekJoon.sort;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//백준 2751번 수 정렬하기2
//https://www.acmicpc.net/problem/2751
public class sort2751 {

    private static int N;
    private static List<Integer> list=  new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(Integer e: list) {
            sb.append(e).append('\n');
        }
        System.out.println(sb);
    }
}
