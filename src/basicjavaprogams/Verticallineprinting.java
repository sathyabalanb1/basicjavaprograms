package basicjavaprogams;

public class Verticallineprinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		verticalLinePrinting(3,5,4);
		
		System.out.println("-----------");
		
		verticalLinePrinting(5,2,6);
		
		System.out.println("---------");
		
		verticalLinePrinting(3,0,2);

	}
	
	public static void verticalLinePrinting (int a, int b, int c) {
		int num1=a,num2=b,num3=c,big=a;
		
		if(big<b) {
			big=b;
		}
		if(big<c) {
			big=c;
		}
		
		while(big!=0) {
			if(num1==big) {
				System.out.print("|" + " ");
				num1--;
			}else {
				System.out.print("  ");
			}
			
			if(num2==big) {
				System.out.print("|"+" ");
				num2--;
			}else {
				System.out.print("  ");
			}

			if(num3==big) {
				System.out.print("|"+" ");
				num3--;
			}else {
				System.out.print("  ");
			}
			
			System.out.println();
			big--;
		}
		
		return;
	}

}
