package Programmers.Level_Two;

public class algo_25 {

    static String[] person = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static int n = 2;
    static String[] data = {"N~F=0", "R~T>2"};
    static int answer;

    public static void main(String[] args) {

        boolean[] isVisited = new boolean[8];
        answer = 0;
        dfs("",isVisited);
        System.out.println(answer);
    }

    public static void dfs(String names,boolean[] isVisited){

        if(names.length() == 8) {
            if(check(names)) {
                answer++;
            }
            return;
        }
        for(int i = 0; i < 8; i++) {
            if(!isVisited[i]) {
                isVisited[i] = true;
                String name = names + person[i];
                dfs(name,isVisited);
                isVisited[i] = false;
            }
        }
    }

    public static boolean check(String names){
        for(String d: data){
            int position1 = names.indexOf(d.charAt(0));
            int position2 = names.indexOf(d.charAt(2));
            char op = d.charAt(3);
            int index = d.charAt(4) -'0';

            if (op == '=') {
                if(!(Math.abs(position1 - position2) == index +1)) return false;
            }else if(op == '>'){
                if(!(Math.abs(position1 - position2) > index +1)) return false;
            }else if(op == '<'){
                if(!(Math.abs(position1 - position2) < index +1)) return false;
            }
        }
        return true;
    }
}
