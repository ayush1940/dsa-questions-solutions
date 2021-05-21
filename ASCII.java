package hackerearth;
import java.util.*;
public class ASCII {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
		for(int j=ch;j<s.length();j++) {
			System.out.println(j);
		}
		}
	}

	}

}
