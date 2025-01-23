package basicjavaprogams;

import java.util.Arrays;

public class Alphabeticsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"bavithra","zebra","reshma","abinaya","sandhiya"};
		
		alphabeticSort(a);
		System.out.println(Arrays.toString(a));

	}
	
	public static void alphabeticSort (String input[]) {
		
		int i=0,j=0,smallpos=0;
		
		String temp,small=input[0];
		
		while(i<input.length) {
			j=i+1;
			small=input[i];
			smallpos=i;
			while(j<input.length) {
				
				if(Stringcomparison.stringComparison(small, input[j])<0) {
					small=input[j];
					smallpos=j;
				}
				j++;
			}
			temp=input[i];
			input[i]=input[smallpos];
			input[smallpos]=temp;
			i++;
			
		}
	}

}
