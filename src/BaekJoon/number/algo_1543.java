package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//https://www.acmicpc.net/problem/1543
//문서 검색
public class algo_1543 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();
        char[] find = br.readLine().toCharArray();
        int count = 0;
        int index = 0;
        //abababab aba

        while(index <= input.length-find.length) {

            boolean isTrue = true;
            for(int i = 0; i < find.length; i++){
                if(input[i+index] != find[i]){
                    isTrue = false;
                }
            }
            if(isTrue){
                count++;
                index += find.length;
            }else {
                index+=1;
            }
        }
        System.out.println(count);
    }
}
