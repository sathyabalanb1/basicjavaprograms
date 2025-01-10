package basicjavaprogams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Morethanquotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,1,2,2,1,2,3,3};
		
		int b[] = {1,2,3,4,5};
		
		int c[] = {4};
		
		int d[] = {};
		
		int ans[];
		ans=moreThanQuotient(a,4);
		System.out.println(Arrays.toString(ans));
		
		ans=moreThanQuotient(b,6);
		System.out.println(Arrays.toString(ans));
		
		ans=moreThanQuotient(c,1);
		System.out.println(Arrays.toString(ans));
		
		ans=moreThanQuotient(d,1);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int[] moreThanQuotient (int x[],int k) {
		
		int i=0,j=0,count=0,div;
		
		div = x.length/k;
		
		
		if(div == 0) {
			return x;
		}
		
		Arrays.sort(x);
		
		List<Integer>result = new ArrayList<>();
		
		while(i<x.length) {
			
			j=i;
			
			while(j<x.length) {
								
				if(x[i]==x[j]) {
					count++;
					j++;
				}else {
					break;
				}
			}
			
			if(count>div) {
				result.add(x[i]);
			}
			i=j;
			count=0;
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
