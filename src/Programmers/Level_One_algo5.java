package Programmers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/68935
//3진법 뒤집기
public class Level_One_algo5 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 0;
          Stack<Integer> stack = new Stack<>();
            int result= 0;
            while(n >= 3){
                stack.push(n % 3);
                n /=3;
            }
        stack.push(n%3);
         while(!stack.empty()){
             result += Math.pow(3,i)*stack.pop();
             i++;
         }
        System.out.println(result);
        }
    }

