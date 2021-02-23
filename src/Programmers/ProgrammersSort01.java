package Programmers;

import java.util.Arrays;

//프로그래머스 Sort 1번 나의 풀이.
class ProgrammersSort01 {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        int to;
        int from;
        int target;

        for(int i = 0; i < commands.length; i++) {
            int[] clone_arr = array.clone();
            //1,5,2,6,3,7,4
            to = commands[i][0]; //2
            from = commands[i][1];//5
            target = commands[i][2];//3

            Arrays.sort(clone_arr, to-1, from); //1 2 3 5 6 7 4
            answer[i] = clone_arr[to+target-2];
        }

        return answer;
    }
}

//다른 풀이 1
//import java.util.Arrays;
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//
//        for(int i=0; i<commands.length; i++){
//            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//
//        return answer;
//    }
//}