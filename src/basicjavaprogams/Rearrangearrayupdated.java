package basicjavaprogams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rearrangearrayupdated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,-4,-1,4};
		
		int b[] = {-5,-2,5,2,4,7,1,8,0,-8};
		
		int c[] = {1,2,3,4,5};
		
		reArrangeArray(a);
		System.out.println(Arrays.toString(a));
		
		reArrangeArray(b);
		System.out.println(Arrays.toString(b));
		
		reArrangeArray(c);
		System.out.println(Arrays.toString(c));

	}
	
	public static void reArrangeArray (int x[]) {
		int i=0,j=0,k=0,l=0;
		
		List<Integer>positiveNumbers = new ArrayList<>();
		List<Integer>negativeNumbers = new ArrayList<>();
		
		while(i<x.length) {
			if(x[i]>=0) {
				positiveNumbers.add(x[i]);
			}else {
				negativeNumbers.add(x[i]);
			}
			i++;
		}
		
		if(positiveNumbers.size()==0 || negativeNumbers.size()==0) {
			return;
		}
		
		while(j<positiveNumbers.size() && k<negativeNumbers.size()) {
			x[l]=positiveNumbers.get(j);
			j++;
			l++;
			x[l]=negativeNumbers.get(k);
			k++;
			l++;
		}
		
		while(j<positiveNumbers.size()) {
			x[l]=positiveNumbers.get(j);
			j++;
			l++;
		}
		
		while(k<negativeNumbers.size()) {
			x[l]=negativeNumbers.get(k);
			k++;
			l++;
		}
		
		return;
	}

}
