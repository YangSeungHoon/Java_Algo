package BaekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Impl3048 {

    static class Ant {

        private char alpha;
        private String group;
        private boolean isJump;

        public Ant(char alpha, String group) {
            this.alpha = alpha;
            this.group = group;
            this.isJump = false;
        }
    }
    static ArrayList<Ant> ants;
    static int count;

    static void input() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int left = Integer.parseInt(st.nextToken());
        int right = Integer.parseInt(st.nextToken());
         String leftGroup = new StringBuilder(br.readLine()).reverse().toString();
         for(int i = 0; i < leftGroup.length(); i++){
             ants.add(new Ant(leftGroup.charAt(i),"l"));
         }
         String rightGroup = br.readLine();
         for(int i = 0; i < rightGroup.length(); i++){
             ants.add(new Ant(rightGroup.charAt(i),"r"));
         }
         st = new StringTokenizer(br.readLine());
         count = Integer.parseInt(st.nextToken());

    }
    public static void main(String[] args) throws IOException {
        input();

        getResult();
    }

    static void getResult() {

        for(int i = 0; i < count; i++){

            for(int j = 0; j < ants.size()-1; j++) {

                //점프 안했고, 그룹이 l이라면
                if(!ants.get(j).isJump && ants.get(j).group.equals("l")  && ants.get(j+1).group.equals("r")){

                }

            }
        }
    }
}
