package basicjavaprogams;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,6,8,10,12,17,26,34,48,63};
		
		int b[]= {12,25,39,44,68,71,83,97,111,135,150,176};
		
		int c[] = {2,6,7,11,15,18,22};
		
		boolean ans;
		ans = binarySearch(a,17);
		System.out.println(ans);
		
		ans = binarySearch(b,17);
		System.out.println(ans);
		
		ans = binarySearch(c,8);
		System.out.println(ans);

	}
	
	public static boolean binarySearch (int x[],int n) {
		
		int left=0, right=x.length-1,mid;
		
		while(left<=right) {
			mid=(left+right)/2;
			
			if(n==x[mid]) {
				return true;
			}else if(n>x[mid]) {
				left=mid+1;
			}else {
				right = mid-1;
			}
		}
		
		return false;
	}

}
