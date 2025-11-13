package basicjavaprogams;

public class Substringupdated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans=isSubString("opqrstuv","abc");
		System.out.println(ans);
		
		ans=isSubString("sathyabalan","bala");
		System.out.println(ans);
		
		ans=isSubString("xxypqpqrs","pqr");
		System.out.println(ans);
		
		ans=isSubString("lk","lkj");
		System.out.println(ans);


	}
	
	public static boolean isSubString (String input, String sub) {
		
		int i=0,j=0,count=0;
		
		char c,d;
		
		if(input.length()<sub.length()) {
			return false;
		}
		
		while(i<sub.length()) {
			while(j<input.length()) {
				c=sub.charAt(i);
				d=input.charAt(j);
				
				if(c==d) {
					i++;
					j++;
					count++;
					break;
				}else if(i==0) {
					j++;
				}else if(i!=0) {
					i=0;
				}
				
			}
			
			if(count==0) {
				return false;
			}
			count=0;
		}
		
		return true;
	}

}
