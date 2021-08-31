package Programmers.Level_Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//https://programmers.co.kr/learn/courses/30/lessons/42885
// 구명보트
public class algo_17 {

    static int[] people;
    static int limit,ans;
    static void input(){

        people = new int[] {40, 50, 60, 90};
        limit = 100;
        ans = 0;
    }

    public static void main(String[] args) {
        input();

        getResult();
    }

    static void getResult() {

        int i = people.length-1;
        int j = 0;


        while ( i > j ) {

            if( people[i] + people[j] <= limit ) j++;

            i--;

            ans++;
        }
        if(i == j) {
            System.out.println("실행");
            ans++;
        }

        System.out.println(ans);
    }
}
