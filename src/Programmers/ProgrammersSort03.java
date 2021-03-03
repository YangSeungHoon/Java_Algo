package Programmers;


import java.util.Arrays;

//프로그래머스 정렬(Sort) 3번 H-index
public class ProgrammersSort03 {

    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for(int i = 0 ; i < citations.length; i++) {
            int h= citations.length - i;

            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}

// 어떤 과학자가 발표한 논문 n편 중,
// h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면
// h의 최댓값이 이 과학자의 H-Index입니다.

//h의 조건중에서 하나가 논문이 h 편 이상이라는 조건이 있다. 즉, 5다섯편을 썼으면 h의 최댓값도 커봐야 5라는 것이다.
