package BaekJoon.guhyeon;

import java.util.*;

// 백준 2331번 반복수열
//https://www.acmicpc.net/problem/2331
public class dfs2331 {

    private static int result;
    private static List<Integer> list = new ArrayList<>();
    private static int P;
    private static int A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        P = sc.nextInt();

        list.add(A);
        while(true) {

            int temp = list.get(list.size()- 1);

            result = 0;

            while(temp != 0) {
                result += Math.pow(temp % 10,P);
                temp /= 10;
            }

            if(list.contains(result))  {
                System.out.println(list.indexOf(result));
                break;
            }
            list.add(result);
        }
    }
}
