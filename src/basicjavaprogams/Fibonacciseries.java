package basicjavaprogams;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fibonacciSeries(0);
		
		fibonacciSeries(1);
		
		fibonacciSeries(2);
		
		fibonacciSeries(10);
		
		fibonacciSeries(40);

	}
	
	public static void fibonacciSeries (int n) {
		
		int output=0,sum=0,temp=1,i=0,iter=0;
		
		if(n==0) {
			System.out.println("Minimum base input is 1");
			return;
		}else if(n==1) {
			System.out.println(output);
			return;
		}else {
			System.out.print(output+" ");
			iter++;
		}
		
		while(i<=n) {
			output=sum+temp;
			if(output<=n && iter<n) {
			System.out.print(output+" ");
			}
			iter++;
			temp=sum;
			sum=output;
			i=output;
		}
		
		System.out.println();
		return;
	}

}
