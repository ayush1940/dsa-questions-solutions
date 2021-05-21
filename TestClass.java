package hackerearth;


import java.util.*;
class TestClass {
    public static void main(String args[] )  {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       String str=s.toLowerCase();
       int count1=0;
       int count2=0;
       for(int j=0;j<s.length();j++){
    	   char ch=str.charAt(j);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
               count1=count1+1;
           }
           if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                count2=count2+1;
           }
       }
       System.out.println("Numbers of vowels are "+count1);
       System.out.println("Numbers of digits are "+count2);
    }
}
