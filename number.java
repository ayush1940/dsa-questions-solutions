package hackerearth;
import java.util.*;
public class number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int count=0;
		for(int i=l;i<=r;i++) {
			if(i%2==0||prime(l,r)==false) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean prime(int l,int r) {
		//boolean flag=false;
		for(int i=l;i<=r;i++) {
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					return true;
				}
			}
		}
		return false;
	}

}
