package basicjavaprogams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersection {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,2,3,4};
		int b[]= {2,2,4,6};
		
		int c[]= {1,3,5};
		int d[]= {};
		
		int e[]= {1,2,4,6};
		int f[]= {3,5,7,8};
		
		int g[]= {1,3,4,5,7};
		int h[]= {2,3,5,6};
		
		int ans[];
		ans=arrayIntersection(a,b);
		System.out.println(Arrays.toString(ans));
		
		ans=arrayIntersection(c,d);
		System.out.println(Arrays.toString(ans));
		
		ans=arrayIntersection(e,f);
		System.out.println(Arrays.toString(ans));
		
		ans=arrayIntersection(g,h);
		System.out.println(Arrays.toString(ans));
		
		
	}
	
	public static int[] arrayIntersection (int x[],int y[]) {
		
		int i=0,j=0;
		
		List<Integer> result = new ArrayList<>();
		
		while(i<x.length && j<y.length) {
			
			if(x[i] == y[j]){
				
				if(result.isEmpty() || result.get(result.size()-1) != x[i]) {
					result.add(x[i]);
				}
				i++;
				j++;
			}else if(x[i]<y[j]) {
				
				i++;
			}else {
				
				j++;
			}
		}
		
		return result.stream().mapToInt(Integer::intValue).toArray();
	}

}
