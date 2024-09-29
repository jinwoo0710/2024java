package report;
import java.util.*;
public class javareport3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		
		int min = 0;
		int max = 99;
		while(true) {
			int num = random.nextInt(100);
			System.out.println("수를 결정했습니다. 맞춰보세요.");
			int i = 1;
			while(true) {
				System.out.print(i+">>");
				int a = input.nextInt();
				if(a == num) {
					break;
				}
				
				if(a<num) {
					System.out.println("더 높게");
					min = a;
				}else {
					System.out.println("더 낮게");
					max = a;
				}
				
				System.out.println(min+"-"+max);
				i++;
			}
			System.out.println("맞았습니다.");
			System.out.print("다시하시겠습니까?(y/n)>>");
			String ans = input.next();
			
			if(ans.equals("y")) {
				min =0;
				max = 99;
				continue;
			}else {
				break;
			}
		}
		input.close();
	}
	
}


