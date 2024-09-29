//17번 문제 
package report;

import java.util.Scanner;

public class javareport20 {
    public static void main(String[] args) {
        String[] coffeeMenu = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
        int[] coffeePrices = {3000, 3500, 4000, 5000};

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("핫아메리카노, 아이스아메리카노, 카푸치노, 라떼 있습니다.");

        while (true) {
            System.out.print("주문>> ");
            String order = inputScanner.nextLine();

            if (order.equals("그만")) {
                break;
            }

            String[] orderParts = order.split(" ");
            if (orderParts.length != 2) {
                System.out.println("잘못된 주문 형식입니다. 다시 입력해주세요.");
                continue;
            }

            String coffeeType = orderParts[0];
            String quantityStr = orderParts[1];
            int quantity;

            try {
                if (quantityStr.endsWith("잔")) {
                    quantityStr = quantityStr.substring(0, quantityStr.length() - 1);
                }
                quantity = Integer.parseInt(quantityStr);
                if (quantity <= 0) {
                    System.out.println("잔 수는 양의 정수로 입력해주세요!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("잔 수는 양의 정수로 입력해주세요!");
                continue;
            }

            int coffeeIndex = -1;
            for (int i = 0; i < coffeeMenu.length; i++) {
                if (coffeeMenu[i].equals(coffeeType)) {
                    coffeeIndex = i;
                    break;
                }
            }

            if (coffeeIndex != -1) {
                int totalCost = coffeePrices[coffeeIndex] * quantity;
                System.out.println("가격은 " + totalCost + "원입니다.");
            } else {
                System.out.println(coffeeType + "은 없는 메뉴입니다.");
            }
        }

        inputScanner.close();
    }
}
