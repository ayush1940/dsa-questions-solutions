package hackerearth;
import java.util.*;
public class ConsecutiveInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			int ans[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int j=0;j<n;j++) {
			for(int i=j+1;i<n;i++) {
				if(a[i]!=a[j]+1) {
					count++;
				}
			   }
			System.out.println(count);
			}	
		}
		
	}

}
