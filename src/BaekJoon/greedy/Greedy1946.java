package BaekJoon.greedy;



import java.util.Scanner;

//백준 1946번 신입 사원
//https://www.acmicpc.net/problem/1946
public class Greedy1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int test = sc.nextInt();


        for(int i = 0; i < test; i++) {

            int N = sc.nextInt();
            int[] scores = new int[N+1];
            for (int j = 1; j < N+1; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                scores[x] = y;
            }

            int minScore = scores[1];
            int count = 1;
            for (int j = 2; j < N+1; j++) {
                if (minScore > scores[j]) {
                    minScore = scores[j];
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}

//이중 배열로 하지말고, 어차피 등수는 안겹치니까.. 그리고 어차피 [][]에서 앞에 값으로 정렬할 거라면
//일차원 배열로 두고 앞에 나오는 123456을 idx로 생각하고 그 idx값에 해당하는 값을 y라고 생각하자.
//예를들어 [0][0] = 1 이고, [0][1] = 4 라면 서류심사 1등, 면접 4등 이라는 소리인데 서류심사를 기준으로 정렬 하려고 했으니까
//socres[]의 idx가 서류심사 등수이고, 그 idx에 값이 면접 등수라고 생각하자는 것이다.
//여기서 생각해내기 힘든 부분이 x,y를 받고 scores[x] = y 즉, 서류심사 등수 idx에 면접 등수 값을 넣어준다는 개념이다.




//시간 초과 코드. 기본적인 아이디어는 맞았으나 시간 초과.
//public class Greedy1946 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//
//        int test = sc.nextInt();
//
//
//        for(int i = 0; i < test; i++) {
//
//            int N = sc.nextInt();
//            int[][] scores = new int[N][2];
//            for (int j = 0; j < N; j++) {
//                scores[j][0] = sc.nextInt();
//                scores[j][1] = sc.nextInt();
//            }
//
//            Arrays.sort(scores, new Comparator<>() {
//                @Override
//                public int compare(int[] o1, int[] o2) {
//                    return o1[0] - o2[0];
//                }
//            });
//
//            int minScore = scores[0][1];
//            int count = 1;
//            for (int j = 1; j < N; j++) {
//                if (minScore > scores[j][1]) {
//                    minScore = scores[j][1];
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//        sc.close();
//    }
//}
