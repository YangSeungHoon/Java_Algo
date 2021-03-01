package Programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//프로그래머스 스택/큐 3번 기능개발
public class ProgrammersStackQueue03 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();

        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++) {

            q.offer(
                    (100 - progresses[i]) % speeds[i] == 0 ?
                            (100-progresses[i]) / speeds[i] :
                            (100-progresses[i]) / speeds[i] + 1
            );
        }

        int before_pro = q.poll();
        int count = 1;

        while(!q.isEmpty()) {

            int after_pro = q.poll();

            if(before_pro >= after_pro) {
                count++;
            }else {
                answer.add(count);
                before_pro = after_pro;
                count = 1;
            }
        }
        answer.add(count); // 이 부분은 마지막에 q가 없어서 더 이상 비교를 할 수 없어 while문을 빠져 나왔으나, else에 걸리지
        //않아서 값을 더해주지 못했기 때문에 마지막에 한 번 더해주는 것이다.

        int[] answerArr = new int[answer.size()];

        for(int i = 0; i < answer.size(); i++) {
            answerArr[i] = answer.get(i);
        }
        return answerArr;

    }
}