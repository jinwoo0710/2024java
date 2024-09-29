//4번문제 
package report;
public class javareport7 {

	public static void main(String[] args) {
		int ar[][] = {{1, 2, 3}, {1, 2}, {1}, {1, 2, 3}, {1, 2, 3, 4}};
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println("");
		}

	}

}
