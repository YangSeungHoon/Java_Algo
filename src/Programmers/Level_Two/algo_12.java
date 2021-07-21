package Programmers.Level_Two;

//https://programmers.co.kr/learn/courses/30/lessons/12939
//최댓값과 최솟값
public class algo_12 {

    public static void main(String[] args) {
        String s ="1 2 3 4 -4 -2 -3 -1";
        String[] arr = s.split(" ");

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(max < Integer.parseInt(arr[i])) {
                max = Integer.parseInt(arr[i]);
            }
            if(min > Integer.parseInt(arr[i])){
                min = Integer.parseInt(arr[i]);
            }
        }
        String answer = "";
        answer += min+" ";
        answer += max;

        System.out.println(answer);
    }
}
