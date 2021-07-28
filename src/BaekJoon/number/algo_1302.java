package BaekJoon.number;

import java.util.*;

//https://www.acmicpc.net/problem/1302
//베스트셀러
public class algo_1302 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < amount; i++) {
           String book = sc.next();
            if(!map.containsKey(book)){
               map.put(book,1);
           }else{
                map.put(book,map.get(book)+1);
            }
        }

        int max = 0;
        List<String> bookList = new ArrayList<>(map.keySet());
        Collections.sort(bookList);

        for(String s : map.keySet()){
           max = Math.max(max,map.get(s));
        }

        for(String s: bookList){
            if(max == map.get(s)){
                System.out.println(s);
                break;
            }
        }



    }
}
