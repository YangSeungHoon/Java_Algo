package Programmers.Level_Two;

//https://programmers.co.kr/learn/courses/30/lessons/77485
// 행렬 테두리 회전하기

import java.util.ArrayList;
import java.util.List;

public class algo_20 {

    static int R = 6;
    static int C = 6;
    static int min;
    static int[][] matrix = new int[R+1][C+1];
    static int[][] quries ={ {2,2,5,4} , {3,3,6,6}, {5,1,6,3} };
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {

        int count = 1;
        for(int i = 1; i <= R; i++){
            for(int j = 1; j <= C; j++){
                matrix[i][j] = count;
                count++;
            }
        }
        run();
    }

    static void run() {

        for(int i = 0; i < quries.length; i++) {

               result.add(rotateMatrix(quries[i]));
            }

        System.out.println(result);

    }


    static int rotateMatrix(int[] query) {
        // 직사각형의 가로 세로 길이
        int xMove = query[2] - query[0]; // 5 - 2 = 3
        int yMove = query[3] - query[1]; // 4 - 2 = 2

        // 현재 위치 및 현재 값
        int nx = query[0]; // 2
        int ny = query[1]; // 2
        int now = matrix[nx][ny]; // (2,2)

        // 현재값을 최소값으로 초기화
        min = now;

        // 오른쪽
        for(int i = 0; i < yMove; i++) {
            ny += 1;
            now = move(nx, ny, now);
        }

        // 아래
        for(int i = 0; i < xMove; i++) {
            nx += 1;
            now = move(nx, ny, now);
        }

        // 왼쪽
        for(int i = 0; i < yMove; i++) {
            ny -= 1;
            now = move(nx, ny, now);
        }

        // 위쪽
        for(int i = 0; i < xMove; i++) {
            nx -= 1;
            now = move(nx, ny, now);
        }
        return min;
    }

    static int move(int x, int y, int before) {
        // 이동한 지점의 값을 temp 에 임시 저장
        int temp = matrix[x][y];

        // 최소값 초기화
        min = Math.min(min, temp);

        // 이동한 지점의 값을 이전 지점의 값으로 초기화
        matrix[x][y] = before;

        return temp;
    }

}
