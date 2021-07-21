package Programmers.Level_Two;

//https://programmers.co.kr/learn/courses/30/lessons/12951
//Jaden Case 문자열 만들기
public class algo_9 {

    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        String s = "for the last week";

        String upperStr = (s.charAt(0)+"").toUpperCase();
        answer.append(upperStr);
        for (int i = 1; i < s.length(); i++) {
            upperStr = s.charAt(i)+"";
            if(upperStr.equals(" ")){
                answer.append(" ");
            }
            else if((s.charAt(i - 1) + "").equals(" ")) {
                answer.append(upperStr.toUpperCase());
            }
            else{
                answer.append(upperStr.toLowerCase());
            }
        }
        System.out.println(answer.toString());
        System.out.println("실행");
    }
}
