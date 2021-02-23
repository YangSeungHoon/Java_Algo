package Programmers;
import java.util.PriorityQueue;

//프로그래머스 Heap 1번
public class ProgrammersHeap01 {
    public int solution(int[] scoville, int K) {
        int count = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();

        for (int e : scoville) {
            heap.offer(e); // 우선순위 큐에 배열의 값들을 넣어준다.
        }
        while (heap.peek() <= K) { // 전체의 맵기가 K를 넘어야하니까 heap에서 제일 낮은애가 K를 넘으면 다 넘은 것이다.
            if (heap.size() == 1) { //더할거 다 더하고 값이 하나 남았는데 K를 못넘겼으면 그냥 -1이다.
                return -1;
            }
            int a = heap.poll(); //젤 낮은애 꺼내고
            int b = heap.poll(); // 그담 낮은애 꺼내고


            int result = a + (b * 2);

            heap.offer(result); // 젤 낮은애 그담 낮은애 결과값 다시 넣어주고..
            count ++;
        }
        return count;
    }
}



//Priority Queue의 특징
// 1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조(이 문제에서 나는 맵기가 가장 낮은 녀석과 그 다음 낮은 녀석을 뽑아내야함.)
// 2. 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있음.
// 3. 내부구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NLogN)임.


//    //int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
//    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//
//    //int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
//    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

//        priorityQueue.poll();       // priorityQueue에 첫번째 값을 반환하고 제거 비어있다면 null
//        priorityQueue.remove();     // priorityQueue에 첫번째 값 제거
//        priorityQueue.clear();      // priorityQueue에 초기화

//Priority Queue에서 우선순위가 가장 높은 값 출력하기.
//PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();//int형 priorityQueue 선언
//        priorityQueue.offer(2);     // priorityQueue에 값 2 추가
//        priorityQueue.offer(1);     // priorityQueue에 값 1 추가
//        priorityQueue.offer(3);     // priorityQueue에 값 3 추가
//        priorityQueue.peek();       // priorityQueue에 첫번째 값 참조 = 1