package hackerearth;
import java.util.*;
public class Panagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     Stack<Character>st=new Stack<>();
	     Stack<Character>result=new Stack<>();
	     int a[]=new int[26];
	     for(int i=0;i<=26;i++) {
	     a[i]=sc.nextInt();
	     }
	     String s=sc.next();
	     char ch[]=s.toCharArray();
	     int sum=0;
	     for(int i=0;i<=26;i++) {
	    	 st.push(ch[i]);
	     }
	    for(char c='a';c<'z';c++) {
	    	if(!st.contains(c)){
                sum += a[(c-97)%26];
            }
	    }
	    System.out.println(sum);
	    
	}

}
