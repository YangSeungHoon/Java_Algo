package ecote;

import java.util.Scanner;

//이코테 음료수 얼려 먹기
public class dfs03 {
    public static int N,M;
    public static int[][] graph = new int[1000][1000];

    // DFS로 특정 노드를 방문하고 연결된 모든 노드들도 방문
    public static boolean dfs(int x, int y) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if (x <= -1 || x >= N || y <= -1 || y >= M) {
            return false;
        }
        // 현재 노드를 아직 방문하지 않았다면
        if (graph[x][y] == 0) {
            // 해당 노드 방문 처리
            graph[x][y] = 1;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();



        for(int i = 0; i < N; i++) {
            String str = sc.nextLine(); //띄어쓰기 없이 나열되어서 값이 들어오니까 라인으로 읽어버리고..
            for(int j = 0; j < M; j++) {
                graph[i][j] = str.charAt(j) - '0'; //만약에 charAt으로 가져온 값이 String형 3이라면 이는 아스키 값으로 51이된다.
                //그래서 문자열 0(아스키 값 48)을 빼주면 3이된다.
            }
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 현재 위치에서 DFS 수행
                if (dfs(i, j)) { //0,0을 시작으로..
                    result += 1;
                }
            }
        }
        System.out.println(result); // 정답 출력
    }

}
