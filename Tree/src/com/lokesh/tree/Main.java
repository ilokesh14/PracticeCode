package com.lokesh.tree;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static Scanner f ;
//	public static FastReader f ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Hello");
//		f = new FastReader() ;
		f = new Scanner(System.in);
		int tc = f.nextInt() ;
		while(tc-- > 0) {
			Node n1 = new Node(1) ;
			Node n2 = new Node(2) ;
			Node n3 = new Node(3) ;
			n2.left = n1 ;
			n2.right = n3 ;

			System.out.println("Preorder");
			preorder(n2);
			System.out.println();
			System.out.println("Inorder");
			inOrder(n2);
			System.out.println();
			System.out.println("Postorder");
			postOrder(n2);
			System.out.println();
			System.out.println("LevelOrder");
			levelOrderOrBFS(n2);
		}
	}

	static void inOrder(Node root){
        if(root == null)
            return ;
        inOrder(root.left) ;
        System.out.print(root.data+" ") ;
        inOrder(root.right) ;
    }

	static void preorder(Node root){
        if(root == null)    return ;
        System.out.print(root.data+" ") ;
        preorder(root.left) ;
        preorder(root.right) ;
    }

	static void postOrder(Node root){
        if(root == null)    return ;
        postOrder(root.left) ;
        postOrder(root.right) ;
        System.out.print(root.data+" ") ;
    }

	static int countLeaves(Node node){
        if(node == null)
            return 0 ;
        if(node.left == null || node.right == null) 
            return 1 ;
        return countLeaves(node.left) + countLeaves(node.right) ;
    }

	static int height(Node node) {
        if(node == null)    return 0 ;
        else{
        	int c1 = 1+height(node.left) ;
            int c2 = 1+height(node.right) ;
            return c1>c2 ? c1:c2 ;
        }
    }

	static void levelOrderOrBFS(Node root) {
    	if(root == null)	
    		return ;
    	else{
	   		Queue<Node> q = new LinkedList<>();
	    	q.add(root) ;
	    	while(!q.isEmpty()) {
	    		Node node = q.poll() ;
	    		System.out.print(node.data+" ");
	    		if(node.left != null)
	    			q.add(node.left) ;
	    		if(node.right != null)
	    			q.add(node.right) ;    		
	    	}
    	}
    	System.out.println();
    }
	
	
}
