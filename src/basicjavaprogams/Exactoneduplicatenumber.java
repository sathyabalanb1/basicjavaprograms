package basicjavaprogams;

public class Exactoneduplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,3,4,2,1,3};
		
		int b[] = {2,4,1,7,5,6,3,0,4};
		
		int ans;
		ans=findExactOneDuplicate(a);
		System.out.println(ans);
		
		ans=findExactOneDuplicate(b);
		System.out.println(ans);

	}
	
	public static int findExactOneDuplicate (int input[]) {
		int n=input.length,actualSum=0,duplicateNumber;
		
		int uniqueNumbersSum = (n-2)*(n-1)/2;
		
		for(int num:input) {
			actualSum = actualSum+num;
		}
		
		duplicateNumber = actualSum - uniqueNumbersSum;
		
		return duplicateNumber;
	}

}
