package hackerearth;
import java.util.*;
public class OCTAVETUNES {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int count=0;
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
			for(int i=0;i<n;i++) {
				if(i%7==0) {
					if(a[i]==8) {
						count++;
					}
				}
			}
				
			System.out.println(count);
			
		}
		
	}

}
