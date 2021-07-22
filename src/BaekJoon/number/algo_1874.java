package BaekJoon.number;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//https://www.acmicpc.net/problem/1874
//스택 수열
public class algo_1874 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 1;
        Stack<Integer> st = new Stack<>();
        ArrayList<String> list = new ArrayList<>();
        boolean flag = true;
        for(int i = 0; i < n; i++) {
            int find = sc.nextInt();

            while(current <= find) {
                st.push(current);
                current += 1;
                list.add("+");
            }

            if(st.peek() == find){
                st.pop();
                list.add("-");
            }
            else {
                System.out.println("NO");
                flag = false;
                break;
            }
        }
        if(flag){
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }
}
