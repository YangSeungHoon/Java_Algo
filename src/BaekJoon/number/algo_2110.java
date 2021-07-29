package BaekJoon.number;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2110
//공유기 설치
public class algo_2110 {

    public static int amount;
    public static int check;
    public static int[] distance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        amount = sc.nextInt();
        check = sc.nextInt();

        distance = new int[amount];

        for(int i = 0; i < distance.length; i++) {
            distance[i] = sc.nextInt();
        }

        Arrays.sort(distance);

        int max = distance[distance.length-1]-distance[0];
        int min = 1;

        int result = binary_search(min,max);
        System.out.println(result);
    }

    public static int binary_search(int start,int end) {
        int result = 0;
        while(start <= end){
            int mid = (start+end)/2;
            if(isPossible(mid)){
                result = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return result;
    }

    public static boolean isPossible(int value){
        int c = 1;
        int start = distance[0];
        for(int i = 1;i < distance.length;i++){
           int d = distance[i] - start;
            if(d >= value){
                c++;
                start = distance[i];
            }
        }

        return c >= check;
    }
}
