package BaekJoon.implementation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//백준 1316번 그룹 단어 체커(Implementation)
//https://www.acmicpc.net/problem/1316
public class Impl1316 {
    private static int N;
    private static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        count = N;
        for(int i = 0; i < N; i++) {
            String words = br.readLine();

            if(!check(words)) {
                count--;
            }
        }
        System.out.println(count);
    }

    public static boolean check(String words) {
        String prev = String.valueOf(words.charAt(0)); //입력받은 단어의 첫 번째 알파벳.
        ArrayList<String> list  = new ArrayList<>();

        for(int k = 0; k < words.length(); k++) {
            String w = String.valueOf(words.charAt(k));
            if(!prev.equals(w) && list.contains(w)){ // 이전 알파벳과 현재 알파벳이 같지 않고, 리스트에 이미 해당 알파벳을 가지고 있으면 중복된 알파벳이 나중에 다시 나온 것.
                return false;
            }
            prev = String.valueOf((words.charAt(k)));
            list.add(w);
        }
        return true;
    }
}
