//실습문제 11번 문제
class arrUtil {
    public static int[] concat(int[] arr1, int[] arr2){
        int [] arr3 = new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            arr3[i+arr1.length] = arr2[i];
        }
        return arr3;
    }
    public static void print(int[] arr){
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}

public class report12 {
    public static void main(String[] args) {
        int [] arr1 = {1, 5, 7, 9};
        int [] arr2 = {3, 6, -1, 100, 77};
        int [] arr3 = arrUtil.concat(arr1, arr2);
        arrUtil.print(arr3);
    }
}
