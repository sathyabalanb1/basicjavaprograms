package basicjavaprogams;

public class Createtriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans = isTriangle(3,4,5);
		System.out.println(ans);
		
		ans = isTriangle(1,2,10);
		System.out.println(ans);

	}
	
	public static boolean isTriangle (int a, int b, int c) {
		
		if(a+b>c && b+c>a && c+a>b) {
			return true;
		}else {
			return false;
		}
	}

}
