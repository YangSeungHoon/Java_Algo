import java.util.List;
import java.util.ArrayList;

//프로그래머스 완전탐색 1번
class Solution {
    public int[] solution(int[] answers) {
        int [][] totArr = new int[3][];
        totArr[0] = new int[]{1,2,3,4,5};
        totArr[1] = new int[]{2,1,2,3,2,4,2,5};
        totArr[2] = new int[]{3,3,1,1,2,2,4,4,5,5};
        List<Integer> countNum = new ArrayList<Integer>();
        int[] correctArr = new int[3];
        int maxCorrect = 0;
        for(int i = 0; i< 3; i++) {
            int correct = checkCorrect(answers,totArr[i]);
            correctArr[i] = correct;
            if(correct > maxCorrect) {
                maxCorrect= correct;
            }
        }

        for(int i=0; i<3; i++) {
            if(correctArr[i] == maxCorrect) {
                countNum.add(i+1);
            }
        }
        return countNum.stream().mapToInt(i->i).toArray();
        //여기 이 부분! 잘 기억해둬야 겠다. List에서 Array로 변환해주려고하면 Integer를 int로 바꿔주는 과정이 필요한데
        //이렇게 stream으로 mapToInt 써버리면 편하다.
    }


    public int checkCorrect(int[] answers,int[] arrA) {
        int correct = 0;
        for(int i = 0; i< answers.length; i++) {
            if(answers[i] == arrA[i%arrA.length]) {
                correct+=1;
            }
        }
        return correct;
    }
}