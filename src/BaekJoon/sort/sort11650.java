package BaekJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


//백준 11650 좌표 정렬하기
//https://www.acmicpc.net/problem/11650
public class sort11650 {

    private static int N;
    private static int[][] matrix;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        matrix = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            matrix[i][0] = x;
            matrix[i][1] = y;
        }

        //sort 람다식으로 편하게 하자.
        Arrays.sort(matrix, (e1, e2) -> {
            if (e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(matrix[i][0] + " "+ matrix[i][1]+ '\n');
        }
        System.out.println(sb);

//        Arrays.sort(matrix, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0] == o2[0]) {
//                    return o1[0] - o2[0];
//                } else {
//                    return o1[1] - o2[1];
//                }
//            }
//        });
    }
}