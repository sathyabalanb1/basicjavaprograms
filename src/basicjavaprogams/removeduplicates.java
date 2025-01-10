package basicjavaprogams;

import java.util.Arrays;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {6,5,7,6,6,10,5,6,9,16,5,9,26,40};
		
		int b[] = {8,3,6,16,9,5,27,2};
		
		int output[];
		output = removeDuplicates(a);
		System.out.println(Arrays.toString(output));
		
		output = removeDuplicates(b);
		System.out.println(Arrays.toString(output));
		

	}
	
	public static int countUniqueNumbers(int x[]) {
		
		int i=0,j,count=0;
		
		Arrays.sort(x);
		
		while(i<x.length) {
			
			j=i+1;
			
			while(j<x.length) {
				
				if(x[i] != x[j]) {
					
					break;
				}
				else {
					j++;
				}
			}
			i=j;
			count++;
		}
		
		return count;
	}
	
	public static int[] removeDuplicates(int x[])
	{
		int i=0,j,k=0;
		
		int count = countUniqueNumbers(x);
		
		int output[] = new int[count];
		
		while(i<x.length) {
			
			j=i+1;
			output[k]=x[i];
			while(j<x.length) {
				
				if(x[i] != x[j]) {
					break;
				}
				else {
					j++;
				}
			}
			i=j;
			k++;
		}
		
		return output;
	}

}
