package basicjavaprogams;

public class firstrepeatingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,5,3,4,3,5,6};
		
		int b[] = {7,9,4,10,2,1,3,2,4};
		
		int c[] = {13};
		
		int d[] = {1,2,3,4,5};
		
		int ans;
		ans = firstRepeatingElement(a);
		System.out.println(ans);
		
		ans = firstRepeatingElement(b);
		System.out.println(ans);
		
		ans = firstRepeatingElement(c);
		System.out.println(ans);
		
		ans = firstRepeatingElement(d);
		System.out.println(ans);

	}

	public static int firstRepeatingElement (int x[]) {

		int i=0,j=0;

		if(x.length == 1) {
			return -1;
		}

		while(i<x.length) {

			j=i+1;

			while(j<x.length) {
				if(x[i] == x[j]) {
					return x[i];
				}else {
					j++;
				}
			}
			i++;
		}

		return -1;
	}

}
