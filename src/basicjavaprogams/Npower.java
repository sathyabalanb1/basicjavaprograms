package basicjavaprogams;

public class Npower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans;
		ans=nPower(5,0);
		System.out.println(ans);
		
		ans=nPower(5,3);
		System.out.println(ans);
		
		ans=nPower(2,5);
		System.out.println(ans);
		
		ans=nPower(0,0);
		System.out.println(ans);

	}
	
	public static int nPower (int n, int power) {
		
		int i=1,prod=1;
		
		while(i<=power) {
			
			prod=prod*n;
			i++;
		}
		
		return prod;
	}

}
