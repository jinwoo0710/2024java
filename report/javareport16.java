//13번문제 
package report;
import java.util.*;
public class javareport16 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] subject = {"C", "C++", "python", "Java", "HTML5"};
        String[] grade = {"A", "B+", "B", "A+", "D"};

        System.out.println("***** 과목과 학점을 조회하는 프로그램 *****");

        while (true) {
            System.out.print("과목>> ");
            String enteredSubject = input.nextLine();

            if (enteredSubject.equals("그만")) {
                break;
            }

            boolean isFound = false;

            for (int i = 0; i < subject.length; i++) {
                if (enteredSubject.equalsIgnoreCase(subject[i])) {
                    System.out.println(enteredSubject + " 학점은 " + grade[i] + "입니다.");
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println(enteredSubject + "는 없는 과목입니다.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
        input.close();
    }
}
