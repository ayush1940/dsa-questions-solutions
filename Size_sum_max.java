package binarytree;
import java.util.*;
public class Size_sum_max {
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
	public static int size(Node node) {
		if(node==null) {
			return 0;
		}
		int ls=size(node.left);
		int rs=size(node.right);
		return ls+rs+1;
	}
	public static int sum(Node node) {
		if(node==null) {
			return 0;
		}
		int ls=sum(node.left);
		int rs=sum(node.right);
		return ls+rs+node.data;
	}
	public static int height(Node node) {
		if(node==null) {
			return -1;
		}
		int ls=height(node.left);
		int rs=height(node.right);
		int th=Math.max(ls, rs);
		return th+1;
	}
	public static int max(Node node) {
		if(node==null) {
			return Integer.MIN_VALUE;
		}
		int ls=max(node.left);
		int rs=max(node.right);
		int tm=Math.max(node.data, Math.max(ls, rs));
		return tm;
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		Integer arr[]= {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
		Node root=new Node(arr[0],null,null);
		pair rtp=new pair(root,1);
		Stack<pair> st=new Stack<>();
		st.push(rtp);
		pair top=st.peek();
		int idx=0;
		while(st.size()>0) {
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
			}else if(top.state==1) {
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
		System.out.println(sum(root));

	}
}
