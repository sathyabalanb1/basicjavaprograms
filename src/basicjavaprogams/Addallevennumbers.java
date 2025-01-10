package basicjavaprogams;

public class Addallevennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,4,9,13,7,6,15};
		
		int b[] = {1,3,5,7,9,11,13,15};
		
		int ans;
		ans=addAllEvenNumbers(a);
		System.out.println(ans);
		
		ans=addAllEvenNumbers(b);
		System.out.println(ans);

	}
	
	public static int addAllEvenNumbers (int x[]) {
		
		int i=0,sum=0;
		
		while(i<x.length) {
			if(x[i]%2 == 0) {
				sum=sum+x[i];
			}
			i++;
		}
		
		return sum;
	}

}
