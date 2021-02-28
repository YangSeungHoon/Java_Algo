package Programmers;

import java.util.Arrays;

//프로그래머스 해시 01번 완주하지 못한 선수
public class ProgrammersHash01 {
    public String solution(String[] participant, String[] completion) {

        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);


        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer += participant[i];
                break;
            }
        }

        if(answer.equals("")) {
            answer+=participant[participant.length-1];
        }
        return answer;
    }
}