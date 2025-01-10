package basicjavaprogams;

public class Reversestringiteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="sathyabalan";
		
		String b = "";
		
		String c = "ba";
		
		String ans;
		ans=reverseString(a);
		System.out.println(ans);
		
		ans=reverseString(b);
		System.out.println(ans);
		
		ans=reverseString(c);
		System.out.println(ans);

	}
	
	public static String reverseString (String s1) {
		
		if(s1 == null || s1.length() == 0) {
			return s1;
		}
		
		char ch[] = s1.toCharArray();
		
		int i=0,j=ch.length-1;
		
		char temp;
		
		while(i<ch.length/2) {
			
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		
		return new String(ch);
		
		
	}

}
