//18번 문제 
package report;
import java.util.*;

public class javareport21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int[] sco = new int[10];

        System.out.println("10명 학생의 학번과 점수 입력");

        for (int i = 0; i < 10; i++) {
            System.out.print((i+1) + ">> ");
            try {
            	arr[i] = input.nextInt();
            	sco[i] = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("경고!! 정수를 입력하세요.");
                input.nextLine();
                i--;
            }
        }

        while (true) {
            System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>> ");
            int choice;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("경고!! 정수를 입력하세요.");
                input.nextLine();
                continue;
            }

            if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (choice == 1) {
                System.out.print("학번>> ");
                int id;
                try {
                    id = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("경고!! 정수를 입력하세요.");
                    input.nextLine();
                    continue;
                }

                boolean found = false;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == id) {
                        System.out.println(id + "점수는 " + sco[i] + "점입니다.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println(id + "의 학생은 없습니다.");
                }

            } else if (choice == 2) {
                System.out.print("점수>> ");
                int score;
                try {
                    score = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("경고!! 정수를 입력하세요.");
                    input.nextLine();
                    continue;
                }

                StringBuilder studentList = new StringBuilder();
                for (int i = 0; i < sco.length; i++) {
                    if (sco[i] == score) {
                        studentList.append(arr[i]).append(" ");
                    }
                }

                if (studentList.length() > 0) {
                    System.out.println("점수가 " + score + "인 학생은 " + studentList.toString().trim() + "입니다.");
                } else {
                    System.out.println("점수가 " + score + "인 학생은 없습니다.");
                }

            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }

        input.close();
    }
}
