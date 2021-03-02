package Programmers;


import java.util.Arrays;

//프로그래머스 그리디 1번 체육복
public class ProgrammersGreedy01 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] stuArr = new int[n+2];

        Arrays.fill(stuArr,1);

        for(int l: lost) {
            stuArr[l] -= 1;
        }

        for(int r: reserve) {
            stuArr[r] += 1;
        }

        stuArr[0] = 0;
        stuArr[n+1] = 0;

        for(int i = 1; i < stuArr.length-1; i++) {
            if (stuArr[i] == 0) {
                if (stuArr[i - 1] == 2) {
                    stuArr[i - 1] -= 1;
                    stuArr[i] += 1;
                } else if (stuArr[i + 1] == 2) {
                    stuArr[i + 1] -= 1;
                    stuArr[i] += 1;
                }
            }
        }

        for(int i = 1; i < stuArr.length-1; i++) {
            if(stuArr[i] >= 1) {
                answer++;
            }
        }
        return answer;
    }
//
//        public static void main(String[] args) {
//            ProgrammersGreedy01 run = new ProgrammersGreedy01();
//            int n = 10;
//            int[] lost = {3,9,10};
//            int[] reserve = {3,8,9};
//        int answer = run.solution(n,lost,reserve);
//        System.out.println(answer);
//    }
}