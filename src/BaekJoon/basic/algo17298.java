package BaekJoon.basic;

import java.util.Scanner;
import java.util.Stack;


// 백준 17298 오큰수
//https://www.acmicpc.net/problem/17298
public class algo17298 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stk = new Stack<>();
        int[] list = new int[n];

        for(int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }


        for(int i = 0; i < n; i++) {

            while(!stk.empty() && list[stk.peek()] < list[i]){

                list[stk.pop()]=list[i];
            }
            stk.push(i);
        }

        while(!stk.empty()){
            list[stk.pop()]=-1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(list[i]).append(' ');
        }
        System.out.print(sb);
    }



//시간 초과
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        ArrayList<Integer> list =new ArrayList<>();
//        boolean flag = false;
//        for(int i = 0; i < n; i++) {
//            list.add(sc.nextInt());
//        }
//
//        for(int i = 0; i < n; i++) {
//            flag = false;
//            int cur = list.get(i);
//            for(int j = i+1; j < n; j++) {
//                if(list.get(j) > cur && !flag){
//                    list.set(i, list.get(j));
//                    flag = true;
//                }
//            }
//            if(!flag) {
//                list.set(i,-1);
//            }
//        }
//
//        for(int i = 0; i < n; i ++) {
//            System.out.print(list.get(i)+" ");
//        }
//    }
}
