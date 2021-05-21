package hackerearth;
import java.util.*;
public class crime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer>s1=new Stack<>();
		Stack<Integer>s2=new Stack<>();
		Stack<Integer>s3=new Stack<>();
		Stack<Integer>s4=new Stack<>();
		Stack<Integer>s5=new Stack<>();
		Stack<Integer>s6=new Stack<>();
		Stack<Integer>s7=new Stack<>();
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			s1.push(a[i]);
			}
		while(!s1.isEmpty()) {
			s5.push(s1.pop());
		}
		for(int i=0;i<n;i++) {
			
			if(a[i]%2==0) {
			s2.push(a[i]);
			}
			
			}
		 for(int i = 0; i < n; i++) 
		    { 
		       int x = a[i]; 
		        
		       if (a[i] % 2 == 0) 
		       { 
		           x = s2.peek(); 
		           s2.pop(); 
		       } 
		      a[i] = x; 
		   s6.push(a[i]);
		    } 
		 for(int i=0;i<n;i++) {
				
				if(a[i]%1==0) {
				s3.push(a[i]);
				}
				
				}
			 for(int i = 0; i < n; i++) 
			    { 
			       int x = a[i]; 
			        
			       if (a[i] % 1 == 0) 
			       { 
			           x = s3.peek(); 
			           s3.pop(); 
			       } 
			      a[i] = x; 
			   s7.push(a[i]);
			    } 
			 for(int i=0;i<n;i++) {
					b[i]=sc.nextInt();
					s4.push(b[i]);
					}
			 if(s4==s5||s4==s6||s4==s7) {
				 System.out.println("yes");
			 }
			 else {
				 System.out.println("No");
			 }
	}
	}

