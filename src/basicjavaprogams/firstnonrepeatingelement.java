package basicjavaprogams;

public class firstnonrepeatingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {7,11,8,5,8,7,11,9};
		
		int b[] = {26};
		
		int c[] = {1,1,2,2,3,3,4,4,5,5};
		
		int ans;
		ans = firstNonRepeatingElement(a);
		System.out.println(ans);
		
		ans = firstNonRepeatingElement(b);
		System.out.println(ans);
		
		ans = firstNonRepeatingElement(c);
		System.out.println(ans);
		

	}
	
	public static int firstNonRepeatingElement (int x[]) {
		
		int i=0,j=0,count=0;
		
		if(x.length == 1) {
			return x[i];
		}
		
		while(i<x.length) {
			count=1;
			j=i+1;
			while(j<x.length) {
				if(x[i] == x[j]) {
					count++;
					j++;
				}else {
					j++;
				}
			}
			if(count == 1) {
				return x[i];
			}
			i=j;
		}
		
		return -1;
	}

}
