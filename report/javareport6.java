//3번문제  
package report;
import java.util.*;
public class javareport6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("양의 정수 입력 >> ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}
