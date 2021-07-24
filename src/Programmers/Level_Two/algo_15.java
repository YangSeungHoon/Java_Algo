package Programmers.Level_Two;


import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/12911
//다음 큰 숫자
public class algo_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n+1;
        while(true) {
            if(to_binary(n) == to_binary(m)){
                System.out.println(m);
                break;
            }
            m++;
        }

    }

    public static int to_binary(int n) {

        String b = Integer.toBinaryString(n);
        int count = 0;
        for(char c: b.toCharArray()){
            if(c == '1') count++;
        }
//        ArrayList<String> list = new ArrayList<>();
//        int count = 0;
//
//        if(n == 1) return 1;
//        while(n > 1) {
//            int extra = n % 2;
//            list.add(extra+"");
//            n /= 2;
//        }
//        list.add("1");
//
//        for (String s : list) {
//            if (s.equals("1")) count++;
//        }
        return count;
    }
}
