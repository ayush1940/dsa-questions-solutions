package hackerearth;
import java.util.*;
public class matching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			String s1=sc.next();
			String s2=sc.next();
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			for(int i=0;i<ch1.length;i++) {
				for(int j=0;j<ch2.length;j++) {
					if(ch1[i]==ch2[j]) {
						System.out.println("Arjun");
					}else {
						System.out.println("Amit");
					}
				}
			}
		}
	}

}
