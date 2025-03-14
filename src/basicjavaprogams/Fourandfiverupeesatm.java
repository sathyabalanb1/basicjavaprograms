package basicjavaprogams;

public class Fourandfiverupeesatm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		withDrawAmount(34);

	}
	
	public static void withDrawAmount (int amount) {
		
		int fourcount=0,fivecount=0,sub;
		
		if(amount<12) {
			System.out.println("Enter amount greater than or equal to twelve");
			return;
		}
		
		if(amount%4==0) {
			fourcount=amount/4;
		}else if(amount%5==0) {
			fivecount=amount/5;
		}else {
			sub=amount-4;
			fourcount=sub/4;
			fivecount=((sub%4)+4)/5;
		}
		
		System.out.println("Number of four rupees: "+fourcount);
		System.out.println("Number of five rupees: "+fivecount);
		
		return;
	}

}
