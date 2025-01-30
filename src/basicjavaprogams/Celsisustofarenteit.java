package basicjavaprogams;

public class Celsisustofarenteit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ans;
		ans=celToFar(32);
		System.out.println(ans);
		
		ans=celToFar(0);
		System.out.println(ans);
		
		ans=celToFar(100);
		System.out.println(ans);
		
		ans=celToFar(-40);
		System.out.println(ans);

	}
	
	public static double celToFar (int c) {
		
		double f;
		
		f= (9.0/5*c)+32;
		
		return f;
	}

}
