package hackerearth;


import java.util.Scanner;
import java.util.Stack;

public class chef {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Stack<Integer> stack=new Stack<>();
	boolean isbalanced=true;
	int t=sc.nextInt();
	while(t-->0) {
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			if(a[j]==1) {
				stack.push(j);
				continue;
			}
			else if(a[j]==0) {
				if(stack.isEmpty()) {
					isbalanced=false;
					break;
					
				}
				else {
					stack.pop();
				}
			}
		}
		if(isbalanced) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	}
}