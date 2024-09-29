//9번문제 
package report;

public class javareport12 {
	public static void main(String[] args) {
		int [][] a = new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=(int)(Math.random()*10+1);
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
