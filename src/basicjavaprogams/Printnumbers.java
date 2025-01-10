package basicjavaprogams;

public class Printnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {11,12,13,14,15};
		
		printNumbers(a);

	}
	
	public static void printNumbers (int x[]) {
		
		int i=0;
		
		while(i<x.length) {
			
			System.out.print(x[i]+",");
			i++;
		}
		System.out.println();
		return;
	}

}
