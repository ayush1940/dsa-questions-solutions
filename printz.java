package hackerearth;
import java.util.*;
public class printz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("*");
		}	
		for(int i=1;i<=Math.ceil(n/2);i++) {
			if(i==n-i) {
				System.out.println("*");
			}
		}
		
	}

}
