//실습문제 13문제
import java.util.*;

class allSit{
    Scanner sc = new Scanner(System.in);
    String arrAll[][] = new String[3][10];
    String grade[] = {"S", "A", "B"};
    void book(){
        System.out.print("좌석구분 S(1), A(2), B(3) >>");
        int gradeNum = sc.nextInt();
        
        System.out.print(grade[gradeNum-1] + ">>");
        for(int i=0; i<10; i++){
            if(arrAll[gradeNum-1][i] == null){
                System.out.print("... ");
            }else{
                System.out.print(arrAll[gradeNum-1][i] + " ");
            }
        }

        System.out.print("\n이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        int sitNum = sc.nextInt();
        arrAll[gradeNum-1][sitNum-1] = name;

        System.out.println(Arrays.toString(arrAll[gradeNum-1]));
    }
    void show(){
        String grade[] = {"S", "A", "B"};
        for(int i=0; i<3; i++){
            System.out.print(grade[i] + ">> ");
            for(int j=0; j<10; j++){
                if(arrAll[i][j] == null){
                    System.out.print(".... ");
                }else{
                    System.out.print(arrAll[i][j] + " ");
                }
            }
            System.out.println("");
        }
        System.out.println("<<조회를 완료하였습니다.>>");
    }
    void cancel(){
        System.out.print("좌석구분 S(1), A(2), B(3) >>");
        int gradeNum = sc.nextInt();
        
        for(int i=0; i<10; i++){
            if(arrAll[gradeNum-1][i] == null){
                System.out.print("... ");
            }else{
                System.out.print(arrAll[gradeNum-1][i] + " ");
            }
        }

        System.out.print("\n이름>>");
        String name = sc.next();
        arrAll[gradeNum-1][Arrays.asList(arrAll[gradeNum-1]).indexOf(name)] = null;
    }
}
public class report14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        allSit all = new allSit();
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 종료:4>>");
            int comNum = sc.nextInt();
            if(comNum == 1){
                all.book();
            }else if(comNum == 2){
                all.show();
            }else if(comNum == 3){
                all.cancel();
            }else{
                break;
            }
        }
        sc.close();
    }
}
 