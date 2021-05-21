package hackerearth;
import java.util.*;
import java.math.*;
public class mathsabs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<k;i++) {
			for(int j=i+1;j<k;j++) {
				int v=a[i]-a[j];
				sum+=v;
			}
		}
		//System.out.println(sum);
		System.out.println(Math.abs(sum));
	}

}
