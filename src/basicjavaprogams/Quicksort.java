package basicjavaprogams;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 7,6,10,5,9,2,1,15,7};
		
		int b[] = {19,6,26,4,23};
		
		int c[] = {34,67,48,36,2,95,-1,23,44,106,9,17};
		
		int d[] = {21,20};
		
		int e[] = {};
		
		int f[] = {7};
		
		int g[] = {4,17,4,9,5,4,23,25,5,19};
		
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
		quickSort(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
		
		quickSort(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
		
		quickSort(d,0,d.length-1);
		System.out.println(Arrays.toString(d));
		
		quickSort(e,0,e.length-1);
		System.out.println(Arrays.toString(e));
		
		quickSort(f,0,e.length-1);
		System.out.println(Arrays.toString(f));
		
		quickSort(g,0,g.length-1);
		System.out.println(Arrays.toString(g));

	}
	
	public static void quickSort(int x[],int lb, int ub) {
		
		int loc;
		
		if(lb<ub) {
			loc = partition(x,lb,ub);
			quickSort(x,lb,loc-1);
			quickSort(x,loc+1,ub);
		}
		
		return;
	}
	
	public static int partition(int x[],int start, int end) {
		
		int i=start,j=end,pivot=x[start],pivotpos=start,temp;
		
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
