package BaekJoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

//백준 2217번 로프
//https://www.acmicpc.net/problem/2217
public class Greedy2217 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ropes = new int[N];
        int answer = 0;
        int j = 1;

        for(int i = 0; i < ropes.length; i++) {
            ropes[i] = sc.nextInt();
        }
        Arrays.sort(ropes);

        for(int i = ropes.length-1; i >= 0; i--) {

            if(ropes[i] *j > answer) {
                answer = ropes[i] *j;
            }
            j++;
        }
        System.out.println(answer);
    }
}

// 만약에 로프가 10,15 두 개라면.. 중량/로프의 갯수 조건에 의하여 각각 20,30 까지 버틸 수 있을 것이다.
// 그러나 여기서 최댓값은 20이 될 수 밖에 없다. 왜냐하면 21이 되는 순간 끊어지기 떄문이다.

//또 다른 예로, 35,33,30,20,12 다섯개의 로프가 존재한다고 가정해보자.
// 35 하나만 쓴다면..? 버틸 수 있는 무게는 35이다. 그러나 35와 33을 쓴다고 가정해보자. 그러면 각각 70과,66이다. 즉, 최대값은 66인 것이다.
// 또 다른 예를보자. 이번에는 20 12 두 개를 사용한다고 가정해보자. 버틸 수 있는 무게는 가각 40,24 이고, 최댓값은 24이다.
// 위 예에서 알 수 있는 사실은 버틸 수 있는 최댓값으 구하는데 있어서 두 개를 사용한다면 제일 잘 버티는 큰 두 개를 이용하는 것이 방법이라는 것이다.
// 물론 갯수를 늘린다고 정답이 되는 것은 아니다.
// 앞선 예에서 35와 33을 사용하면 최댓값이 66이다. 그러면 이번에는 35,33,12를 사용해보자. 각각 105,99,36 즉 최댓값이 36인 것이다.

//그래서 그 갯수를 늘리는것이 좋을지 안좋을지를 판단하는 기준은 그 갯수에서 가장 잘 버티는 녀석들만 사용하는 방법이다.
//1개를 사용한다면, 35를.. 2개를 사용한다면 35,33을.. 3개를 사용해야 한다면 35,33,30 을 사용하는 것이다.
// 그리고 각 녀석들의 최댓값은 사용한 녀석들 중 가장 작은 수에서 사용한 갯수만큼 곱한 값일 것이다.

//쉽게 말해서 최댓값만 놓고 보겠다.
//35,33 => 66  // 35,33,12 => 36..