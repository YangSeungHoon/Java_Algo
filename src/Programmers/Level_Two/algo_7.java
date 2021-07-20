package Programmers.Level_Two;

import java.util.Arrays;
import java.util.Scanner;

public class algo_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int[][] matrix = new int[11][11];
        boolean[][] visited = new boolean[11][11];
        int x = 5;
        int y = 5;
        for(boolean[] e : visited) Arrays.fill(e,false);
        visited[x][y] = true;
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(x <= 1 || x >= 10 || y <= 1 || y >= 10) continue;
            if(visited[x][y])continue;
            if(s.charAt(i) == 'U') {
                y--;
                visited[x][y] = true;
                count++;
            }else if(s.charAt(i) == 'D'){
                y++;
                visited[x][y] = true;
                count++;
            }else if(s.charAt(i) =='L') {
                x--;
                visited[x][y] = true;
                count++;
            }else if(s.charAt(i) =='R'){
                x++;
                visited[x][y] = true;
                count++;
            }
        }
        System.out.println(count);
    }
}
