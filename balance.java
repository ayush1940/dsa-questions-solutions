package gfg;
import java.util.*;
import java.io.*;
	class solution{
		int minvalue( int a[],int n) {
			
		int sum=0;
		int sum1=0;
		//int b=Math.abs(sum-sum1);
		
		for(int i=0;i<n/2;i++) {
			sum+=a[i];
			}
			for(int j=n/2;j<n;j++) {
				sum1+=a[j];
			}
//			if(sum>sum1) {
//				//int b=sum-sum1;
//				return b;
//				//System.out.println(b);
//			}
//			else if(sum1>sum) {
//				//int b=sum1-sum;
//				return b;
//				//System.out.println(b);
//			}
			return Math.abs(sum-sum1);
			
		}
	}
	public class balance{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int k=0;k<n;k++) {
			a[k]=sc.nextInt();
		}
		solution s=new solution();

		int ans=s.minvalue(a,n);
		System.out.println(ans);
		}
}

