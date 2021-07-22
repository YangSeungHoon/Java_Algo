package Programmers.Level_One;

public class Level_One_algo18 {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        String find = "Kim";
        int index = 0;
        for (int i = 0; i < seoul.length; i++) {
            int count = 0;
            for (int j = 0; j < find.length(); j++) {
                if (find.charAt(j) != seoul[i].charAt(j)) break;
                else count++;
            }
            if (count == 3) {
                index = i;
                break;
            }
        }
    }
}
