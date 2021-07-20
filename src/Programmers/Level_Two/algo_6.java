package Programmers.Level_Two;

//https://programmers.co.kr/learn/courses/30/lessons/12905
//가장 큰 정사각형 만들기
public class algo_6 {
    class Solution
    {
        public int solution(int [][]board)
        {
            int answer = 0;
            int max = 0;
            int x = board.length;
            int y= board[0].length;
            if(x <= 1 || y <= 1) return 1;

            for(int i = 1; i < x; i++){
                for(int j = 1; j < y; j++) {
                    if(board[i][j] > 0){
                        int min = Math.min(board[i-1][j-1],board[i][j-1]);
                        min = Math.min(min,board[i-1][j]);
                        board[i][j] = min +1;
                        max = Math.max(max,min+1);
                    }
                }
            }
            answer = max * max;

            return answer;
        }
    }
}
