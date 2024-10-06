//실습문제 10번문제

import java.util.Scanner;

class dayDiary{
    int day;
    String content;
}
class monthDiary{
    Scanner sc = new Scanner(System.in);
    dayDiary[] md = new dayDiary[30];
    void run(){
        System.out.println("***** 2024년 10월 다이어리 *****");
        while(true){
            System.out.print("기록:1, 보기:2, 종료3>>");
            int num = sc.nextInt();
            if(num == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if (num == 1) {
                System.out.print("날짜(1~30)와 텍스트(빈칸없이 4글자이하)>>");
                String intput = sc.next();
                String[] inputArr = intput.split(",");
                System.out.println(inputArr[0] + inputArr[1]);
                int day = Integer.parseInt(inputArr[0]);
                md[day-1] = new dayDiary();
                md[day-1].day = day;
                md[day-1].content = inputArr[1];
            }else{
                for (int i = 0; i < 30; i++) {
                    if(i%7 == 0){
                        System.out.println("");
                    }
                    if (md[i] == null) {
                        System.out.print(".... ");
                    }else{
                        System.out.print(md[i].content+" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
public class report11 {
    public static void main(String[] args) {
        monthDiary md = new monthDiary();
        md.run();
    }
}
