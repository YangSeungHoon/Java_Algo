package BaekJoon.bruteforce;


import java.util.Scanner;

//https://www.acmicpc.net/problem/2231
//분해합
public class algo_2231 {


    static int N;
    static void input(){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
    }
    public static void main(String[] args) {

        input();

        getResult();
    }

    static void getResult() {
        int result = 0;
        for(int i = 1; i <= N; i++){
            int number = i;
            int sum = 0;
            while(number != 0){
                sum += number % 10;
                number /= 10;
            }

            if(sum +i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
