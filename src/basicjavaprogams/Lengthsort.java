package basicjavaprogams;

import java.util.Arrays;

public class Lengthsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"bbb","bbbb","z","123456","xx","aaa"};
		
        String b[] = {""};
        
        String c[] = {"one", "three", "four", "two"};

        String d[] = {};

		
		lengthSort(a);
		System.out.println(Arrays.toString(a));
		
		lengthSort(b);
		System.out.println(Arrays.toString(b));
		
		lengthSort(c);
		System.out.println(Arrays.toString(c));
		
		lengthSort(d);
		System.out.println(Arrays.toString(d));

	}
	
	public static void lengthSort (String input[]) {
		
		int i=0,j=0,small=0,smallpos=0;
		
		String temp;
		
		while(i<input.length) {
			small=input[i].length();
			smallpos=i;
			j=i+1;
			while(j<input.length) {
				
				if(small>input[j].length()) {
					small=input[j].length();
					smallpos=j;
				}
				j++;
			}
			temp=input[i];
			input[i]=input[smallpos];
			input[smallpos]=temp;
			i++;
		}
		
		return;
		
		
	}

}
