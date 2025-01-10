package basicjavaprogams;

public class findmissingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,6,7,8,9,10};
		
		int output = findMissingNumber(a,1,10);
		
		System.out.println(output);

	}
	
	public static int findMissingNumber(int x[],int start,int end) {
		
		int i=start, j=0, sum=0, actualSum=0,output, value;
		
		while(i<=end) {
			
			sum=sum+i;
			i++;
		}
		
		while(j<x.length) {
			
			value = x[j];
			actualSum=actualSum+x[j];
			j++;
		}
		
		output = sum - actualSum;
		
		return output;
	}

}
