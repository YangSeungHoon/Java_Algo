package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

//https://www.acmicpc.net/problem/5397
//키로거
public class algo_5397 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for(int j=0; j<test; j++) {
            char[] str = br.readLine().toCharArray();

            Stack<Character> stack1 = new Stack<Character>();
            Stack<Character> stack2 = new Stack<Character>();

            for(int i=0; i<str.length; i++) {
                switch(str[i]) {
                    case '<':
                        if(!stack1.isEmpty()) {
                            stack2.push(stack1.pop());
                        }
                        break;
                    case '>':
                        if(!stack2.isEmpty()) {
                            stack1.push(stack2.pop());
                        }
                        break;
                    case '-':
                        if(!stack1.isEmpty()) {
                            stack1.pop();
                        }
                        break;
                    default:
                        if(str[i] != '<' && str[i] != '>' && str[i] != '-') {
                            stack1.push(str[i]);
                        }
                        break;
                }
            }

            while(!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }

            StringBuilder sb = new StringBuilder();

            for(int i=0; i<stack1.size(); i++) {
                sb.append(stack1.elementAt(i));
            }

            System.out.println(sb);

        }
    }
}
