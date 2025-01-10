package basicjavaprogams;

import java.util.Arrays;

public class Mergesortv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {15,5,24,8,1,3,16,10,20};
		
		int b[] = {23,8,5,44,17};
		
		int c[] = {96,54};
		
		int d[] = {};
		
		int e[] = {27,13,-1,46,18,1,9,55,33,12,27,27,15,46};
		
		mergeSortV2(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
		mergeSortV2(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
		
		mergeSortV2(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
		
		mergeSortV2(d,0,d.length-1);
		System.out.println(Arrays.toString(d));
		
		mergeSortV2(e,0,e.length-1);
		System.out.println(Arrays.toString(e));

	}
	
	public static void mergeSortV2 (int x[], int lb, int ub) {
		
		int mid;
		
		mid=(lb+ub)/2;
		
		if(lb<ub) {
			
			mergeSortV2(x,lb,mid);
			mergeSortV2(x,mid+1,ub);
			merge(x,lb,mid,mid+1,ub);
		}
		
		return;
	}
	
	public static void merge(int x[],int lb,int mid,int midp,int ub) {
		
		int i=lb,j=midp,k=0,l=0,m=lb;
		
		int temp = ub-lb+1;
		
		int tempArray[] = new int[temp];
		
		while(i<=mid && j<=ub) {
			
			if(x[i]<=x[j]) {
				tempArray[k]=x[i];
				i++;
				k++;
			}else if(x[i]>=x[j]) {
				tempArray[k] = x[j];
				j++;
				k++;
			}
		}
		
		while(i<=mid) {
			
			tempArray[k]=x[i];
			i++;
			k++;
		}
		
		while(j<=ub) {
			
			tempArray[k]=x[j];
			j++;
			k++;
		}
		
		while(l<tempArray.length) {
			
			x[m]=tempArray[l];
			l++;
			m++;
		}
		
		return;
	}
}
