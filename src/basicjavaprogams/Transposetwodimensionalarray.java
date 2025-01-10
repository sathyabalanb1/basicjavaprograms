package basicjavaprogams;

public class Transposetwodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = { {2,4,6},{8,10,12},{14,16,18} };
		
		transposeTwoDArray(a);
		
		Printtwodimensionalarray.printTwoDArray(a);

	}
	
	public static void transposeTwoDArray (int x[][]) {
		
		int i=0,j=0,temp;
		
		while(i<x.length) {
			j=i;
			while(j<x.length) {
				
				temp = x[i][j];
				x[i][j] = x[j][i];
				x[j][i] = temp;
				
				j++;
			}
			i++;
		}
		
		return;
	}

}
