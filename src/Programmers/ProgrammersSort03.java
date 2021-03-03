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
//다음 조건이 h번 이상 인용된 논문이 h라는 조건이 있다. 그러면 위에서 나는 sort로 오름차순으로 인영횟수를 정렬했기 때문에
//만약에 h가 5라면 인용횟수를 기준으로 오름차순 해놓은 citation배열에서 첫 번째 값부터 5를 넘어야 한다는 말이다.

//추가적으로 0,1,3,5,6의 배열이 있다고 가정해보자. 이것의 h-index는 3이다.
//for문에서 i가 2일때, h의 값은 3이고, citation[2]의 값은 3이다. 즉, i가 2일때의 인용횟수가 3이니까 index가 2일때
//이후의 값들은 모두 인용횟수가 3 이상 이라는 것이다.
//더하여 마지막 조건인 나머지 논문이 h번 이하 인용되어야 한다를 생각해보자.
//애초에 sort로 오름차순으로 인용횟수를 정렬했기때문에 위에서 h의 조건이 맞으면 그 외의 값들은 모두 다음의 조건을 만족한다.
