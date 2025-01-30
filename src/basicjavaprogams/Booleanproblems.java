package basicjavaprogams;

public class Booleanproblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=aIsLargestElementOrNot(5,9,4);
		System.out.println(ans);
		
		ans=aIsLargestElementOrNot(25,9,4);
		System.out.println(ans);
		
		System.out.println("-----------");
		
		ans = aIsSmallestElementOrNot(5,9,4);
		System.out.println(ans);
		
		ans = aIsSmallestElementOrNot(5,6,17);
		System.out.println(ans);
		
		System.out.println("-------");
		
		ans=aIsInBetweenElementOrNot(5,9,4);
		System.out.println(ans);
		
		ans=aIsInBetweenElementOrNot(25,9,4);
		System.out.println(ans);
		
		ans=aIsInBetweenElementOrNot(3,2,6);
		System.out.println(ans);
		
		System.out.println("----------");
		
		ans=aIsOutsideTheRangeOrNot(5,9,4);
		System.out.println(ans);
		
		ans=aIsOutsideTheRangeOrNot(25,9,4);
		System.out.println(ans);
		
		ans=aIsOutsideTheRangeOrNot(5,6,17);
		System.out.println(ans);
		
		System.out.println("------------");
		
		ans=allThreeAreEqual(4,4,4);
		System.out.println(ans);
		
		ans=allThreeAreEqual(3,4,4);
		System.out.println(ans);
		
		ans=allThreeAreEqual(6,5,7);
		System.out.println(ans);
		
		System.out.println("---------");
		
		ans=ifAnyTwoAreEqual(4,4,7);
		System.out.println(ans);
		
		ans=ifAnyTwoAreEqual(6,8,8);
		System.out.println(ans);
		
		ans=ifAnyTwoAreEqual(6,8,6);
		System.out.println(ans);
		
		ans=ifAnyTwoAreEqual(6,6,6);
		System.out.println(ans);
		
		ans=ifAnyTwoAreEqual(8,9,10);
		System.out.println(ans);
		
		System.out.println("-------");
		
		ans=exactlyTwoAreEqual(4,4,3);
		System.out.println(ans);
		
		ans=exactlyTwoAreEqual(4,3,4);
		System.out.println(ans);
		
		ans=exactlyTwoAreEqual(3,4,4);
		System.out.println(ans);
		
		ans=exactlyTwoAreEqual(4,4,4);
		System.out.println(ans);
		
		ans=exactlyTwoAreEqual(5,6,7);
		System.out.println(ans);
		
		System.out.println("---------");
		
		ans=allThreeAreUnEqual(4,4,4);
		System.out.println(ans);
		
		ans=allThreeAreUnEqual(5,4,4);
		System.out.println(ans);

		ans=allThreeAreUnEqual(5,4,6);
		System.out.println(ans);
	}
	
	public static boolean aIsLargestElementOrNot (int a, int b,int c) {
		
		if(a>b && a>c) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean aIsSmallestElementOrNot (int a, int b, int c) {
		
		if(a<b && a<c) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean aIsInBetweenElementOrNot (int a, int b, int c) {
		
		if(a>b && a<c) {
			return true;
		}else if(a<b && a>c) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean aIsOutsideTheRangeOrNot (int a, int b, int c) {
		
		if(a<b && a<c) {
			return true;
		}else if(a>b && a>c) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean allThreeAreEqual (int a, int b, int c) {
		
		if(a==b && b==c && c==a) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean ifAnyTwoAreEqual(int a, int b, int c) {
		
		if(a==b || b==c || c==a) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean exactlyTwoAreEqual(int a, int b, int c) {
		
		if(a==b && b!=c) {
			return true;
		}else if(b==c && c!=a) {
			return true;
		}else if(c==a && a!=b) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean allThreeAreUnEqual(int a, int b, int c) {
		
		if(a!=b && b!=c && c!=a) {
			return true;
		}else {
			return false;
		}
	}

}
