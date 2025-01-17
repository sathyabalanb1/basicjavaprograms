package basicjavaprogams;

public class Maximumoccurredcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcedaacfgkkkbajklllllc";
		
		String b = "zzzzyyyy";
		
		char ans;
		ans = maximumOccurredCharacter(a);
		System.out.println(ans);
		
		ans = maximumOccurredCharacter(b);
		System.out.println(ans);

	}
	
	public static char maximumOccurredCharacter (String s1) {
		
		int i=0,j=0,big=0,bigpos=0;
		
		char c;
		
		char ch[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		int count[] = new int[26];
		
		if(s1 == null || s1.length()==0) {
			return '\0';
		}
		
		
		while(i<s1.length()) {
			c=s1.charAt(i);
			count[c-97]++;
			i++;
		}
		
		while(j<count.length) {
			if(big<count[j]) {
				big=count[j];
				bigpos=j;
			}
			j++;
		}
		return ch[bigpos];
	}

}
