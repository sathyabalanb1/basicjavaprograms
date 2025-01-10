package basicjavaprogams;

public class Printtwodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = { {2,4,6},{8,10,12},{14,16,18} };
		
		printTwoDArray(a);

	}
	
	public static void printTwoDArray (int x[][]) {
		
		int i=0,j=0;
		
		while(i<x.length) {
			j=0;
			while(j<x[i].length) {
				
				System.out.print(x[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		return;
	}

}
