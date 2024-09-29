//6번문제 
package report;
import java.util.*;

public class javareport9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("양의 정수 10개를 입력하세요:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("자리수의 합이 9인 숫자:");
        for (int i = 0; i < 10; i++) {
            int num = numbers[i];
            int sum = 0;
            
            while (num > 0) {
                sum += num % 10;
                num /= 10;       
            }
            if (sum == 9) {
                System.out.println(numbers[i]);
            }
        }
        input.close();
		
	}
}

