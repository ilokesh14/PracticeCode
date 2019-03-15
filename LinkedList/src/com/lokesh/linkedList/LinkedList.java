package com.lokesh.linkedList;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;


public class LinkedList {
	public static Scanner f ;
 //	public static FastReader f ;
	static Node head  ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Hello");
//		f = new FastReader() ;
		f = new Scanner(System.in);
		int tc = f.nextInt() ;
		while(tc-- > 0){
			push(new Node(8));
			push(new Node(7));
			push(new Node(6));
			push(new Node(5));
			push(new Node(4));
			push(new Node(3));
			push(new Node(2));
				
			printLinkedListElement(head);
//			countNodesOfTheLinkedList(head);
//			getNthNodeOfTheLinkedList(head,2) ;
//			deleteANodeInTheLinkedList(head,5) ;
//			getMiddleElementInALinkedList(head) ;
//			deleteNnodesAfterMFromALinkedList(head,2,1) ;
//			printLinkedListElement(head);
//			System.out.println(getNthNodeFromTheLast(head,3)); ;
//			removeEveryKthNode(head,2) ;
//			sortLinkedListOf012(head);
//			rearrangeOddEvenLinkedList(head) ;
//			removeDupliacatesFromSortedList(head) ;
//			removeDupliacatesFromUnSortedList(head) ;
//			pairWiseSwapLinkedListElements(head) ;
//			checKIfLinkedListIsPalindrome(head) ;
//			reverseTheLinkedListIterative(head) ;
//			printLinkedListElement(head);
//			detectLoopInALinkedList(head) ;
//			countNodesInTheLoopInAaLinkedList(head) ;
//			insertIntoSortedLinkedList(head,1) ;
//			mergeTwoSortedLists(head,head);
//			intersectionPointOfTwoLinkedLists(head,head) ;
//			removeTheLoopInALinkedList();
//			cloneALinkedList(head);
			reverseGroupOfGivenSize(head,3) ;
		}
	}	
	

	private static Node reverseGroupOfGivenSize(Node head, int k) {
		Node c = head ;
		Node n = null ;
		Node p = null ;
		int count = k ;
		while( c != null && count > 0 ) {
			n = c.next ;
			p = c ;
			c = n ;
			count-- ;
		}
		if(n != null)
			head.next = removeEveryKthNode(head, k) ;
		return p ;
	}

	private static Node cloneALinkedList(Node head) {
		Map<Node, Node> map = new HashMap<Node, Node>() ;
		Node temp = head ;
		Node node ;
		while(temp != null) {
			node = new Node(temp.data) ;
			node.next = null ;
			map.put(temp, node) ;
			temp = temp.next ;
		}
		temp = head ;
		while(temp != null) {
			node = map.get(temp) ;
			node.next = map.get(temp.next) ;
			temp = temp.next ;
		}		
		return map.get(head) ;
	}

	private static void removeTheLoopInALinkedList() {
		Node s = head ;
		Node f = head ;
		while(f != null && f.next != null) {
			s = s.next ;
			f = f.next.next ;
			if(s == f){
			    break ;
			}
		}		
		if (s == f) { 
            s = head ; 
            while (s.next != f.next) { 
                s = s.next; 
                f = f.next; 
            } 
           f.next = null; 
        }
	}


	private static int intersectionPointOfTwoLinkedLists(Node h1, Node h2) {
		int x = 0 ;
		int y = 0 ;
		int d = 0 ;
		Node l1 = h1 ;
		Node l2 = h2 ;
		while(l1 != null) {
			x++ ;
			l1 = l1.next ;
		}
		while(l2 != null) {
			y++ ;
			l2 = l2.next ;
		}
		if(x>y) {
			d = x-y ; 
			l1 = h1 ;
			l2 = h2 ;
		}
		else {
			d = y - x ;
			l2 = h1 ;
			l1 = h2 ;
		}
		for(int i=0;i<d;i++)
			l1 = l1.next ;
		
		while(l1 != null && l2 != null) {
			if(l1 == l2)
				return l1.data ;
			l1 = l1.next ;
			l2 = l2.next ;
		}
		return 0 ;
	}

	private static Node mergeTwoSortedLists(Node h1, Node h2) {
		if(h1 == null)	return h2 ;
		if(h2 == null)	return h1 ;
		Node h = new Node(0) ;
		if(h1.data <= h2.data) {
			h = h1 ;
			h.next = mergeTwoSortedLists(h1.next, h2);
		}
		else {
			h = h2 ;
			h.next = mergeTwoSortedLists(h2.next, h1);
		}
		return h ;
	}

	private static Node insertIntoSortedLinkedList(Node head,int key) {		
		Node c = head ;
		if(head == null) 
			return new Node(key) ;
        else{
			Node newNode = new Node(key) ;
			Node temp = null ;
			while(c != null && c.data < key) {
				temp = c ;
				c = c.next ;
			}
			newNode.next = c ;
			temp.next = newNode ;
        }
		return head ;
	}

	private static int countNodesInTheLoopInAaLinkedList(Node head) {
			Node s = head ;
			Node f = head ;
			int c = 0 ;
			boolean b = false ;
			while(f != null && f.next != null) {
				s = s.next ;
				f = f.next.next ;
				if(s == f){
				    b = true ;
				    break ;
				}
			}
			if(b){
	    		while(f != null){
	    	        f = f.next ;
	    	        c++ ;
	    	        if(s == f)
	    	            return c ;
	    	    }
			}
		   return 0 ;
	}

	private static void detectLoopInALinkedList(Node head) {
		Node s = head ;
		Node f = head ;
		boolean b = false ;
		while(f != null && f.next != null) {
			s = s.next ;
			f = f.next.next ;
			if(s == f){
			    b = true ;
			    break ;
			}
		}
		if(b)
			System.out.println("No loop");
		else 
			System.out.println("loop");
	}

	//Iterative
	private static Node reverseTheLinkedListIterative(Node head) {
		Node c = head ;
		Node p = null ;
		while(c != null) {
			Node n = c.next ;
			c.next = p ;
			p = c ;
			c = n ;
		}
		printLinkedListElement(p);
		return p ;
	}
	
	private static Boolean checKIfLinkedListIsPalindrome(Node head) {
		Stack<Integer> s = new Stack<>() ;
		int c = 0 ;
		if(head != null) {
			Node node = head ;
			while(node != null ) {
				c++ ;
				s.push(node.data) ;
				node = node.next ;
			}

			node = head ;
			while(node != null ) {
				if(node.data == s.pop())
					c-- ;
				else
					return false ;
				node = node.next ;
			}
		}
		if(c == 0)
			return true ;
		return false ;
	}

	private static Node pairWiseSwapLinkedListElements(Node head) {
		if(head != null) {
			Node node = head ;
			while(node != null && node.next != null) {
				int data = node.data ;
				node.data = node.next.data ;
				node.next.data = data ;
				
				node = node.next.next ;
			}
		}
		return head;
	}


	private static Node removeDupliacatesFromUnSortedList(Node head) {
        HashSet<Integer> hs = new HashSet<>(); 
        Node node = head; 
        Node temp = null;       
        while (node != null)  {           
            if (hs.contains(node.data)) 
            	temp.next = node.next;             
            else { 
                hs.add(node.data); 
                temp = node; 
            } 
            node = node.next; 
        }
		return head; 
  }


	private static Node removeDupliacatesFromSortedList(Node head) {
		if(head != null) {
			Node node = head ;
			while(node != null && node.next != null) {
				if(node.data == node.next.data) {
					node.next = node.next.next ;
				}
				else
				node = node.next ;
			}
		}
		return head;
	}


	private static void sortLinkedListOf012(Node head2) {
	    int x = 0 ;int y = 0 ;int z = 0 ;
	    if(head != null){
	        Node node = head ;
	        while(node != null){
	            if(node.data == 0)	
	            	x++ ;
	            else if(node.data == 1)	
	            	y++ ;
	            else
	                z++ ;
	            
	            node = node.next ;
	        }
	        node = head ;
	        while(node != null){
	            while(x-- > 0){
	                node.data = 0 ;
	                node = node.next ;
	            }
	            while(y-- > 0){
	                node.data = 1 ;
	                node = node.next ;
	            }
	            while(z-- > 0){
	                node.data = 2 ;
	                node = node.next ;
	            }
	        }
	    }
	}

	private static Node removeEveryKthNode(Node head, int k) {
        if(k == 1)
            return null ;
        if(k == 0)
            return head ;
        
        Node node = head ;
    	Node temp = head ;

    	while (node != null){  
            for (int i = 1; i < k-1 && node != null; i++)  
                node = node.next;  
           
            if (node == null)  
                return head ;  
            
            temp = node.next;
            if(temp != null)
                temp = temp.next;
                
            node.next = temp;
            node = temp;
        }  
    	return head ;
	}

	private static int getNthNodeFromTheLast(Node head,int n) {
        Node node = head ;
        int count = 0 ;
        while(node != null){
            count++ ;
            node = node.next ;
        }
        node = head ;
        int x = 0 ;
        count = count - n ;
        while(node != null){
            if(count == x )
                return node.data ;
            x++ ;
            node = node.next ;
        }
        return -1 ;
    }


	private static void push(Node node) {
    	node.next = head ;
    	head = node ;
    }

	private static Node deleteNnodesAfterMFromALinkedList(Node head, int M, int N) {
    	Node node = head ;
    	int count  ;
    	Node temp = head ;
    	while (node!=null){  
            // Skip M nodes 
            for (count = 1; count < M && node != null; count++)  
                node = node.next;  
      
            // If we reached end of list, then return  
            if (node == null)  
                return head ;  
      
            // Start from next node and move N nodes forward so that those can be ignored  
            temp = node.next;  
            for (count = 1; count <= N && temp != null; count++)
                temp = temp.next;  
            
            // Link the previous list with the node after ignored nodes  
            node.next = temp;  
      
            // Set current pointer for next iteration starting from the next of ignored node 
            node = temp;  
        }  
    	return head ;
    }


	private static int getMiddleElementInALinkedList(Node head) {
        Node node = head ;
        int count = 0 ;
        while(node != null){
            count++ ;
            node = node.next ;
        }
        node = head ;
        int x = 0 ;
        while(node != null){
            if(count/2 == x )
            	break ;
            x++ ;
            node = node.next ;
        }
        return node.data ;
    }

	private static Node deleteANodeInTheLinkedList(Node head, int x) {
        Node node = head ;
    	int count = 1 ;
    	if(x == 1){
    	    head = head.next ;
    	    return head ;
    	}
    	while(node != null ) {
    		if(count == x-1)
    			node.next = node.next.next ;
    		count++ ;
    		node = node.next ;
    	}
    	return head ;
    }

	boolean isCircular(Node head){
	    if(head == null) 
	    	return true ;
	    Node temp = head ;
	    while(temp.next != null){
	        if(temp.next == head)
	            return true ;
	        temp = temp.next;
	    }
	    return false ;
    }

	private static void countNodesOfTheLinkedList(Node head) {
		int count = 1 ;
		while(head != null) {
			head = head.next ;
			count++ ;
		}
		System.out.println(count);
	}
	
	public static int getNthNodeOfTheLinkedList(Node head, int i){
        int count = 1 ;
        while(head != null){
            if(count == i )
                return head.data ;
            head = head.next ;
            count++ ;
        }
        return -1 ;
    }

	private static void printLinkedListElement(Node head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next ;
		}
		System.out.println();
	}	
}
