package hackerearth;
import java.util.*;
public class fizza {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int count1=0;
			int count2=0;
			for(int i=0;i<n-1;i++) {
				if(a[i]+1<=n && a[i+1]==a[i]) {
					count1++;
				}
			}
			for(int i=0;i<n-2;i++) {
				if(a[i]+2<=n && a[i+2]==a[i]) {
					count2++;
				}
			}
			if(count1>count2) {
				System.out.println(count1);
			}else {
				System.out.println(count2);
			}
			
		}
		
	}

}
