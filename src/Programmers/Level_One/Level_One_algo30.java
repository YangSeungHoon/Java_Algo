package Programmers.Level_One;

//https://programmers.co.kr/learn/courses/30/lessons/81301
public class Level_One_algo30 {

    public static String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static String s = "one4seveneight";

    public static void main(String[] args) {

        getResult();
    }

    private static void getResult() {


        StringBuilder result = new StringBuilder();
        StringBuilder another = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {

            if (isNumber(s.charAt(i))) {
                result.append(s.charAt(i));
            } else {
                another.append(s.charAt(i));
                for (int j = 0; j < 10; j++) {
                    if(numbers[j].equals(another.toString())){
                        result.append(j);
                        another = new StringBuilder();
                    }
                }
            }
        }
        System.out.println(result.toString());
    }

    public static boolean isNumber(char c) {
        int getC = (int) c;

        if (getC < 48 || getC > 57) {
            return false;
        }
        return true;
    }
}
