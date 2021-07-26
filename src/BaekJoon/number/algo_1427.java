package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.acmicpc.net/problem/1427
//소트인사이드
public class algo_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s = n+"";
        int[] arr = new int[s.length()];
        for(int i = 0; i < s.length();i++){
            arr[i] = Integer.parseInt(s.charAt(i)+"");
        }

        Arrays.sort(arr);
        String answer= "";
        for(int i = arr.length-1; i >= 0; i--){
            answer += arr[i]+"";
        }
        System.out.println(answer);



    }
}


//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    char[] arr = br.readLine().toCharArray(); 2 1 4 3
//
//
//		Arrays.sort(arr); 1 2 3 4
//
//                for (int i = arr.length - 1; i >= 0; i--) {
//                System.out.print(arr[i]);
//                }
//