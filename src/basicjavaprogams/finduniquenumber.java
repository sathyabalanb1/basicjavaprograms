package basicjavaprogams;

public class finduniquenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,1,2,2,3,4,4,5,5};
		
		findUniqueNumber(a);

	}
	
	public static void findUniqueNumber (int x[]) {
		
		int i=0,j,count=0;
		
		while(i<x.length) {
			j=i;
			count=0;
			while(j<x.length) {
				
				if(x[i] == x[j]) {
					j++;
					count++;
				}else {
					break;
				}
			}
			
			if(count == 1) {
				System.out.println(x[i]);
			}
			i=j;
		}
		
		return;
	}

}
