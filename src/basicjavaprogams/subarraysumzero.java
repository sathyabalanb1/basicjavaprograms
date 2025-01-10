package basicjavaprogams;

import java.util.Arrays;

public class subarraysumzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,2,-3,1,6};
		
		int b[] = {2,0,8,1,23};
		
		int c[] = {33,-4,2,5,-3,6,0};
		
		int ans[];
		ans = returnZeroSumSubArray(a);
		System.out.println(Arrays.toString(ans));
		
		ans = returnZeroSumSubArray(b);
		System.out.println(Arrays.toString(ans));
		
		ans = returnZeroSumSubArray(c);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int [] returnZeroSumSubArray (int x[]) {
		
		int i=0,j=0,count=0,sum=0,start,end;
		
		int output[];
		
		while(i<x.length) {
			
			j=i;
			sum=0;
			count=0;
			while(j<x.length) {
				
				count++;
				sum=sum+x[j];
				if(sum==0) {
					start=i;
					end=j;
					output = copyElements(start,end,count,x);
					return output;
				}
				j++;
			}
			i++;
		}
		
		return x;
	}
	
	public static int [] copyElements (int start, int end, int count, int x[]) {
		
		int i=start,k=0;
		
		int output[] = new int[count];
		
		while(i<=end) {
			
			output[k]=x[i];
			k++;
			i++;
		}
		
		return output;
	}

}
