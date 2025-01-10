package basicjavaprogams;

import java.util.Arrays;

public class Mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,13,22,24,36,48};
		int b[] = {4,6,11,40};
		
		int ans[];
		ans = mergeArray(a,b);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int [] mergeArray (int x[], int y[]) {
		
		int i=0,j=0,k=0;
		
		int output[] = new int[x.length+y.length];
		
		while(i<x.length && j<y.length) {
			
			if(x[i]<y[j]) {
				
				output[k]=x[i];
				k++;
				i++;
			}else if(x[i]>y[j]) {
				
				output[k]=y[j];
				k++;
				j++;
			}
		}
		
		while(i<x.length) {
			
			output[k]=x[i];
			k++;
			i++;
		}
		
		while(j<y.length) {
			
			output[k]=y[j];
			k++;
			j++;
		}
		
		return output;
	}

}
