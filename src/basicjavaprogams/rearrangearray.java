package basicjavaprogams;

import java.util.Arrays;

public class rearrangearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,-4,-1,4};
		
		int b[] = {-5,-2,5,2,4,7,1,8,0,-8};
		
		int c[] = {1,2,3,4,5};
		
		int ans[];
		ans = rearrangeArray(a);
		System.out.println(Arrays.toString(ans));
		
		ans = rearrangeArray(b);
		System.out.println(Arrays.toString(ans));
		
		ans = rearrangeArray(c);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int[] rearrangeArray (int input[]) {
		
		int i=0,j=0,k=0,positivecount=0,negativecount=0;
		
		while(i<input.length) {
			
			if(input[i]<0) {
				negativecount++;
			}else {
				positivecount++;
			}
			i++;
		}
		
		if(negativecount == 0 || positivecount == 0) {
			return input;
		}
		
		int negativeArray[] = new int[negativecount];
		int positiveArray[] = new int[positivecount];
		
		i=0;
		
		while(i<input.length) {
			
			if(input[i]<0) {
				negativeArray[j] = input[i];
				j++;
			}else {
				positiveArray[k] = input[i];
				k++;
			}
			i++;
		}
		
		i=0;
		j=0;
		k=0;
		
		while(i<negativeArray.length && j<positiveArray.length) {
			
			input[k] = negativeArray[i];
			k++;
			i++;
			input[k] = positiveArray[j];
			k++;
			j++;
		}
		
		while(i<negativeArray.length) {
			
			input[k] = negativeArray[i];
			k++;
			i++;
		}
		
		while(j<positiveArray.length) {
			
			input[k] = positiveArray[j];
			k++;
			j++;
		}
		
		return input;
	}

}
