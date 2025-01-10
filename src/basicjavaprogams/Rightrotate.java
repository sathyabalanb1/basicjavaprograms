package basicjavaprogams;

import java.util.Arrays;

public class Rightrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		
		int b[] = {5};
		
		rightRotate(a);
		System.out.println(Arrays.toString(a));
		
		rightRotate(b);
		System.out.println(Arrays.toString(b));

	}
	
	public static void rightRotate (int x[]) {
		
		int i=x.length-1,j=x.length-2,temp;
		
		temp=x[i];
		
		while(i>0) {
			
			x[i]=x[j];
			i--;
			j--;
		}
		x[0]=temp;
		return;
	}

}
