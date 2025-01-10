package basicjavaprogams;

import java.util.Arrays;

public class Subarraymaxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int b[] = {};
		
		int c[] = {-4,3,-2,0,-1,4,-2,5,-1,-3};
		
		int d[] = {-6,-10,-3,64,-40,-4};
		
		int ans[];
		ans=subArrayMaxSum(a);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxSum(b);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxSum(c);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxSum(d);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int[] subArrayMaxSum (int x[]) {
		
		int i=0,j=0,count=0,sum=0,currentSum=0,start=0,end=0,total=0;
		
		int subArray[]=new int[count];
		
		while(i<x.length) {
			j=i;
			currentSum=0;
			while(j<x.length) {
				count++;
				currentSum=currentSum+x[j];
				if(currentSum>sum) {
					start=i;
					end=j;
					total=count;
					sum=currentSum;
					subArray= copyElements(start,end,total,x);
				}
				j++;
			}
			i++;
			count=0;
		}
		
		return subArray;
	}
	
	public static int []  copyElements (int start, int end, int total, int x[]) {
		
		int output[] = new int[total];
		
		int i=start,k=0;
		
		while(i<=end) {
			
			output[k]=x[i];
			k++;
			i++;
		}
		
		return output;
	}

}
