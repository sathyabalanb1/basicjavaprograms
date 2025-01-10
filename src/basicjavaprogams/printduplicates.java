package basicjavaprogams;

import java.util.Arrays;

public class printduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,6,7,5,5,9,10,6,22,26,10,10,10};
		
		printDuplicates(a);

	}
	
	public static void printDuplicates (int x[]) {
		
		int i=0,j,count=0;
		
		Arrays.sort(x);
		
		while(i<x.length) {
			j=i+1;
			while(j<x.length) {
				
				if(x[i] == x[j]) {
					
					count++;
					j++;
					
				}else {
					
					break;
				}
				
			}
			if(count>0) {
				
				System.out.println(x[i]);
			}
			count=0;
			i=j;
		}
	}

}
