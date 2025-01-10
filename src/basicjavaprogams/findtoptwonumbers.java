package basicjavaprogams;

public class findtoptwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {18,44,25,39,44,39};
		
		findTopTwoNumbers(a);

	}
	
	public static void findTopTwoNumbers (int x[]) {
		
		if(x == null || x.length<2) {
			
			System.out.println("Array must contain atleast two elements");
			return;
		}
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int num : x) {
			
			if(num>firstMax) {
				secondMax=firstMax;
				firstMax=num;
			}else if(num>secondMax && num<firstMax) {
				secondMax=num;
			}
		}
		
		if(secondMax == Integer.MIN_VALUE) {
			System.out.println("First Top Number: "+firstMax+","+"Second Top Number: "+"Not Found");
		}else {
			System.out.println("First Top Number: "+firstMax+","+"Second Top Number: "+secondMax);
		}
	}

}
