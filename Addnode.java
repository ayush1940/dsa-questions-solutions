package binarysearchtree;
import java.util.*;
public class Addnode {
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data,Node left,Node right){
			this.data=data;this.left=left;this.right=right;
		}
	}
	public static Node addnode(Node node,int data) {
		if(node==null) {
			return new Node(data,null,null);
		}
		if(data>node.data) {
			node.right=addnode(node.right,data);
		}
		if(data<node.data) {
			node.left=addnode(node.left,data);
		}
		return node;
	}
	public static void main(String[]args) {
		
	}

}
