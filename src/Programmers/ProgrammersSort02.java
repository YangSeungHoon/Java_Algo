package Programmers;

import java.util.Arrays;
import java.util.Comparator;

class ProgrammersSort02 {
    public String solution(int[] numbers) {
        String answer = "";

        //int 배열을 String 배열로 변환
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = (String.valueOf(numbers[i]));
        }

        //배열 정렬, 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });

        //0000 처럼 0으로만 구성되어있으면 0 return
        if (arr[0].equals("0")) return "0";

        //그 외의 경우 순차적으로 연결하여 answer return
        for (int i = 0; i < arr.length; i++) {
            answer+=arr[i];
        }
        return answer;
    }
}

//이 문제의 핵심 아이디어는 Compare을 재정의하는데 그 조건은 그냥 string형식으로 이어 붙여서
// 더 큰녀석을 우선순위로 조건을 만드는 것이다.
