package Programmers;
import java.util.Stack;
//https://programmers.co.kr/learn/courses/30/lessons/64061
//크레인 인형뽑기
public class Level_One_algo3 {

    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < moves.length; i++) {
                int y= moves[i]-1;
                for(int j = 0; j < board.length; j++) {
                    if(board[j][y] != 0){
                        if(stack.empty()){
                            stack.push(board[j][y]);
                            board[j][y] = 0;
                        }else {
                            int pick = stack.peek();
                            if(pick == board[j][y]){
                                answer+=2;
                                stack.pop();
                                board[j][y] = 0;
                            }else {
                                stack.push(board[j][y]);
                                board[j][y]= 0;
                            }
                        }
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
