package BaekJoon.backTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1759
// 암호 만들기
public class backTracking_1759 {

    static int L,C;
    static String[] list;
    static boolean[] visited;
    static StringBuilder sb;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        String s = br.readLine();
        list =  s.split(" ");
        visited = new boolean[C];
        Arrays.sort(list);
    }

    public static void main(String[] args) throws IOException {
        input();

        getResult(0,0);
    }

    static void getResult(int start ,int cnt) {

        if(cnt == L) {

            sb = new StringBuilder();
            int c = 0; //자음
            int v = 0; //모음

            for(int i = 0; i < C; i++ ){
                if(visited[i]){
                    sb.append(list[i]);

                    if(list[i].equals("a") || list[i].equals("e") || list[i].equals("i")
                            || list[i].equals("o") || list[i].equals("u") ) v++;
                    else c++;
                }
            }

            if(v >= 1 && c >= 2) System.out.println(sb);

            }
            for(int i  = start; i < C; i++) {

                visited[i] = true;
                getResult(i+1,cnt + 1);
                visited[i]=false;
            }
        }
    }

