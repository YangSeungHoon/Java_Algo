package BaekJoon.number;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1920
// 수 찾기
public class algo_1920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i < M; i++) {
            System.out.println(binary_search(arr1,arr2[i]));
        }
    }
    public static int binary_search(int[] arr1,int target){

        int low = 0;
        int high = arr1.length-1;
        int mid =0;

        while(low <= high) {
            mid = (low+high)/2;
            if(arr1[mid] == target) return 1;

            else if(arr1[mid] > target) high = mid-1;
            else if(arr1[mid] < target) low = mid+1;
        }
        return 0;
    }
}
