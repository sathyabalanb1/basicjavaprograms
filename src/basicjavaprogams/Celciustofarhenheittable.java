package basicjavaprogams;

public class Celciustofarhenheittable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		celciusToFarhenheitTable(50);		
		

	}
	
	public static void celciusToFarhenheitTable (int n) {
		
		int cel=0;
		
		while(cel<=n) {
			
			double f;
			
			f=9.0/5*cel+32;
			
			System.out.println(cel+":"+f);
			
			cel = cel+5;
		}
		
		return;
	}

}
