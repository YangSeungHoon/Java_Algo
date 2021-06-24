package Programmers;

//https://programmers.co.kr/learn/courses/30/lessons/67256
//[카카오인턴] 키패드 누르기
public class Level_One_KeyPad {


        public String solution(int[] numbers, String hand) {
            int L = 10;
            int R = 12;
            String answer = "";
            for(int i = 0; i <  numbers.length; i++) {
                if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                    answer+='L';
                    L = numbers[i];
                }
                else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                    answer+='R';
                    R = numbers[i];
                }
                else {
                    int distanceL = getDistance(L,numbers[i]);
                    int distanceR = getDistance(R,numbers[i]);

                    if(distanceL > distanceR){
                        answer+='R';
                        R = numbers[i];
                    }
                    else if(distanceL < distanceR) {
                        answer+='L';
                        L = numbers[i];
                    }else{
                        if(hand.equals("right")){
                            answer+='R';
                            R = numbers[i];
                        }else{
                            answer+='L';
                            L = numbers[i];
                        }
                    }
                }
            }

            return answer;
        }

        int getDistance(int location,int number) {

            if (number == 0) {
                number = 11;
            }
            if (location == 0) {
                location = 11;
            }

            int locationX = (location - 1) / 3;
            int locationY = (location - 1) % 3;

            int numberX = (number - 1) / 3;
            int numberY = (number - 1) % 3;

            return Math.abs(locationX - numberX) + Math.abs(locationY - numberY);
        }
}
