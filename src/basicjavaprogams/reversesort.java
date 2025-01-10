package basicjavaprogams;

import java.util.Arrays;

public class reversesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {33,76,17,42,28,93,11,55};
		
		reverseSort(a);
		System.out.println(Arrays.toString(a));

	}
	
	public static void reverseSort (int x[]) {
		
		int i=0,j=0,big,bigpos,temp;
		
		while(i<x.length) {
			
			j=i+1;
			big=x[i];
			bigpos=i;
			
			while(j<x.length) {
				
				if(big<x[j]) {
					
					big=x[j];
					bigpos=j;
				}
				j++;
			}
			
			temp=x[i];
			x[i]=big;
			x[bigpos]=temp;
			
			i++;
		}
		
		return;
	}

}
