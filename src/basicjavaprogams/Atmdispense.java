package basicjavaprogams;

public class Atmdispense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dispenseAmount(3600);
		System.out.println("-----");
		
		dispenseAmount(99);
		System.out.println("---------");
		
		dispenseAmount(800);
		System.out.println("-----");
		
		dispenseAmount(100);
		System.out.println("------------");

	}
	
	public static void dispenseAmount (int amount) {
		
		int count2000=0,count500=0,count100=0;
		
		if(amount%100 != 0) {
			System.out.println("Amount must be multiple of 100");
			return;
		}
		
		count2000 = amount/2000;
		count500 = (amount%2000)/500;
		count100 = (amount%500)/100;
		
		System.out.println("Number of 2000's: "+count2000);
		System.out.println("Number of 500's: "+count500);
		System.out.println("Number of 100's: "+count100);
		
		return;
	}

}
