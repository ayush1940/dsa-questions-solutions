package hackerearth;
import java.util.*;
public class Primefarmer {

	void primefarmer(int n,int x,int y) {
		boolean prime[]=new boolean[n+1];
		for(int i=0;i<=n;i++) {
			prime[i]=true;
		}
		for(int p=2;p*p<=n;p++) {
			if(prime[p]==true) {
				for(int i=p;i<=n;i+=p) {
					prime[p]=false;
				}
			}
			for(int i=2;i<=n;i++) {
				if(prime[i]==true && i>x+y) {
					System.out.println(i-(x+y));
				}
				
			}
		}
	}
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  while(t-->0) {
		  int n=100;
		  int x=sc.nextInt();
		  int y=sc.nextInt();
		  Primefarmer p=new Primefarmer();
		  p.primefarmer(n,x,y);
	  }
  }
}
