package Programmers.Level_Two;


//https://programmers.co.kr/learn/courses/30/lessons/12953
//N개의 최소 공배수
public class algo_8 {

    public static void main(String[] args) {
            int[] arr = {2,6,8,14};
            int answer = arr[0];
            for(int i = 1; i < arr.length; i++) {
                int gcd = gcd(answer,arr[i]);
                answer = answer *arr[i]/gcd;
            }
        System.out.println(answer);
    }

    public static int gcd(int a, int b) {
        int x = Math.max(a,b);
        int y = Math.min(a,b);

        while(true){
            int r = x % y;
            if(r == 0) break;
            x = y;
            y = r;
        }
        return y;
    }
}
