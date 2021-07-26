package BaekJoon.number;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10814
//나이순 정렬
public class algo_10814 {

    public static void main(String[] args) throws IOException {
       Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        String[][] list = new String[n][2];
        for(int i = 0; i < n; i++) {
            String age = sc.next();
            String name = sc.next();

            list[i][0] = age;
            list[i][1] = name;
        }

        Arrays.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });

        for(int i =0; i < list.length; i++) {
            System.out.println(list[i][0]+" "+list[i][1]);
        }
    }

}
