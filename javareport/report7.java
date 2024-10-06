//실습문제 6번문제
class Rectangle {
    int x, y, width, height;
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    void show(){
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }
    boolean isSquare(){
        if(width == height){
            return true;
        }else{
            return false;
        }
    }
    boolean contains(Rectangle r){
        if((x <= r.x && y <= r.y) && (x+width >= r.x+r.width && y+height >= r.y+r.height)){
            return true;
        }else{
            return false;
        }
    }
        
}
public class report7 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(3, 3, 6, 6);
        Rectangle b = new Rectangle(4, 4, 2, 3);
        
        a.show();
        if(a.isSquare()){
            System.out.println("a는 정사각형은 정사각형입니다.");
        }else{
            System.out.println("a는 정사각형은 정사각형이 아닙니다.");
        }
        b.show();
        if(b.isSquare()){
            System.out.println("b는 정사각형은 정사각형입니다.");
        }else{
            System.out.println("b는 정사각형은 정사각형이 아닙니다.");
        }

        if(a.contains(b)){
            System.out.println("a는 b를 포함합니다.");
        }else{
            System.out.println("a는 b를 포함하지 않습니다.");
        }
    
    }
}
