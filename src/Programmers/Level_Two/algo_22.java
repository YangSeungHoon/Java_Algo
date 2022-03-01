package Programmers.Level_Two;

import java.util.*;

//https://programmers.co.kr/learn/courses/30/lessons/42888
public class algo_22 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        HashMap<String, String> action = new HashMap<String,String>(){{//초기값 지정
            put("Enter","님이 들어왔습니다.");
            put("Leave","님이 나갔습니다.");
        }};
        List<String> answer = new ArrayList<>();
        HashMap<String,String> users = new HashMap<>();
        String[] input = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        for(int i = 0; i < input.length; i++) {

            String[] actions = input[i].split(" ");

            // 유저가 없고, 넣어줄 이름이 있으면 유저 등록한다.
            if (!actions[0].equals("Leave")) {
                users.put(actions[1], actions[2]);
            }
        }

        for(int i = 0 ; i < input.length; i++) {

            String[] actions = input[i].split(" ");

            //Change빼고 나머지 answer에 넣어줘야 함.
            if(!actions[0].equals("Change")){
                StringBuilder sb = new StringBuilder();
                sb.append(users.get(actions[1]));
                sb.append(action.get(actions[0]));
                answer.add(sb.toString());
            }
        }

        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}
