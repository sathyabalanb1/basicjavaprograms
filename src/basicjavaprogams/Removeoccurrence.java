package basicjavaprogams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removeoccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {13,8,5,21,37,5,5,19,5};
		
		int ans[];
		ans=removeOccurrence(a,5);
		System.out.println(Arrays.toString(ans));

	}
	
	public static int [] removeOccurrence (int x[], int n) {
		
		int i=0;
		
		List<Integer>result = new ArrayList<>();
		
		while(i<x.length) {
			
			if(x[i] != n) {
				
				result.add(x[i]);
			}
			i++;
		}
		
		x = result.stream().mapToInt(Integer::intValue).toArray();
		
		return x;
	}

}
