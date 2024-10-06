//실습문제 4번문제

class Average {
    int sum = 0;
    int count = 0;
    int[] arr = new int[100];
    public void put(int n) {
        sum += n;
        count++;
        arr[count - 1] = n;
    }
    public void showAll() {
        for(int i = 0; i < count; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public double getAverage() {
        return sum / count;
    }
}
public class report5 {
    public static void main(String[] args) {
        Average avg = new Average();
        avg.put(10);
        avg.put(15);
        avg.put(100);
        avg.showAll();
        System.out.println("평균은 " + avg.getAverage());
    }
}
