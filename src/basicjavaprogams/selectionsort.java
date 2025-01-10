package basicjavaprogams;

import java.util.Arrays;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {29,40,32,15,54,8,66};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
		
		int b[] = {75,34,9,56,29,45,68};
		selectionSort(b);
		System.out.println(Arrays.toString(b));

	}
	
	public static void selectionSort(int x[]) {
		
		int i=0,j=0,small=0,smallpos=0,temp;
		
		while(i<x.length) {
			
			j=i+1;
			small=x[i];
			smallpos=i;
			
			while(j<x.length) {
				
				if(small>x[j]) {
					
					small=x[j];
					smallpos=j;
				}
				j++;
			}
			
			temp=x[i];
			x[i]=x[smallpos];
			x[smallpos]=temp;
			i++;
		}
		
		return;
	}

}
