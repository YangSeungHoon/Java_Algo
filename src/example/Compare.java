package example;

import java.util.Arrays;
import java.util.Comparator;

public class Compare {
    public static void main(String[] args) {
        String[] strArr = {"cat","Dog","lion","tiger"};

        Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
        System.out.println("strArr = " + strArr);

        Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER); //대소문자 구분안함
        System.out.println("strArr = " + strArr);

        Arrays.sort(strArr, new Descending()); //역순 정렬렬
        System.out.println("strArr = " + strArr);
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if( o1 instanceof Comparable && o2 instanceof  Comparable ) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1; // -1을 곱하면 양수는 음수가 될 것이고, 음수는 양수가 될테니, 내림차순이 된다.
            //아니면 c2.compareTo(c1) 이렇게 하는 방법도 존재함.
        }
        return -1;
    }
}


//Comparable - 기본 정렬기준을 구현하는데 사용.
//
//public interface Comparator {
//    int compare(Object o1, Object o2); //얘는 객체 두개를 비교한다.
//    //만약에 두개 비교해서 왼쪽이 크면 양수, 같으면 같은 것, 오른쪽이 크면 음수이다.
//    boolean equals(Object obj);
//}
//
//
////Comparator - 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용.
//public interface Comparable {
//    int compareTo(Object o); //주어진 객체를 자신(this)과 비교
//}
