package hackerearth;
import java.util.*;
public class everypossibilities {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			//System.out.println(a);
		}
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String s1=s.substring(i,j+1);
				//System.out.println(s1);
			}
		}
		ArrayList<String>a=new ArrayList<>();
		a.add("ab");
		a.add("dc");
		a.add("ac");
		a.add("ba");
		a.add("ca");
		a.add("bc");
		Collections.sort(a);
		System.out.println(a);
		
	}
	public static char[] swap(String s,int i,int j) {
		char ch[]=s.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return ch;
	}
	
}
