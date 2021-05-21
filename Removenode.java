package binarysearchtree;
import java.util.*;

import binarysearchtree.Displaybst.Node;
public class Removenode {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data,Node left,Node right){
			this.data=data;this.left=left;this.right=right;
		}
	}
	public static class pair{
	     Node node;
	     int state;
	     pair(Node node,int state){
	    	 this.node=node;this.state=state;
	     }
	}
	public static int max(Node node) {
		if(node.right!=null) {
			return max(node.right);
		}else {
			return node.data;
		}
	}
	public static void display(Node node) {
		if(node==null) {
			return;
		}
		String ans="";
		ans+=node.left== null?".":node.left.data;
		ans+="<-"+node.data+"->";
		ans+=node.right==null?".":node.right.data;
		System.out.println(ans+" ");
		display(node.left);
		display(node.right);
	}
	public static Node removenode(Node node,int data) {
		if(node==null) {
			return null;
		}
		if(data<node.data) {
			node.left=removenode(node.left,data);
		}
		else if(data>node.data){
			node.right=removenode(node.right,data);
		}else {
			if(node.left!=null&&node.right!=null) {
				int lp=max(node.left);
				node.data=lp;
				node.left=removenode(node.left,lp);
			}
			if(node.left!=null) {
				return node.left;
			}
			if(node.right!=null) {
				return node.right;	
			}
		}
		return node;
	}

	   public static void main(String[] args) {
		Integer arr[]= {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		Node root=new Node(arr[0],null,null);
		pair rtp=new pair(root,1);
		Stack<pair> stack=new Stack<>();
		stack.push(rtp);
		int idx=0;
		while(stack.size()>0) {
			pair top=stack.peek();
			if(top.state==1) {
				idx++;
				if(arr[idx]!=null) {
					top.node.left=new Node(arr[idx],null,null);
					pair lp=new pair(top.node.left,1);
					stack.push(lp);
				}else {
					top.node.left=null;
				}
				top.state++;
			}
			
			if(top.state==2) {
				idx++;
				if(arr[idx]!=null) {
					top.node.right=new Node(arr[idx],null,null);
					pair rp=new pair(top.node.right,1);
					stack.push(rp);
				}else {
					top.node.right=null;
				}
				top.state++;
			}else {
				stack.pop();
			}
			
			
		}
		removenode(root,70);
		display(root);

	}

}
