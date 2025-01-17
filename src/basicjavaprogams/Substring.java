package basicjavaprogams;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ans;
		ans = isSubString("sathyabalan","bala");
		System.out.println(ans);
		
		ans = isSubString("abcdefghij","xyz");
		System.out.println(ans);
		
		ans = isSubString("lkjkgkgfmmop","kgf");
		System.out.println(ans);
		
		ans = isSubString("opqrspqlkjpqs","pqs");
		System.out.println(ans);

	}
	
	public static boolean isSubString(String s1, String sub) {
		
		int i=0,j=0,count=0;
		
		char c,d;
		
		while(i<sub.length()) {
			while(j<s1.length()) {
				c=sub.charAt(i);
				d=s1.charAt(j);
				
				if(c==d) {
					count++;
					j++;
					break;
				}else if(j==0) {
					j++;
				}else if(j!=0 && i==0) {
					j++;
				}else if(j!=0 && i!=0) {
					i=0;
					count=0;
				}
			}
			i++;
		}
		
		if(count==sub.length()) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
