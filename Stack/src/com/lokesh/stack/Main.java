package com.lokesh.stack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
	
//	public static Scanner f ;
	public static FastReader f ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Hello");
		f = new FastReader() ;
//		f = new Scanner(System.in);
//		int tc = f.nextInt() ;
		int tc = f.nextInt() ;
		while(tc-- > 0){
//			paranthesisChecker(f.nextLine()) ;
//			reverseAStringUsingStack(f.nextLine()) ;
//			findImmediateSmallerElement() ;
//			stockSpanProblem();
			longestValidParanthesis() ;
		}
	}
	

	private static void longestValidParanthesis() {
		String s = f.next() ;
		Stack<Integer> stack = new Stack<>() ;
		int n = s.length() ;
		int max = 0 ;
		stack.push(-1) ;
		for(int i=0;i<n;i++) {
			if(s.charAt(i) == '{')
				stack.push(i) ;
			
			else {
				stack.pop() ;
				
				if(stack.isEmpty())
					stack.push(i) ;
				else {
					int diff = i-stack.peek() ;
					max = max > diff ? max : diff ;
				}
			}
		}
		System.out.println(max);
	}


	private static void stockSpanProblem() {

		int n = f.nextInt() ;
		int arr[] = new int[n] ;
		int s[] = new int[n] ;
		
		for(int i=0;i<n;i++)
			arr[i] = f.nextInt() ;
		
		s[0] = 1 ;
		
		for(int i = 1 ; i < n ; i++ ) { 
			s[i] = 1 ;
			for(int j = i-1 ; j >= 0 && arr[i] >= arr[j] ; j-- )
				s[i]++ ; 	//s[i] = s[i]+1 ;
		}
		for(int i=0;i<n;i++)
			System.out.print(s[i]+" ");
		System.out.println();
	}


	private static void findImmediateSmallerElement() {
		int n = f.nextInt() ;
		int arr[] = new int[n] ;
		for(int i=0;i<n;i++)
			arr[i] = f.nextInt() ;
			
		StringBuilder sb = new StringBuilder() ;

		for(int i=0;i < n-1 ;i++) {
			if(arr[i+1] < arr[i])
				sb.append(arr[i+1]+" ") ;
			else
				sb.append(-1+" ") ;
		}
		sb.append(-1+" ") ;
		System.out.println(sb.toString());
	}


	private static void reverseAStringUsingStack(String s) {
		Stack<Character> stack = new Stack<>() ;
		int i = 0 ;
		while(i < s.length()) {
			stack.push(s.charAt(i)) ;
			i++;
		}
		String rev = "" ;
		i = 0 ;
		while(i < s.length()) {
			rev += stack.pop() ;
			i++ ;
		}
		System.out.println(rev);
	}
	
	
	private static void paranthesisChecker(String string) {
		Stack<Character> s = new Stack<>();
		boolean notBalanced = false ;
		for(int i = 0;i<string.length();i++) {
	    	if(string.charAt(i) == '}') {
	    		if(!s.isEmpty() && s.peek() == '{')
	    			s.pop() ;
	    		else {
	    			notBalanced = true ;
	    			break ;	    			
	    		}
	    	}
	    	else if(string.charAt(i) == ']') {
	    		if(!s.isEmpty() && s.peek() == '[')
	    			s.pop() ;
	    		else {
	    			notBalanced = true ;
	    			break ;	    			
	    		}
	    	}
	    	else if(string.charAt(i) == ')') {
	    		if(!s.isEmpty() && s.peek() == '(')
	    			s.pop() ;
	    		else {
	    			notBalanced = true  ;
	    			break ;	    			
	    		}
	    	}
	    	else
	    		s.push(string.charAt(i)) ;
		}
		if(s.isEmpty() && !notBalanced)
			System.out.println("balanced");
		else
			System.out.println("not balanced");
	}
}
