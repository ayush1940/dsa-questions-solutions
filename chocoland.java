package hackerearth;
import java.util.*;
public class chocoland {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();//no. of chocolate
			int k=sc.nextInt();//eat per day
			int s=sc.nextInt();//survival day
			if(k*s==n) {
				System.out.println(1);
			}
			if(k*s<n) {
				System.out.println(1);
			}
			if(k*s>n) {
				for(int i=1;i<=s;i++) {
					if(i*k==n) {
						if(i==7) {
							System.out.println(-1);
						}
						if(i<7) {
							int b=s-i;
							if(b*k<=n) {
								System.out.println(2);
							}
						}
						if(i>=8) {
							int b=s-i;
							if(b*k<=n) {
								System.out.println(2);
							}
							else {
								System.out.println(2+i);
								break;
							}
						}
						
					}
				}
			}
		}

	}

}
