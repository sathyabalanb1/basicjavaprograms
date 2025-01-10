package basicjavaprogams;

public class Checksum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isCheckSumFound(32346);
		
		isCheckSumFound(5672);
		
		isCheckSumFound(21);
		
		isCheckSumFound(42);
		
		isCheckSumFound(53);
		
		isCheckSumFound(5);
		
		isCheckSumFound(9);
		
		isCheckSumFound(9999);

	}
	
	public static void isCheckSumFound (int n) {
		
		if(n>=1 && n<=9) {
			System.out.println("Success");
			return;
		}
		
		int num=n/10,checkDigit=n%10, checkSum=0, sum=0,count=0,val,cs;
		
		while(num!=0) {
			count++;
			val=num%10;
			sum=sum+val*2;
			num=num/10;
		}
		
		checkSum = sum/count;
		sum=0;
		val=0;
		
		while(checkSum>9) {
			cs = checkSum;
			while(cs != 0) {
				val = cs%10;
				sum=sum+val;
				cs = cs/10;
			}
			checkSum=sum;
			sum=0;
		}
		
		if(checkDigit == checkSum) {
			System.out.println("Success");
			System.out.println("input: "+ n + " checkdigit: "+ checkDigit);
			return;
		}else {
			System.out.println("Fail");
			System.out.println("input: "+ n + " checkdigit: "+ checkDigit);
			return;
		}
	}

}
