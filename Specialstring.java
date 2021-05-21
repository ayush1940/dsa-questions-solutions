package hackerearth;
import java.util.*;
public class Specialstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Character>stack=new Stack<>();
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		 for(int i=0;i<ch.length;i++) {
			 if(Character.isAlphabetic(ch[i])) {
				 stack.push(ch[i]);
			 }
		 }
		 for(int i=0;i<ch.length;i++) {
			 if(!Character.isAlphabetic(ch[i])) {
				 System.out.print(ch[i]);
			 }else {
			 System.out.print(stack.pop());
			 }
		 }
	}

}
