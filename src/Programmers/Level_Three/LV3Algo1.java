package Programmers.Level_Three;

public class LV3Algo1 {

    public static void main(String[] args) {
        int N = 11;
        int[] stations = {4,11};
        int W = 1;
        int ans = getResult(N,stations,W);
        System.out.println(ans);
    }

    public static int getResult(int N, int[] stations,int W){
        int answer = 0;
        int leftStart = 1;

        for (int sub : stations) {
            if (leftStart < sub - W) {
                int leftEnd = sub - W;

                int length = leftEnd - leftStart;

                int count = length / (W * 2 + 1);
                if (length % (W * 2 + 1) != 0)
                    count++;

                answer += count;
            }

            leftStart = sub + W + 1;
        }

        if(stations[stations.length-1] + W + 1 <= N){
            leftStart = stations[stations.length-1] + W + 1;

            int leftEnd = N + 1;

            int length = leftEnd - leftStart;

            int count = length / (W * 2 + 1);
            if (length % (W * 2 + 1) != 0)
                count++;

            answer += count;
        }

        return answer;
    }
}
