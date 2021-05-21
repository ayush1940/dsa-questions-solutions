package hackerearth;
import java.util.*;
public class ASCIIvaluequestion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n=sc.nextInt();
		String s=String.valueOf(n);
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String s1=s.substring(i,j+1);
			  int ascii=Integer.valueOf(s1);
			  char c=(char)n;
			  
				  System.out.println(c);
			  
			}
		}
		}
	}

}
