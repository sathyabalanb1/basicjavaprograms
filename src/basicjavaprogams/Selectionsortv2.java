package basicjavaprogams;

import java.util.Arrays;

public class Selectionsortv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 7,6,10,5,9,2,1,15,7};
		
		int b[] = {19,6,26,4,23};
		
		int c[] = {34,67,48,36,2,95,-1,23,44,106,9,17};
		
		int d[] = {21,20};
		
		int e[] = {};
		
		int f[] = {7};
		
		int g[] = {4,17,4,9,5,4,23,25,5,19};
		
		selectionSort(a);
		System.out.println(Arrays.toString(a));
		
		selectionSort(b);
		System.out.println(Arrays.toString(b));
		
		selectionSort(c);
		System.out.println(Arrays.toString(c));
		
		selectionSort(d);
		System.out.println(Arrays.toString(d));
		
		selectionSort(e);
		System.out.println(Arrays.toString(e));
		
		selectionSort(f);
		System.out.println(Arrays.toString(f));
		
		selectionSort(g);
		System.out.println(Arrays.toString(g));
	}
	
	public static void selectionSort (int x[]) {
		
		int i=0,j=0,small=0,smallpos=0,temp;
		
		while(i<x.length) {
			j=i;
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
