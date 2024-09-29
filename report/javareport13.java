//10번문제 
package report;
import java.util.*;
public class javareport13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] a = new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=(int)(Math.random()*10+1);
				System.out.printf("%2d ", a[i][j]);
			}
		}
		System.out.print("임계값 입력>>");
		int num = input.nextInt();
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(a[i][j] > num) {
					System.out.print(255 + " ");
				}
				else {
					System.out.print(0 + " ");
				}
			}
			System.out.println("");
		}
		input.close();
	}
}
