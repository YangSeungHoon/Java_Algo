package BaekJoon.number;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1939
//중량제한
public class algo_1939 {

    public static ArrayList<Node> list[];
    public static int s;
    public static int e;
    public static boolean visit[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        list = new ArrayList[n+1];
        for(int i = 0; i < list.length;i++){
            list[i] = new ArrayList<>();
        }

        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int cost = sc.nextInt();
            max = Math.max(max,cost);
            min = Math.min(min,cost);
            list[x].add(new Node(y,cost));
            list[y].add(new Node(x,cost));
        }

        int result = 0;
        s= sc.nextInt();
        e = sc.nextInt();
        while(min <= max){
            int mid = (min+max)/2;
            visit = new boolean[n+1];
            if(bfs(mid)){
               min = mid+1;
               result = mid;
            }else {
                max = mid-1;
            }
        }

        System.out.println(result);
    }

    public static boolean bfs(int mid){
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visit[s] = true;

        while(!q.isEmpty()){
            int temp = q.poll();

            if(temp == e)return true;

            for(int i = 0; i < list[temp].size(); i++){
                if(list[temp].get(i).cost >= mid && visit[list[temp].get(i).n] == false){
                    q.offer(list[temp].get(i).n);
                    visit[list[temp].get(i).n] = true;
                }
            }
        }
        return false;
    }

    public static class Node {
        int n;
        int cost;

        public Node(int n, int cost){
            this.n = n;
            this.cost = cost;
        }
    }
}


//    //n = 섬의 갯수
//    //m =다리의 정보 갯수
//    static int n, s, e;
//    static ArrayList<Node> list[];
//    static boolean[] visited;
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        n = scan.nextInt();
//        int m = scan.nextInt();
//
//        list = new ArrayList[n + 1];
//        for(int i = 0; i < n + 1; i++) {
//            list[i] = new ArrayList<>();
//        }
//
//        int max = 0;
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i < m; i++) {
//            int x = scan.nextInt();
//            int y = scan.nextInt();
//            int cost = scan.nextInt();
//            max = Math.max(cost, max); //가능한 가장 큰 cost찾기
//            min = Math.min(cost, min); //가장 작은 cost찾기.
//            list[x].add(new Node(y, cost)); //list[x]에 y의 노드와 그 cost 저장  양방향 연결이니까.
//            list[y].add(new Node(x, cost)); //list[y]에 x의 노드와 그 cost 저장
//        }
//
//        s = scan.nextInt(); //start 지점
//        e = scan.nextInt(); //end 지점
//
//        //여기부터 binary search 시작
//       int result = 0;
//        while(min <= max) {
//            int mid = (min + max) / 2;
//            visited = new boolean[n + 1];
//
//            if(bfs(mid)) { //s ~ e까지 mid의 중량이 건널 수 있는지 확인.
//                min = mid + 1;
//                result = mid;
//            } else {
//                max = mid - 1;
//            }
//        }
//        System.out.println(result);
//    }
//
//    public static boolean bfs(int mid) {
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(s);
//        visited[s] = true;
//
//        while(!q.isEmpty()) {
//            int temp = q.poll();
//
//            if(temp == e) return true;
//
//            for(int i = 0; i < list[temp].size(); i++) {
//                if(list[temp].get(i).cost >= mid && visited[list[temp].get(i).n] == false) {
//                    visited[list[temp].get(i).n] = true;
//                    q.offer(list[temp].get(i).n);
//                }
//            }
//        }
//        return false;
//    }
//
//    public static class Node{
//        int n;
//        int cost;
//
//        public Node(int n, int cost) {
//            this.n = n;
//            this.cost = cost;
//        }
//    }
//}
