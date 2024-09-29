//16번문제 
package report;
import java.util.*;
public class javareport19 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요. (입력 끝은 'end') >> ");
        
        String userInput = input.nextLine();
        String[] numberStrings = userInput.split(" ");
        
        int totalSum = 0;
        int positiveCount = 0;

        for (String numberString : numberStrings) {
            try {
                int num = Integer.parseInt(numberString);
                if (num > 0) {
                    totalSum += num;
                    positiveCount++;
                } else {
                    System.out.println(num + " 제외");
                }
            } catch (NumberFormatException e) {
                System.out.println(numberString + " 제외");
            }
        }

        if (positiveCount > 0) {
            double averageValue = (double) totalSum / positiveCount;
            System.out.printf("평균은 %.2f\n", averageValue);
        } else {
            System.out.println("양의 정수가 입력되지 않았습니다.");
        }

        input.close();
    }
}
