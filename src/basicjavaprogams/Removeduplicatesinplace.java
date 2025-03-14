package basicjavaprogams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removeduplicatesinplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {27,11,27,39,12,27,39,46,87,11,11,93,11};
		
		int b[] = {10,10,10,10,12,12,12,15,15,18,18,19,20};
		
		int ans[];
		ans = removeDuplicatesInPlace(a);
		System.out.println(Arrays.toString(ans));
		
		ans = removeDuplicatesInPlace(b);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int [] removeDuplicatesInPlace (int x[]) {
		
		int i=0,j=0;
		
		List<Integer>result = new ArrayList<>();
		
		selectionsort.selectionSort(x);
		
		while(i<x.length) {
			
			j=i+1;
			
			while(j<x.length) {
				
				if(x[i] != x[j]) {
					
					result.add(x[i]);
					break;
				}else {
					j++;
				}
			}
			i=j;
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
				
		
	}

}
