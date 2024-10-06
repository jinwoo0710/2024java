//실습문제 5번문제
class Song{
    String title, singer, lang;
    int year;
    Song(String title, String singer, int year, String lang) {
        this.title = title;
        this.singer = singer;
        this.lang = lang;
        this.year = year;
    }
    void show() {
        System.out.println(year + "년 " + lang + "의 " + singer + "가 부른 " + title);
    }
}
public class report6 {
    public static void main(String[] args) {
        Song song = new Song("가로수 그늘 아래 서면", "이문세", 1988, "한국");
        song.show();
    }
}
