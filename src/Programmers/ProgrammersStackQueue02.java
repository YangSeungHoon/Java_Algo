package Programmers;

//프로그래머스 스택/큐 2번 주식가격
public class ProgrammersStackQueue02 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i< prices.length; i++) {
            int count = 0;
            for(int j = i+1; j < prices.length; j++) {
                if(prices[i] <= prices[j]) {
                    count++;
                } else {
                    count++;
                    break;
                }
            }
            answer[i] = count;
        }
        answer[prices.length-1] = 0;
        return answer;
    }
}

//방식은 같지만 다른 사람의 더 간단한 코드
//class Solution {
//    public int[] solution(int[] prices) {
//        int len = prices.length;
//        int[] answer = new int[len];
//        int i, j;
//        for (i = 0; i < len; i++) {
//            for (j = i + 1; j < len; j++) {
//                answer[i]++;
//                if (prices[i] > prices[j])
//                    break;
//            }
//        }
//        return answer;
//    }
//}