package basicjavaprogams;

import java.util.Arrays;

public class Rightrotatentimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		
		rightRotateNtimes(a,3);
		System.out.println(Arrays.toString(a));

	}
	
	public static void rightRotateNtimes (int x[],int n) {
		
		int i=0;
		
		while(i<n) {
			
			Rightrotate.rightRotate(x);
			i++;
		}
		
		return;
	}

}
