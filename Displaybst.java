package binarysearchtree;
import java.util.*;
public class Displaybst {
	public static class Node{
		Integer data;
		Node left;
		Node right;
		Node(Integer data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	public static Node constructbst(int arr[],int low,int hi) {
		if(low>hi) {
			return null;
		}
		int mid=(low+hi)/2;
		Node lc=constructbst(arr,low,mid-1);
		Node rc=constructbst(arr,mid+1,hi);
		Node node=new Node(arr[mid],lc,rc);
		return node;
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
	public static void main(String[] args) {
		int arr[]= {12,25,37,50,62,75,87};
		Node root=constructbst(arr,0,arr.length-1);
		display(root);
	}

}
