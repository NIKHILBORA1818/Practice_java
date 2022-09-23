//Add Two Matrix Using Multi-dimensional Arrays
public class Main{	
	public static void main(String args[]) {
		int[][] a1 = {{1,3,6},{4,2,5}};
		int[][] a2 = {{7,3,8},{3,1,6}};
		
		int r = 2, c = 3;
		int[][] sum = new int[r][c];
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				sum[i][j] = a1[i][j] + a2[i][j];
			}
		}
		System.out.println("Sum is: ");
		for(int[] rr : sum) {
			for(int cc: rr){
				System.out.print(cc +" ");
			}
			System.out.println();
		}
}
}

/* output:
Sum is: 
8 6 14 
7 3 11 
*/
