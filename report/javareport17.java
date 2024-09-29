//14번문제 
package report;
import java.util.*;
public class javareport17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String userChoice;

        System.out.println("*** 갬블링게임을 시작합니다. ***");

        do {
            boolean isJackpot = false;

            while (!isJackpot) {
                System.out.print("엔터키 입력>> ");
                input.nextLine();

                int firstNum = random.nextInt(3);
                int secondNum = random.nextInt(3);
                int thirdNum = random.nextInt(3);

                System.out.println(firstNum + " " + secondNum + " " + thirdNum);

                if (firstNum == secondNum && secondNum == thirdNum) {
                    System.out.println("성공! 대박났어요!");
                    isJackpot = true;
                }
            }

            System.out.print("계속하시겠습니까? (yes/no)>> ");
            userChoice = input.nextLine();

        } while (userChoice.equalsIgnoreCase("yes"));

        System.out.println("게임을 종료합니다.");
        input.close();
    }
}
