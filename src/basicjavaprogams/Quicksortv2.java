package basicjavaprogams;

import java.util.Arrays;

public class Quicksortv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 7,6,10,5,9,2,1,15,7};
		
		int b[] = {19,6,26,4,23};
		
		int c[] = {34,67,48,36,2,95,-1,23,44,106,9,17};
		
		int d[] = {21,20};
		
		int e[] = {};
		
		int f[] = {7};
		
		int g[] = {4,17,4,9,5,4,23,25,5,19};
		
		quickSortV2(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
		quickSortV2(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
		
		quickSortV2(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
	}
	
	public static void quickSortV2 (int x[], int lb, int ub) {
		
		int loc;
		
		if(lb<ub) {
		loc = partition(x,lb,ub);
		quickSortV2(x,lb,loc-1);
		quickSortV2(x,loc+1,ub);
		}
		
		return;
	}
	
	public static int partition (int x[],int lb, int ub) {

		int i=lb,j=ub,pivot=x[lb],pivotpos=lb,temp;
		
		while(i<j) {
			
			while(x[i]<=pivot) {
				i++;
				if(i==x.length) {
					break;
				}
			}
			
			while(x[j]>pivot) {
				j--;
				if(j<0) {
					break;
				}
			}
			
			if(i<j) {
				temp=x[i];
				x[i]=x[j];
				x[j]=temp;
			}
		}
		
		temp=x[j];
		x[j]=x[pivotpos];
		x[pivotpos]=temp;
		
		return j;
		
	}

}
