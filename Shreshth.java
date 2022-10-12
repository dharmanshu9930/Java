
public class MS {
	
	public static void main(String[] args) {
		int rc=5;
		int[][] matrix= new int[rc][rc];
		
		int i;
		int j;
		int[] rsum=new int [rc];
		int[] csum=new int [rc];
		int d1=0;
		int d2=0;
		
		
		int y=rc-1;
		int x=(rc-1)/2;	
		
		for(i=1;i<=rc*rc;i++) {
			matrix[y][x]=i;

			
			
			y++;
			if (y==rc) y=0;
			x++;
			if (x==rc) x=0;

			
			if (matrix[y][x]!=0) {
				y--;
				if (y<0) y=rc-1;
				y--;
				if (y<0) y=rc-1;
				x--;
				if (x<0) x=rc-1;
			}
		}
		
		
		for(i=0;i<rc;i++) {
			for(j=0;j<rc;j++) {
				System.out.print(matrix[i][j]+" ");
				rsum[i]+=matrix[i][j];
				csum[j]+=matrix[i][j];
				
			}
			System.out.println();
			d1+=matrix[i][i];
			d2+=matrix[i][rc-1-i];
			
		}
		
		
		for (int a=0; a<rc; a++) {
				System.out.println("Sum for row "+(a+1)+" = "+rsum[a]);
				System.out.println("Sum for column "+(a+1)+" = "+csum[a]);
			}
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		
	}

}
