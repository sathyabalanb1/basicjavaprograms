package basicjavaprogams;

public class Count0s1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,2,0,2,1,0,0,1,0};
		
		count0S1S2S(a);

	}
	
	public static void count0S1S2S(int x[]) {
		
		int i=0, zerocount=0,onecount=0,twocount=0;
		
		while(i<x.length) {
			
			if(x[i] == 0) {
				
				zerocount++;
			}else if(x[i] == 1) {
				onecount++;
			}else if(x[i] == 2) {
				twocount++;
			}
			i++;
		}
		
		System.out.println("Number of Zeros: "+zerocount);
		System.out.println("Number of one's: "+ onecount);
		System.out.println("Number of two's: "+twocount);
		return;
	}

}
