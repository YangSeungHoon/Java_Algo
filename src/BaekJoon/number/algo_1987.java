package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo_1987 {

    static int R,C;
    static int[][] matrix;
    static boolean[] visit = new boolean[26];
    public static int[] dy = {-1, 1, 0, 0}; // 상하 좌우;
    public static int[] dx = {0, 0, -1, 1};
    public static int step = 1;
    public static int answer = 1;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        matrix = new int[R][C];
        for(int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for(int j = 0; j < C; j++) {
                matrix[i][j] =(int)s.charAt(j) - 65;
            }
        }
//        for(Character[] c: matrix){
//           for(Character c2: c){
//               System.out.print(c2);
//           }
//            System.out.println();
//        }
    }

    public static void main(String[] args) throws IOException {
        input();

        getAnswer(0,0);
        System.out.println(answer);
    }

    static void getAnswer(int y, int x) {
        int alpha = matrix[y][x];
        visit[alpha] = true;

        for(int i=0; i < 4; i++) {
            int yy = dy[i] + y;
            int xx = dx[i] + x;

            if(yy < 0 || xx < 0 || yy >= R || xx >= C) continue;

            int nextAlpha = matrix[yy][xx];
            if(visit[nextAlpha]) continue;

            step++;
            answer = Math.max(answer, step);

            getAnswer(yy, xx);
        }
        // 여기서 초기화 하지 않으면 다른 경로에서 접근 할 수 없다.
        step --;
        visit[alpha] = false;
    }
}
