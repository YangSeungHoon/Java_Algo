package Programmers.Level_Two;

//https://programmers.co.kr/learn/courses/30/lessons/12941
// 최솟값 만들기

import java.util.Arrays;
import java.util.Collections;

// * 최솟값을 만드는 방법은 가장 큰 수랑 가장 작은수랑 곱해주면 된다..
public class algo_11 {

    public static void main(String[] args) {
        int[] aList = {1,4,2};
        int[] bList = {5,4,4};

        Arrays.sort(aList); //오름차순 정리
        Arrays.sort(bList);

        int answer  = 0;

        for(int i = 0; i < aList.length; i++) {
            answer += (aList[i]*bList[bList.length-1-i]);
        }
        System.out.println(answer);
    }
}
