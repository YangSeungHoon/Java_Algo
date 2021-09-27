package Programmers.Level_Two;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class algo_19 {

    static int n = 2;
    static int person,number;
    static String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
    static Set<String> usedWords = new HashSet<>();

    public static void main(String[] args) {

        int[] answer = result();
        System.out.println(Arrays.toString(answer));
    }

    static int[] result() {

        String prevWord = words[0];
        usedWords.add(prevWord);

        for(int i = 1; i < words.length; i++) {


            String currentWord = words[i];
            if(prevWord.charAt(prevWord.length()-1) != (currentWord.charAt(0)) ||
                    usedWords.contains(currentWord)){
                person = (i % n) + 1;
                number = (i / n) + 1;

                return new int[]{person, number};
            }else {
                usedWords.add(currentWord);
                prevWord = currentWord;
            }
        }
        return new int[]{0,0};
    }
}
