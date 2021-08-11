package BaekJoon.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//https://www.acmicpc.net/problem/10825
//국영수
public class algo_10825 {

    static BufferedReader br;
    static StringTokenizer st;
    static int N;
    static Student studentList[];
    static StringBuilder sb;
    public static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        studentList = new Student[N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korScore = Integer.parseInt(st.nextToken());
            int engScore = Integer.parseInt(st.nextToken());
            int mathScore = Integer.parseInt(st.nextToken());
            Student st = new Student(name,korScore,engScore,mathScore);
            studentList[i] = st;
        }
    }
    public static void main(String[] args) throws IOException {

        input();
        Arrays.sort(studentList);
        sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(studentList[i].name).append('\n');
        }
        System.out.println(sb.toString());
    }

    public static class Student implements Comparable<Student>{
        String name;
        int korScore;
        int engScore;
        int mathScore;

        public Student(String name, int korScore, int engScore, int mathScore) {
            this.name = name;
            this.korScore = korScore;
            this.engScore = engScore;
            this.mathScore = mathScore;
        }

        @Override
        public int compareTo(Student other) {
            if (korScore != other.korScore) return other.korScore - korScore;
            if (engScore != other.engScore) return engScore - other.engScore;
            if (mathScore != other.mathScore) return other.mathScore - mathScore;
            return name.compareTo(other.name);
        }
    }

}
