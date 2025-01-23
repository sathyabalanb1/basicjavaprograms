package basicjavaprogams;

import java.util.Arrays;

public class Reversealphabeticsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"bavithra","zebra","reshma","abinaya","sandhiya"};
		
		reverseAlphabeticSort(a);
		System.out.println(Arrays.toString(a));

	}
	
	public static void reverseAlphabeticSort (String input[]) {
		
		int i=0,j=0,bigpos=0;
		
		String temp,big=input[0];
		
		while(i<input.length) {
			j=i+1;
			big=input[i];
			bigpos=i;
			while(j<input.length) {
				
				if(Stringcomparison.stringComparison(big, input[j])>0) {
					big=input[j];
					bigpos=j;
				}
				j++;
			}
			temp=input[i];
			input[i]=input[bigpos];
			input[bigpos]=temp;
			i++;
		}
		
		return;
	}

}
