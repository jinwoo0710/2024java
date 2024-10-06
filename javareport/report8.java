//실습문제 7번문제
class Memo{
    String name, time, content;
    Memo(String name, String time, String content){
        this.name = name;
        this.time = time;
        this.content = content;
    }
    void show() {
        System.out.println(name + ", " + time + " " + content);
    }
    boolean isSameName(Memo m) {
        if(this.name.equals(m.name)) {
            return true;
        } else {
            return false;
        }
    }
    String getName() {
        return name;
    }
    int length() {
        return content.length();
    }
}
public class report8 {
    public static void main(String[] args) {
        Memo a = new Memo("유송연", "10:10", "자바과제 있음");
        Memo b = new Memo("박채원", "10:15", "시카고로 어학연수가요!");
        Memo c = new Memo("김경미", "11:30", "사랑하는 사람이 생겼어요");

        a.show();
        b.show();
        c.show();

        if(a.isSameName(b)) {
            System.out.println("동일한 사람입니다." );
        } else {
            System.out.println("다른 사람입니다.");
        }

        System.out.println(a.getName() + "가작성한 메모의 길이는 " + a.length());
        System.out.println(b.getName() + "가작성한 메모의 길이는 " + b.length());
        System.out.println(c.getName() + "가작성한 메모의 길이는 " + c.length());
    }
}
