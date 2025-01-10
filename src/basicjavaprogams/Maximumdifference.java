package basicjavaprogams;

public class Maximumdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {21,23,27,99,45,105,1};
		
		int b[] = {5,10,2,10,8,14,4,2};
		
		int c[] = {34};
		
		int d[] = {};
		
		maximumDifference(a);
		
		maximumDifference(b);
		
		maximumDifference(c);
		
		maximumDifference(d);

	}
	
	public static void maximumDifference (int x[]) {
		
		int i=0,j=1,sub;
		
		if(x.length == 0 || x.length == 1) {
			System.out.println("Need minimum two elements to find the difference");
			return;
		}
		
		int max;
		
		if(x[i]>x[j]) {
			max = x[j] - x[i];
		}else {
			max = x[i] - x[j];
		}
		
		while(i<x.length) {
			j=i+1;
			while(j<x.length) {
				
				if(x[i]>x[j]) {
					sub = x[i] - x[j];
				}else {
					sub = x[j] - x[i];
				}
				
				if(sub>max) {
					max=sub;
				}
				j++;
			}
			i++;
		}
		
		System.out.println("Maximum difference is: "+ max);
		return;
		
	}

}
