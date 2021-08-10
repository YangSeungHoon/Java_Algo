package BaekJoon.number;

import java.util.Scanner;

//https://www.acmicpc.net/problem/9663
// N- Queen
public class algo_9663 {


    static int N,ans;
    static int col[];

    public static void input() {
        Scanner sc= new Scanner(System.in);
        N = sc.nextInt();
        col = new int[N+1];
    }

    public static void main(String[] args) {

        input();

        recur(1);
        System.out.println(ans);
    }

    public static boolean attackable(int r1,int c1,int r2, int c2){
        if(c1 == c2) return true;
        if(r1-c1 == r2 - c2) return true;
        if(r1+c1 == r2+c2) return true;
        return false;
    }

    public static void recur(int row){
        if(row == N + 1)ans++;
        else{
            for(int c = 1; c <= N; c++) {

                boolean isPossible = true;
                for(int i = 1; i < row ; i++){
                    if(attackable(row,c,i,col[i])){
                        isPossible = false;
                    }
                }

                if(isPossible) {

                    col[row] = c;
                    recur(row+1);
                    col[row] = 0;
                }
            }
        }
    }

}
