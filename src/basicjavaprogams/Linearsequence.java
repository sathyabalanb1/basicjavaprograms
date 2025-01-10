package basicjavaprogams;

import java.util.Arrays;

public class Linearsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a[] = {100,4,200,1,3,2};
		
		int b[] = {10,11,25,28,29,30,31,90,95,120,121,122};
		
		int c[]= {5,10,15,20,25};
		
		int d[] = {};
		
		int ans[];
		ans=linearSequence(a);
		System.out.println(Arrays.toString(ans));
		
	}
	
	public static int[] linearSequence (int x[]) {
		
		int i=0,j=0,k=0,start=0,end=0,count=0,total=0;
		
		Arrays.sort(x);
		
		while(i<x.length-1) {
			j=i;
			while(j<x.length-1) {
				k=j+1;
				if(x[j]+1 == x[k]) {
					count++;
					j++;
				}else if(j==0) {
					j++;
				}else if(j!=0) {
					if(x[j]-1 == x[j-1]) {
						count++;
						break;
					}else {
						break;
					}
				}
				
			}
			if(j==x.length-1) {
				
				if(x[j]-1 == x[j-1]) {
					
					count++;
				}
			}
			if(count>total) {
				total=count;
				start=i;
				end=j;
			}
			i=k;
			count=0;
			
		}
		
		if(total==0) {
			return x;
		}
		
		int output[]=Subarraymaxsum.copyElements(start, end, total, x);
		return output;
		
		
	}

}
