package hackerearth;
import java.util.*;
public class count {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	char ch;
	String s=sc.nextLine();
	for(int i=0;i<s.length();i++) {
		 ch=s.charAt(i);
		 for(int j='a';j<=ch;j++) {
				count=count+2;
			}
	}
	
	System.out.println(count-1);
}
}
