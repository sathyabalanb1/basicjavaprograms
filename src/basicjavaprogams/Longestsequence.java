package basicjavaprogams;

import java.util.Arrays;

public class Longestsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {100,4,200,1,3,2};
		
		int b[] = {10,11,25,28,29,30,31,90,95,120,121,122};
		
		int c[]= {5,10,15,20,25};
		
		int d[] = {};
		
		int ans[];
		ans=longestSequence(a);
		System.out.println(Arrays.toString(ans));
		
		ans=longestSequence(b);
		System.out.println(Arrays.toString(ans));
		
		ans=longestSequence(c);
		System.out.println(Arrays.toString(ans));
		
		ans=longestSequence(d);
		System.out.println(Arrays.toString(ans));

	}
	
	/*
	public static int[] longestSequence (int x[]) {
		
		int i=0,j=0,start=0,end=0,count=0,total=0;
		
		selectionsort.selectionSort(x);
		
		
		while(i<x.length) {
			j=i;
			while(j<x.length-1) {
				if(x[j]+1 == x[j+1]) {
					count++;
					j++;
				}else if(j==0) {
					j++;
					break;
				}else if(j!=0) {
					if(x[j]-1 == x[j-1]) {			
						count++;
						break;
					}else {
						j++;
						break;
					}
				}
			}
			
			if(j==x.length-1) {
				
				if(x[j]-1 == x[j-1]) {
					count++;
			//		j++;
					break;
				}else {
					j++;
					break;
				}
				
			}
			
			if(count>total) {
				total=count;
				start=i;
				end=j;
			}
			i=j;
			count=0;
		}
		if(total == 0) {
			return x;
		}
		int output[] = Subarraymaxsum.copyElements(start, end, total, x);
		return output;
	}
	
	*/
	
	public static int[] longestSequence (int x[]) {
		
		int i=0,j=0,k=0,count=0,total=0,start=0,end=0;
		
		selectionsort.selectionSort(x);
		
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
					
						if(count>total) {
							total=count;
							start=i;
							end=j;
						}
						j=k;
						break;
					}else {
						j=k;
						break;
					}
				}
			}
			if(j==x.length-1) {
				if(x[j]-1 == x[j-1]) {
					count++;
					if(count>total) {
						total=count;
						start=i;
						end=j;
					}
					
				}
			}
			
			
			i=j;
			count=0;
		
			
		}
		
		if(total == 0) {
			return x;
		}
		
		int output[] = Subarraymaxsum.copyElements(start, end, total, x);
		return output;
	}

}
