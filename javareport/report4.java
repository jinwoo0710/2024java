//실습문제 3번문제
import java.util.*;

class Grade {
    String name;
    int java, web, os;
    Grade(String name, int java, int web, int os) {
        this.name = name;
        this.java = java;
        this.web = web;
        this.os = os;
    }
    String getName() {
        return name;
    }
    int getAverage() {
        return (java+web+os)/3;
    }
}
public class report4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름, 자바, 웹프로그래밍, 운영체제 수느로 점수 입력>>");
        String name = sc.next();
        int java = sc.nextInt();
        int web = sc.nextInt();
        int os = sc.nextInt();
        Grade stGrade = new Grade(name, java, web, os);
        System.out.print(stGrade.getName() + "의 평균은 " + stGrade.getAverage());
        sc.close();
    }
}
