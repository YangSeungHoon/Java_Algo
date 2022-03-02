package Programmers.Level_Two;

public class algo_23 {

    public static void main(String[] args) {
        int n = getResult(5000);
        System.out.println(n);
    }

    public static int getResult(int input){
        int ans = 0;

        while(input > 0){

            if(input % 2 == 0) {
                input /= 2;
            }else{
                input --;
                ans++;
            }
        }
        return ans;
    }
}
