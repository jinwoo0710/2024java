//8번문제 
package report;
import java.util.*;
public class javareport11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 몇 개를 저장하시겠습니까>>");
		int num = input.nextInt();
		int [] a=new int[num];
    	for(int i=0;i<a.length;i++) {
    		a[i]= (int)(Math.random()*10+1);
    	}
    	double sum=0, avg=0;
    	System.out.print("랜덤한 정수들 >> ");
    	for(int i=0;i<a.length;i++) {
    		System.out.print(a[i]+ " ");
    		sum=sum+a[i];
    	}
    	avg=sum/a.length;
    	System.out.print("\n평균 : "+avg);  
    	
    	input.close();
    }
}
