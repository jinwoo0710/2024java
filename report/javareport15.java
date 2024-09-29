//12번문제 
package report;
import java.util.*;
public class javareport15 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] boyMiddleNames = {"기", "민", "용", "종", "현", "진", "재", "승", "소", "상", "지"};
        String[] boyLastNames = {"태", "진", "광", "혁", "우", "철", "빈", "준", "구", "호", "석"};
        String[] girlMiddleNames = {"은", "원", "경", "수", "현", "예", "여", "송", "서", "채", "하"};
        String[] girlLastNames = {"진", "연", "경", "서", "리", "숙", "미", "원", "린", "희", "수"};

        System.out.println("***** 작명 프로그램이 실행됩니다. *****");

        while (true) {
            System.out.print("남/여 선택>> ");
            String selectedGender = input.next();

            if (selectedGender.equals("그만")) {
                break;
            }

            if (selectedGender.equals("남")) {
                System.out.print("성 입력>> ");
                String firstName = input.next();
                String middleName = boyMiddleNames[random.nextInt(boyMiddleNames.length)];
                String lastName = boyLastNames[random.nextInt(boyLastNames.length)];
                String fullName = firstName + middleName + lastName;
                System.out.println("추천 이름: " + fullName);
            } else if (selectedGender.equals("여")) {
                System.out.print("성 입력>> ");
                String firstName = input.next();
                String middleName = girlMiddleNames[random.nextInt(girlMiddleNames.length)];
                String lastName = girlLastNames[random.nextInt(girlLastNames.length)];
                String fullName = firstName + middleName + lastName;
                System.out.println("추천 이름: " + fullName);
            } else {
                System.out.println("남/여/그만 중에서 입력하세요!");
            }
        }

        System.out.println("프로그램을 종료합니다.");
        input.close();
    }
}
