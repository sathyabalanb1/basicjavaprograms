package basicjavaprogams;

import java.util.Arrays;

public class Topfrequencysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8,8,10,12,12,12,15,15,24,24,24,24,42,30};
		
		int b[] = {24,23};
		
		int c[] = {};
		
		int d[]= {1,2,3,4,5};
		
		topFrequencySort(a);
		System.out.println(Arrays.toString(a));
		
		topFrequencySort(b);
		System.out.println(Arrays.toString(b));
		
		topFrequencySort(c);
		System.out.println(Arrays.toString(c));
		
		topFrequencySort(d);
		System.out.println(Arrays.toString(d));

	}
	
	public static void topFrequencySort(int x[]) {
		
		int i=0,j=0,k=0,loopstart=0,numstart=0,numend=0,num=0,total=0,count=0;
		
		Arrays.sort(x);
		
		while(i<x.length) {
			j=i;
			while(j<x.length) {
				k=j;
				while(k<x.length) {
					
					if(x[j]==x[k]) {
						k++;
						count++;
					}else {
						break;
					}
					
				}
				if(total<count) {
					
					total=count;
					loopstart=i;
					numstart=j;
					numend=k-1;
					num=x[j];
				}else {
					if(total==count) {
						
						if(x[j]<num) {
							total=count;
							loopstart=i;
							numstart=j;
							numend=k-1;
							num=x[j];
						}
					}
				}
				j=k;
				count=0;
			}
			rotateArrayMultiple(total,loopstart,numstart,numend,x);
			i=i+total;
			total=0;
			count=0;
		}
	}
	
	public static void rotateArray(int loopstart,int numstart,int numend,int x[]) {
		
		int i=numend,j=numend-1,temp=x[numend];
		
		while(i>loopstart) {
			x[i]=x[j];
			i--;
			j--;
		}
		
		x[loopstart]=temp;
		return;
	}
	
	public static void rotateArrayMultiple(int total,int loopstart,int numstart,int numend,int x[]) {
		int i=0;
				
		while(i<total) {
			
			rotateArray(loopstart,numstart,numend,x);
			i++;
		}
		
		return;
		
	}

}
