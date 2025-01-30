package basicjavaprogams;

public class Divisionexercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		division1(3,2);
		
		division2(3,2);
		
		division4(3,2);
		
		division5(3,2);
		
		division5(3,2);

	}
	
	public static void division1 (int a, int b) {
		
		int c;
		
		c=a/b;
		
		System.out.println(c);
		
		return;
	}
	
	public static void division2 (int a, int b) {
		
		double c;
		
		c=a/b;
		
		System.out.println(c);
		
		return;
	}
	
	/*
	public static void division3 (int a, int b) {
		
		int c;
		
		c= (double)a/b;
		
		System.out.println(c);
		
		return;
	}
	*/
	
	public static void division4 (int a, int b) {
		
		double c;
		
		double d,e;
		
		d=a;
		e=b;
		
		c=d/e;
		
		System.out.println(c);
		
		return;
	}
	
	public static void division5 (int a, int b) {
		
		double c;
		
		c= (double)a/b;
		
		System.out.println(c);
		
		return;
	}
	
	public static void division6 (int a, int b) {
		
		double c;
		
		c= a/(double)b;
		
		System.out.println(c);
		
		return;
	}
	

}
