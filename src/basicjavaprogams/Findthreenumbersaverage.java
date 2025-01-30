package basicjavaprogams;

public class Findthreenumbersaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double avg;
		avg=findThreeNumbersAverage(79,87,85);
		System.out.println(avg);

	}
	
	public static double findThreeNumbersAverage (int a, int b,int c) {
		
		double avg;
		
		avg = (a+b+c)/3.0;
		
		return avg;
	}

}
