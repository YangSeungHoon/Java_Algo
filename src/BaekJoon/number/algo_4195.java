package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//https://www.acmicpc.net/problem/4195
// 친구 네트워크
public class algo_4195 {

    static int[] parent;
    static int[] cnt;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(bf.readLine());

        for(int i = 0; i < test; i++) {

            int n = Integer.parseInt(bf.readLine());
            parent = new int[n*2];
            cnt = new int[n*2];
            HashMap<String,Integer> map = new HashMap<>();
            Arrays.fill(cnt,1);
            int idx = 0;
            for(int j = 0; j < n; j++) {
                String[] str = bf.readLine().split(" ");

                if(!map.containsKey(str[0])){
                    parent[idx] = idx;
                    map.put(str[0],idx++);
                }
                if(!map.containsKey(str[1])){
                    parent[idx] = idx;
                    map.put(str[1],idx++);
                }

                union(map.get(str[0]),map.get(str[1]));
                System.out.println(cnt[find(map.get(str[0]))]);
            }
        }
    }

    public static void union(int a,int b) {

        int parentA = find(a);
        int parentB = find(b);

        //
        if(parentA == parentB) return;

        parent[parentB] = parentA;
        cnt[parentA] += cnt[parentB];
    }

    public static int find(int a){
        if(parent[a] == a) return a;
        return  find(parent[a]);
    }
}