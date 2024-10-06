//실습문제 2번문제
class Cube {
    int length, width, height;
    Cube(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    void increase(int length, int width, int height) {
        this.length += length;
        this.width += width;
        this.height += height;
    }
    int getVolume() {
        return length*width*height;
    }
    int isZero(int getVolume){
        if(this.getVolume() == 0){
            return 1;
        }else{
            return 0;
        }
    }
}
public class report3 {

    public static void main(String[] args) {
        Cube cube = new Cube(10, 20, 30);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        cube.increase(5, 5, 5);
        System.out.println("큐브의 부피는 " + cube.getVolume());
        if(cube. isZero(cube.getVolume()) == 1){
            System.out.println("큐브의 부피는 0");
        }else{
            System.out.println("큐브의 부피는 0가 아님");
        }
    }
}
