package basicjavaprogams;

public class Horizontallineprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		horizontalLinePrinting(3,5,4);
		
		horizontalLinePrinting(0,0,0);
		
		horizontalLinePrinting(5,1,3);

	}
	
	public static void horizontalLinePrinting (int a, int b, int c) {
		
		int i=0,j=0,k=0;
		
		while(i<a) {
			System.out.print("-"+" ");
			i++;
		}
		
		System.out.println();
		
		while(j<b) {
			System.out.print("-"+" ");
			j++;
		}
		
		System.out.println();
		
		while(k<c) {
			System.out.print("-"+" ");
			k++;
		}
		
		System.out.println();
		return;
	}

}
