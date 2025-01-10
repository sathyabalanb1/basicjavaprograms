package basicjavaprogams;

import java.util.Arrays;

public class Subarraymaxprod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,3,-2,4};
		
		int b[] = {};
		
		int c[] = {4,5,0,-1,3,-1,6,-3,0};
		
		int ans[];
		ans=subArrayMaxProd(a);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxProd(b);
		System.out.println(Arrays.toString(ans));
		
		ans=subArrayMaxProd(c);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int [] subArrayMaxProd (int x[]) {
		
		int i=0,j=0,start=0,end=0,prod=1,temp=0,count=0,total=0;
		
		int result[]=new int[0];
		
		while(i<x.length) {
			j=i;
			prod=1;
			while(j<x.length) {
				count++;
				prod=prod*x[j];
				
				if(prod>temp) {
					temp=prod;
					start=i;
					end=j;
					total=count;
					result = Subarraymaxsum.copyElements(start, end, total, x);
				}
				j++;
			}
			i++;
			count=0;
		}
		
		return result;
	}

}
