package basicjavaprogams;

public class Findaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {79,87,92,84,87};
		
		double ans;
		ans = findAverage(a);
		System.out.println(ans);

	}
	
	public static double findAverage (int x[]) {
		
		int i=0,total=0;
		
		while(i<x.length) {
			
			total = total+x[i];
			i++;
		}
		
		return (double)total/x.length;
	}

}
