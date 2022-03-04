package Programmers.Level_Two;

public class algo_24 {
    static int m = 6;
    static int n = 4;
    static int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
    static int temp_cnt = 0;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int maxCount;
    static int count;
    static boolean[][] visited = new boolean[m][n];
    public static void main(String[] args) {

        int[] answer = getResult();
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }

    public static int[] getResult(){
         maxCount = 0;
         count = 0;
        int[] answer = new int[2];

        for(int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (picture[i][j] != 0 && !visited[i][j]) {
                    count++;
                    dfs(i, j);
                }
                if (temp_cnt > maxCount) maxCount = temp_cnt;
                temp_cnt = 0;
            }
        }
        answer[0] = count;
        answer[1] = maxCount;

        return answer;
    }

    public static void dfs(int x,int y){

        if(visited[x][y]) return;

        visited[x][y] = true;

        temp_cnt ++;

        for(int i = 0; i < 4; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx<0 || nx >= picture.length || ny<0 || ny>=picture[0].length) continue;

            // 11. 현 좌표의 색 == 상,하,좌,우 좌표의 색 && 방문한적 없는 상,하,좌,우 좌표라면.
            if(picture[x][y] == picture[nx][ny] && !visited[nx][ny]){
                // 12. DFS를 위한 재귀호출.
                dfs(nx,ny);
            }
        }
    }
}
