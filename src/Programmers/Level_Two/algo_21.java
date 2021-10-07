package Programmers.Level_Two;

//https://programmers.co.kr/learn/courses/30/lessons/60057
// 문자열 압축
public class algo_21 {

    public static void main(String[] args) {

       int result =  getResult();
        System.out.println(result);
    }

    public static int getResult() {

        String s = "aabbaccc";
        int answer = s.length();

        for(int i = 1; i < s.length() / 2 +1 ; i++) {

            String prev = s.substring(0,i);
            int count = 1;

            String enc = "";
            String last = "";

            for(int j = i; j < s.length(); j += i) {

                if(j +  i > s.length()) {
                    last = s.substring(j);
                    continue;
                }

                if(prev.equals(s.substring(j, j + i))) {
                    count++;
                }else {
                    enc += prev;
                    if(count != 1) {
                        enc = count + enc;
                    }
                    prev = s.substring(j, j + i);
                    count = 1;
                }
            }

           enc += prev + last;
//            if (count != 1) {
//                enc = count + enc;
//            }
            System.out.println(enc);

            answer = Math.min(answer,enc.length());
        }
        return answer;
    }

}


//
//    public static int getResult() {
//
//        String s = "aabbaccc";
//        int answer = s.length();
//
//        for (int i = 1; i < s.length() / 2 + 1; i++) {
//            String prev = s.substring(0, i); //0이상 1미만
//            int count = 1;
//            String enc = "";
//            String last = "";
//            for (int j = i; j < s.length(); j += i) {
//                if (j + i > s.length()) {
//                    last = s.substring(j);
//                    continue;
//                }
//                if (prev.equals(s.substring(j, j + i))) {
//                    count++;
//                } else {
//                    enc += prev;
//                    if (count != 1) {
//                        enc = count + enc;
//                    }
//                    prev = s.substring(j, j + i);
//                    count = 1;
//                }
//            }
//            enc += prev + last;
//            if (count != 1) {
//                enc = count + enc;
//            }
//
//            answer = Math.min(answer, enc.length());
//        }
//
//        return answer;
//    }