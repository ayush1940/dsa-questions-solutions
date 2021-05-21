package hackerearth;
import java.util.*;
public class Prefixsuffix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		for(int i=n/2;i>0;i--) {
			for(int j=n/2;j<n;j++) {
				System.out.println(s.substring(i));
			}
		}
	}

}
