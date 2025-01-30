package basicjavaprogams;

public class Markstograde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ans;
		ans=marksToGrade(47);
		System.out.println(ans);
		
		ans=marksToGrade(55);
		System.out.println(ans);
		
		ans=marksToGrade(70);
		System.out.println(ans);
		
		ans=marksToGrade(73);
		System.out.println(ans);
		
		ans=marksToGrade(88);
		System.out.println(ans);
		
		ans=marksToGrade(91);
		System.out.println(ans);
		
		ans=marksToGrade(45);
		System.out.println(ans);

	}
	
	public static char marksToGrade (int mark) {
		
		if(mark>=91 && mark<=100) {
			return 'S';
		}else if(mark>=81 && mark<=90) {
			return 'A';
		}else if(mark>=71 && mark<=80) {
			return 'B';
		}else if(mark>=61 && mark<=70) {
			return 'C';
		}else if(mark>=51 && mark<=60) {
			return 'D';
		}else if(mark>=46 && mark<=50) {
			return 'E';
		}else {
			return 'U';
		}
	}

}
