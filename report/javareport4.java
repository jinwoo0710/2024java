//1번문제 
// (1) : i의 값이 1부터 50까지 3의 배수로 증가하는 등비수열을 계산하는 코드.
package report;
import java.util.*;

public class javareport4 {

	public static void main(String[] args) {
		int sum = 0;
//(2)---------------------------------------
		int i=1;
		while(true) {
			if(i>50) {
				break;
			}
			sum += i;
			i += 3;
		}
//(3)---------------------------------------
		for(int i=1; i<50; i+=3) {
			sum += i;
		}
//(4)---------------------------------------
		int i = 1;
		do {
			sum +=i;
			i += 3;
		}while(i<50);
	}

}
