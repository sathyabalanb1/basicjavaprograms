package basicjavaprogams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class commonelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,5,10,20,40,80};
		int b[] = {6,7,20,80,100};
		int c[] = {3,4,15,20,30,70,80,120};
		
		int d[] = {1,2,3,4,5};
		int e[] = {6,7,8,9,10};
		int f[] = {11,12,13,14,15};
		
		int g[] = {2,3};
		int h[] = {2,4};
		int i[] = {2,4};
		
		int finalOutput[];
		int firstOutput[] = commonElements(a,b);
		finalOutput = commonElements(firstOutput,c);
		System.out.println(Arrays.toString(finalOutput));
		
		firstOutput= commonElements(d,e);
		finalOutput = commonElements(firstOutput,f);
		System.out.println(Arrays.toString(finalOutput));
		
		firstOutput= commonElements(g,h);
		finalOutput = commonElements(firstOutput,i);
		System.out.println(Arrays.toString(finalOutput));

	}
	
	public static int[] commonElements (int x[],int y[]) {
		
		int i=0,j=0;
		
		List<Integer>result = new ArrayList<>();
		
		while(i<x.length && j<y.length) {
			
			if(x[i] == y[j]) {
				
				if(result.isEmpty() || result.get(result.size()-1) != x[i]) {
										
					result.add(x[i]);
				}
				i++;
				j++;
			}else if(x[i]<y[j]) {
				i++;
			}else if(x[i]>y[j]) {
				j++;
			}
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
