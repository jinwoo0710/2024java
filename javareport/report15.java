//실습문제 14번문제
import java.util.*;

class VArray {
    int arrSize;
    int[] arr = new int[0];
    VArray(int arrSize) {
        this.arrSize = arrSize;
    }
    int capacity() {
        return arrSize; 
    }
    int size() {
        return arr.length;
    }
    void add(int num) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = num;
        arr = newArr;
        if(arr.length > arrSize) {arrSize *= 2;}
    }
    void inset(int index, int num) {
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        for(int i=newArr.length; i>index; i--){
            newArr[i-1] = newArr[i-2];
        }
        newArr[index] = num;
        arr = newArr;
    }
    void remove(int index) {
        if(index >= arr.length) {return;}
        int[] newArr = new int[arr.length - 1];
        for(int i=index; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        System.arraycopy(arr, 0, newArr, 0, newArr.length);
        arr = newArr;
    }
    void printAll() {
        System.out.println(Arrays.toString(arr));
    }
}
public class report15 {
    public static void main(String[] args) {
        VArray v = new VArray(5);
        System.out.println("용량: " + v.capacity() + ", 저장된 갯수: " + v.size() );

        for(int i=0; i<7; i++) {
            v.add(i);
        }
        System.out.println("용량: " + v.capacity() + ", 저장된 갯수: " + v.size() );
        v.printAll();

        v.inset(3, 100);
        v.inset(5, 500);
        System.out.println("용량: " + v.capacity() + ", 저장된 갯수: " + v.size() );
        v.printAll();

        v.remove(10);
        System.out.println("용량: " + v.capacity() + ", 저장된 갯수: " + v.size() );
        v.printAll();
        
        for(int i=50; i<55; i++) {
            v.add(i);
        }
        System.out.println("용량: " + v.capacity() + ", 저장된 갯수: " + v.size() );
        v.printAll();
    }
}
