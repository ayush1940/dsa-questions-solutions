package binarytree;
import java.util.*;
public class displaybinarytree {
   public static class Node{
	   int data;
	   Node left;
	   Node right;
	   Node(int data,Node left,Node right){
		   this.data=data;
		   this.left=left;
		   this.right=right;
	   }
   }
   public static class pair{
	   Node node;
	   int state;
	   pair(Node node,int state){
		   this.node=node;
		   this.state=state;
	   }
   }
   public static void display(Node node){
	   if(node==null) {
		   return;
	   }
	   String ans="";
	   ans+=node.left==null?".":node.left.data;
	   ans+="<-"+node.data+"->";
	   ans+=node.right==null?".":node.right.data;
	   System.out.println(ans);
	   display(node.left);
	   display(node.right);
	   
	   
   }
   //if state is 1 means add pair to left of root,2 means add pair to right of root,3 means pop the pair.
   public static void main(String[] args) {
	   Integer arr[]= {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
	   Node root=new Node(arr[0],null,null);
	   pair rtp=new pair(root,1);
	   Stack<pair>st=new Stack<>();
	   st.push(rtp);
	   int idx=0;
	   while(st.size()>0) {
		   pair top=st.peek();
		   if(top.state==1) {
			   idx++;
			   if(arr[idx]!=null) {
				   top.node.left=new Node(arr[idx],null,null);
				   pair lp=new pair(top.node.left,1);
				   st.push(lp);
			   }else {
				   top.node.left=null;
			   }
			   top.state++;
		   }else if(top.state==2) {
			   idx++;
			   if(arr[idx]!=null) {
				   top.node.right=new Node(arr[idx],null,null);
				   pair rp=new pair(top.node.right,1);
				   st.push(rp);
			   }else {
				   top.node.right=null;
			   }
			   top.state++;
		   }else {
			   st.pop();
		   }
	   }
	   display(root);
	  
   }
}
