package Programmers;

import java.util.*;

//프로그래머스 스택/큐(Stack/Queue) 04번 프린터
public class ProgrammersStackQueue04 {
    public int solution(int[] priorities, int location) {

        int answer = 1;

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int e: priorities) {
            q.offer(e);
    }

        while(!q.isEmpty()) {

            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == q.peek()) {
                    if(i == location) {
                        return answer;
                    }
                    answer++;
                    q.poll();
                }
            }
        }
        return answer;
}
//    public static void main(String[] args) {
//        ProgrammersStackQueue04 run = new ProgrammersStackQueue04();
//        int[] arr = {1,1,9,1,1,1};
//        int answer = run.solution(arr,1);
//        System.out.println(answer);
//    }
}