package example;

// 유클리드 호제법
//1071과 1029의 최대공약수를 구하면,
//
//        1071은 1029로 나누어떨어지지 않기 때문에, 1071을 1029로 나눈 나머지를 구한다. => 42
//        1029는 42로 나누어떨어지지 않기 때문에, 1029를 42로 나눈 나머지를 구한다. => 21
//        42는 21로 나누어떨어진다.
//        따라서, 최대공약수는 21이다.

//         L = lcm(a, b)은 L= lcm(a, b)= a * b / gcd(a, b)
public class gcdNlcm {
    public static void main(String[] args) {


    }

    public static int gcd(int a, int b) {
        int x = Math.max(a,b);
        int y = Math.min(a,b);

        while(true){
            int r = x % y;
            if(r == 0) break;
            x = y;
            y = r;
        }
        return y;
    }
}
