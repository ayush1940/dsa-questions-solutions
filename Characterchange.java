package hackerearth;
import java.util.*;
public class Characterchange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		boolean isanagram=false;
		boolean visited[]=new boolean[s2.length()];
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				char c=s1.charAt(i);
				isanagram=false;
				for(int j=0;j<s2.length();j++) {
					if(s2.charAt(j)==c&&visited[j]) {
						isanagram=true;visited[j]=true;
						break;
					}
				}
				if(!isanagram) {
					break;
				}
			}
			
		}
		if(isanagram) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
		
       
	}

}
