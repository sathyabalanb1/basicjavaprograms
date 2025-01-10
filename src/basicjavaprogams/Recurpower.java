package basicjavaprogams;

public class Recurpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		result = recurPower(2,5);
		System.out.println(result);
		
		result = recurPower(5,0);
		System.out.println(result);
		
		result = recurPower(0,0);
		System.out.println(result);
		
		result = recurPower(0,5);
		System.out.println(result);

	}
	
	public static int recurPower (int n, int a) {
		
		int ans;
		
		if(n==0 && a==0) {
			return 1;
		}else if(n==0 && a!=0) {
			return n;
		}else if(n !=0 && a==1) {
			return n;
		}else if(n !=0 && a==0) {
			return 1;
		}
		
		ans = n*recurPower(n,a-1);
		return ans;
	}

}
