package BaekJoon.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dp11726 {

    private static int N;

    private static int[] list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        list = new int[N+1];

        if(N>=2){
            for(int i = 2; i <= N; i++){
                list[i] = (list[i-1] + list[i-2]) % 10007;
            }
        }
        System.out.println(list[N]);
    }
}
