package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//https://programmers.co.kr/learn/courses/30/lessons/42889
//실패율
public class Level_One_algo14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};

        int[] answer = new int[N];
        double people = stages.length;
        double[] countStages = new double[N+1];

        for(int i = 0; i < stages.length; i++) {
            if(stages[i] == N +1 ) continue;
            countStages[stages[i]] += 1;
        }

        ArrayList<Double> sortList = new ArrayList<>();
        for(int i = 1; i < countStages.length; i++) {
            double temp = countStages[i];

            if(people == 0) {
                countStages[i] = 0;
            }else {
                countStages[i] /= people;
                people -= temp;
            }
            sortList.add(countStages[i]);
        }
        Collections.sort(sortList,Collections.reverseOrder());

        for(int i=0; i<sortList.size(); i++){

            for(int j=1; j<countStages.length; j++){

                if(sortList.get(i) == countStages[j]){

                    answer[i] = j;

                    countStages[j] = -1;

                    break;

                }

            }

        }
        for(int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
