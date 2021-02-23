package Programmers;

class ProgrammersDfsBfs01 {
    static int answer = 0;
    public int solution(int[] numbers, int target) {


        dfs(numbers,0,0,target);

        return answer;

    }
    public static void dfs(int[] numbers,int idx,int sum,int target) {

        if(numbers.length == idx) {
            if(sum == target) {
                answer++;
            }
        } else {
            dfs(numbers,idx+1,sum+numbers[idx],target);
            dfs(numbers,idx+1,sum-numbers[idx],target);
        }
    }

}

//다른 사람의 깔끔한 풀이.

//class Solution {
//    public int solution(int[] numbers, int target) {
//        int answer = 0;
//        answer = dfs(numbers, 0, 0, target);
//        return answer;
//    }
//    int dfs(int[] numbers, int n, int sum, int target) {
//        if(n == numbers.length) {
//            if(sum == target) {
//                return 1;
//            }
//            return 0;
//        }
//        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
//    }
//}
