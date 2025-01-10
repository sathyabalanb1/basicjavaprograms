package basicjavaprogams;

public class Reverseprintnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {25,20,15,10,5};
		
		reversePrintNumbers(a);

	}
	
	public static void reversePrintNumbers (int x[]) {
		
		int i=x.length-1;
		
		while(i>=0) {
			
			System.out.print(x[i]+",");
			i--;
		}
		System.out.println();
		return;
	}

}
