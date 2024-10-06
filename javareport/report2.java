//실습문제 1번문제
class Tv {
    String company;
    int size, price;
    Tv(String company, int size, int price) {
        this.company = company;
        this.size = size;
        this.price = price;
    }
    void show() {
        System.out.println(company+"에서 만든 "+price+"만원짜리의 "+size+"인치 TV");
    }
}
public class report2 {
    public static void main(String[] args) {
        Tv tv = new Tv("Samsung", 300, 50);
        tv.show();
    }
}

