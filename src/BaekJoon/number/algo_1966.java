package BaekJoon.number;


import java.util.LinkedList;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1966
// 프린터 큐
public class algo_1966 {

    public static class Paper {
        boolean isTarget;
        int prior;
        public Paper(boolean b, int nextInt) {
            this.isTarget = b;
            this.prior = nextInt;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int amount = sc.nextInt();
            int target = sc.nextInt();
            int count = 0;
            LinkedList<Paper> queue = new LinkedList<>();
            for (int j = 0; j < amount; j++) {
                    queue.add(new Paper(false, sc.nextInt()));
            }
            queue.get(target).isTarget = true;

            while (!queue.isEmpty()) {

                boolean check = true;
                int max = queue.peek().prior;
              for(Paper p : queue){
                  if(max < p.prior) {
                      check = false;
                      break;
                  }
              }

              if(!check){
                  Paper p = queue.poll();
                  queue.add(p);
              }else {
                  if(queue.peek().isTarget) {
                      count++;
                      break;
                  }else {
                      count++;
                      queue.poll();
                  }

              }
            }
            System.out.println(count);
        }
    }
}