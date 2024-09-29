//7번문제 
package report;

public class javareport10 {
    public static void main(String[] args) {
    	int [] a=new int[10];
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
    }
}
