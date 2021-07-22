package Programmers.Level_Two;


//https://programmers.co.kr/learn/courses/30/lessons/12913
//땅따먹기
public class algo_14 {

    public static void main(String[] args) {

        int[][] lands = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

        for(int i = 1; i < lands.length; i++) {

            lands[i][0] += Math.max(lands[i-1][1],Math.max(lands[i-1][2],lands[i-1][3]));
            lands[i][1] += Math.max(lands[i-1][0],Math.max(lands[i-1][2],lands[i-1][3]));
            lands[i][2] += Math.max(lands[i-1][0],Math.max(lands[i-1][1],lands[i-1][3]));
            lands[i][3] += Math.max(lands[i-1][0],Math.max(lands[i-1][1],lands[i-1][2]));
        }
            int max = Math.max(lands[lands.length-1][0],Math.max(lands[lands.length-1][1],Math.max(lands[lands.length-1][2],lands[lands.length-1][3])));
        System.out.println(max);



    }
}
