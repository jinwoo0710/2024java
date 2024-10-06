import java.util.*;
public class report1 {
	public static void main(String[] args) {
        

		Scanner sc = new Scanner(System.in);
		System.out.print("끝말잇기 게임을 시작합니다...\n게임에 참가하는 인원은 몇명입니까>>");
		int num = sc.nextInt();

        String nameArr[] = new String[num];
        for(int i = 0; i < num; i++) {
            System.out.print("참가자의 이름를 입력하십세요.>>");
            nameArr[i] = sc.next();
        }

        String startVoca = "아버지";
        System.out.println("시작하는 단어는 "+startVoca);
		sc.close();
	}

}
