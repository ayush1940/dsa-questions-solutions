package hackerearth;
import java.math.*;
import java.util.*;
public class lastdigit {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	String s=String.valueOf(a);
	BigDecimal b1 = new BigDecimal(s).stripTrailingZeros();
	String s1=b1.toString();
	s1=s1.substring(s1.indexOf(".")+1);
	int num=Integer.valueOf(s1);
	int b=num%10;
	if(b==1) {
		System.out.println("even");
	}
	else if(b%2==0) {
		System.out.println("even");
	}else {
		System.out.println("odd");
	}
    
	}

}
