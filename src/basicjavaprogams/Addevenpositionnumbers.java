package basicjavaprogams;

public class Addevenpositionnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,4,6,8,10};
		
		int b[] = {1,3,5,7,9};
		
		int ans;
		ans = addEvenPositionNumbers(a);
		System.out.println(ans);
		
		ans = addEvenPositionNumbers(b);
		System.out.println(ans);

	}
	
	public static int addEvenPositionNumbers (int x[]) {
		
		int i=0,sum=0;
		
		while(i<x.length) {
			
			if(i%2==0) {
				sum = sum + x[i];
			}
			i++;
		}
		
		return sum;
	}

}
