package basicjavaprogams;

public class Minimumdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,13,21,16,5,43};
		
		int b[] = {9,13,7,11,22,6,1,0};
		
		int c[] = {};
		
		int d[] = {99};
		
		minimumDifference(a);
		
		minimumDifference(b);
		
		minimumDifference(c);
		
		minimumDifference(d);

	}
	
	public static void minimumDifference (int x[]) {
		
		int i=0,j=1,sub;
		
		if(x.length == 0 || x.length == 1) {
			System.out.println("Need minimum two elements to find the difference");
			return;
		}
		
		int min;
		
		if(x[i]>x[j]) {
			min =x[i]-x[j];
		}else {
			min = x[j]-x[i];
		}
		
		while(i<x.length) {
			j=i+1;
			while(j<x.length) {
				if(x[i]>x[j]) {
					sub = x[i] - x[j];
				}else {
					sub = x[j] - x[i];
				}
				
				if(sub<min) {
					min=sub;
				}
			j++;
			}
			i++;
		}
		
		System.out.println("Minimum Difference is: "+min);
		return;
	}

}
