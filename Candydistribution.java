package hackerearth;
import java.util.*;
public class Candydistribution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		b[0]=1;
		for(int i=1;i<n;i++) {
			
				if(b[i]==0){
	               b[i] = 1;
	            }
				if(a[i]>a[i-1]) {
					b[i]=b[i-1]+1;
				}
			}
		
		for(int i=n-1;i>0;i--) {
			if(a[i-1]>a[i]&& b[i-1]<=b[i] ){
				b[i-1]=b[i]+1;
			}
		}
		for(int i=0;i<n;i++) {
			sum+=b[i];
		}
		System.out.println(sum);
	}

}
