package report;
import java.util.Scanner;

public class javareport1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		if(a.charAt(7)=='0') {
			System.out.print("전원 꺼져 있음. ");
		}else {
			System.out.print("전원 켜져 있음. ");
		}
		if(a.charAt(6)=='0') {
			System.out.print("문 열려 있음. ");	
		}else {
			System.out.print("문 닫혀 있음. ");
		}
		if(a.charAt(5)=='0') {
			System.out.print("전구 손상됨. ");
		}else {
			System.out.print("전구 정상 작동. ");
		}
		if(a.charAt(4)=='0') {
			System.out.print("냉장고 온도 3도 이상. ");
		}else {
			System.out.print("냉장고 온도 3도 미만. ");
		}
		input.close();
	}

}
