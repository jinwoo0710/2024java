//실습문제 10번문제
import java.util.*;

class player{
    String name;
    int score;
    player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
public class report10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("*** 예측 게임을 시작합니다. ***\n게임에 참여할 선수 수>>");
        int num = sc.nextInt();
        player[] arr = new player[num];
        for(int i = 0; i < num; i++) {
            System.out.print("참여할 선수의 이름>>");
            String name = sc.next();
            arr[i] = new player(name, 0);
        }

        while(true) {
            int answer = random.nextInt(100) + 1;
            System.out.println("1~100사이의 숫자가 결정되었습니다. 선수들은 맞춰보세요.");
            int dif = 100, difind = 0;
            for(int i = 0; i < num; i++) {
                System.out.print(arr[i].name + ">>");
                int guess = sc.nextInt();
                if(Math.abs(answer - guess) < dif) {
                    System.out.println(Math.abs(answer - guess));
                    dif = Math.abs(answer - guess);
                    difind = i;
                }   
            }
            arr[difind].score++;
            System.out.println("정답은 " + answer + ". " + arr[difind].name + "이 이겼습니다. 승점 1점 확보!");
            System.out.print("계속하려면 yes 입력>>");
            if(sc.next().equals("yes")) {
                continue;
            }else {
                break;
            }
        }
        
        int max = 0;
        for(int i = 0; i < num; i++) {
            System.out.print(arr[i].name + ":" + arr[i].score + " ");
            if(arr[i].score > max) {
                max = i;
            }
        }
        System.out.println(arr[max].name + "이 최종승리하였습니다.");
        sc.close();
    }
}
