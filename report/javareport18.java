//15번문제 
package report;
import java.util.*;
public class javareport18 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = 0;
        int secondNumber = 0;
        boolean isInputValid = false;

        while (!isInputValid) {
            System.out.print("곱하고자 하는 정수 2개 입력>> ");
            try {
                firstNumber = input.nextInt();
                secondNumber = input.nextInt();
                isInputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요!");
                input.nextLine();
            }
        }

        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
        input.close();
    }
}