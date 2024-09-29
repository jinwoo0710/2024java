//11번 문제 
package report;
import java.util.*;
public class javareport14 {
    public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);
    	 int i=0, wrong=0;
    	 System.out.println("**** 구구단을 맞추는 퀴즈입니다. ****.");
    	 while(true) {
    		 if(wrong == 3) {
    			break;
    		 }
    		 
    		 int a = (int)(Math.random()*10+1);
    		 int b = (int)(Math.random()*10+1);
    		 System.out.print(a+"X"+b+"=");
    		 
    		 int ans = input.nextInt();
    		 if(a*b==ans) {
    			 System.out.println("정답입니다. 잘했습니다.");
    		 }else {
    			 wrong += 1;
    			 System.out.print(wrong+"번 틀렷습니다. ");
    			 if(wrong==3) {
    				 System.out.println("퀴즈를 종료합니다.");
    			 }else {
    				 System.out.println("분발하세요. ");
    			 }
    		 }
    	 }
    }
}
