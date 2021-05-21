package gfg;
import java.util.*;
public class Integertobinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int decimal=0;
		String s=Integer.toBinaryString(n);
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(i%2==0) {
				char temp=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=temp;
			}
		}
		for(int i=0;i<ch.length;i++) {
			 decimal+=Integer.parseInt(String.valueOf(ch[i]),2);
		}
       System.out.println(decimal);
	}

}
