package basicjavaprogams;

import java.util.LinkedHashMap;
import java.util.Map;

public class Firstnonrepeatingelementinarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,11,8,5,8,7,11,9};
		
		int b[] = {26};
		
		int c[] = {1,1,2,2,3,3,4,4,5,5};
		
		int d[] = {10,5,6,10,6,5,9,12,15};
		
		
		int ans;
		ans = firstNonRepeatingElement(a);
		System.out.println(ans);
		
		ans = firstNonRepeatingElement(b);
		System.out.println(ans);
		
		ans = firstNonRepeatingElement(c);
		System.out.println(ans);
		
		ans = firstNonRepeatingElement(d);
		System.out.println(ans);


	}
	
	public static int firstNonRepeatingElement (int x[]) {
		
		int count;
		
		Map<Integer,Integer>countMap = new LinkedHashMap<>();
		
		for(int num:x) {
			countMap.put(num, countMap.getOrDefault(num, 0)+1);
		}
		
		for(int n:x) {
			count = countMap.get(n);
			
			if(count==1) {
				return n;
			}
			
		}
		
		return -1;
	}

}
