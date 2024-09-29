//2번문제 
// (1) : 배열에서 4의 배수만 출력하는 코드.
package report;
import java.util.*;

public class javareport5 {

	public static void main(String[] args) {
		int n[] = {1, -2, 25, 16, 30, 32};
//(2)---------------------------------------
		for(int i=1; i<n.length; i++) {
			if(n[i]>0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
		}
//(3)---------------------------------------
		int i=0;
		while(i<n.length) {
			if(n[i]>0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
			i ++;
		}
//(4)---------------------------------------
		int i = 0;
		do {
			if(n[i]>0 && n[i] % 4 == 0) {
				System.out.print(n[i] + " ");
			}
			i ++;
		}while(i<n.length);
	}

}
