//5번문제 
package report;
import java.util.*;

public class javareport8 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하시오.>> ");
		int [] a=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=input.nextInt();
		}
		System.out.print("3의 배수는 >> ");
		for(int i=0;i<10;i++) {
			if(a[i]%3==0)
				System.out.print(a[i]+" ");
		}
	}
}

