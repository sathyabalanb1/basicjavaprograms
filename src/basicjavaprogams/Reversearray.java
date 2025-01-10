package basicjavaprogams;

import java.util.Arrays;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,4,3,2,1};
		
		int b[] = {51,52,53,54,55,56,57,58};
		
		int c[] = {};
		
		int d[] = {95,96};
		
		int e[] = {99};
		
		reverseArray(a);
		System.out.println(Arrays.toString(a));
		
		reverseArray(b);
		System.out.println(Arrays.toString(b));
		
		reverseArray(c);
		System.out.println(Arrays.toString(c));
		
		reverseArray(d);
		System.out.println(Arrays.toString(d));
		
		reverseArray(e);
		System.out.println(Arrays.toString(e));

	}
	
	public static void reverseArray (int x[]) {
		
		int i=0,j=x.length-1,temp;
		
		while(i<x.length/2) {
			
			temp=x[i];
			x[i]=x[j];
			x[j]=temp;
			i++;
			j--;
		}
		
		return;
	}

}
