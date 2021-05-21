package hackerearth;
import java.util.*;
public class Birthdayparty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n>=2) {
				n=n-7;
				count++;
			}
			if(n<=0||n==1) {
				break;
			}
		}
		System.out.println(count);
		if(count%2!=0) {
			System.out.println("Supraja");
		}else {
			System.out.println("Sailaja");
		}

	}

}
