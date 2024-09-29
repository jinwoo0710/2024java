package report;
import java.util.Scanner;
public class javareport2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		int tem = Integer.parseInt(Integer.toBinaryString(a & 31),2);
		String ac;
		String run;
		
		if(Integer.parseInt(Integer.toBinaryString(a & 32),2) == 32) {
			ac = "켜져";
		}
		else {
			ac = "꺼져";
		}
		if(Integer.parseInt(Integer.toBinaryString(a & 64),2) == 64) {
			run = "달리는";
		}
		else {
			run = "정지";
		}
		
		System.out.println("자동차는 " + run + "상태이고 에어컨이 " + ac + "상태이고 온도는 " + tem + "도 입니다.");
		input.close();
	}
}