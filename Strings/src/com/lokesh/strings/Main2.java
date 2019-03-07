package com.lokesh.strings;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
	public static Scanner scanner ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		scanner = new Scanner(System.in);
		System.out.println("hello");
		int tc = scanner.nextInt();		
		while(tc>0){
//			printUncommonCharacters() ;
//			checkIfRearrangedToFormPalindrome() ;
//			findKthCharacter() ;
//			checkAnagram();
			tc--;
		}
	}

//	private static void checkAnagram() {
//		String s1 = scanner.next() ;
//		String s2 = scanner.next() ;
//		int[] c1 = new int[26]  ;
//		int[] c2 = new int[26]  ;
//		
//		for(int i=0;i<s1.length();i++)
//			c1[s1.charAt(i) - 'a']++ ;
//		
//		for(int i=0;i<s2.length();i++)
//			c2[s2.charAt(i) - 'a']++ ;
//		
//		int count = 0 ;
//		for(int i=0;i<26;i++)
//			count += Math.abs(c1[i] - c2[i]) ;
//		
//	    System.out.println(count);
//	}

	
//	private static void findKthCharacter() {
//		int m = scanner.nextInt() ;
//		int k = scanner.nextInt() ;
//		int n = scanner.nextInt() ;
//
//		String s = "" ;
//		while(m > 0) {
//			s += m%2 ;
//			m = m/2 ;
//		}
//		
//		char[] arr = s.toCharArray(); 
//	    for(int i = 0;i < arr.length / 2; i++){ 
//	        char temp = arr[i];  
//	        arr[i] = arr[arr.length - i - 1];  
//	        arr[arr.length - i - 1] = temp;  
//	    } 
//	    s = new String(arr) ;
//		
//		String s1 = ""; 
//	    for (int x = 0; x < n; x++){   
//	    	for (int y = 0 ; y < s.length(); y++){ 
//	            if (s.charAt(y) == '1')  
//		            s1 += "10"; 
//	            else
//	            	s1 += "01";      
//	        } 
//	        s = s1; 
//	        s1 = ""; 
//	    } 
//        System.out.println(s.charAt(k));	    
//	}

	
	
//	private static void checkIfRearrangedToFormPalindrome() {
//		
//		String s = scanner.next() ;
//		int[] a = new int[256] ;
//		for(int i=0;i<a.length ;i++)
//			a[i] = 0 ;
//			
//		for(int i=0;i<s.length();i++) {
//			a[s.charAt(i)] = a[s.charAt(i)] + 1 ;
//		}
//		
//		int c = 0 ;
//		for(int i=0;i<a.length;i++)
//			if(a[i] % 2 != 0)
//				c++ ;
//		
//		System.out.println(c < 2 ? "Yes" : "No");		
//	}

//	private static void printUncommonCharacters() {
//		String s1 = scanner.next() ;
//		String s2 = scanner.next() ;
//		for(char c = 'a' ;  c<= 'z' ; c++ ) {
//			if(s1.indexOf(c) >= 0 && s2.indexOf(c) < 0 || s1.indexOf(c) < 0 && s2.indexOf(c) >= 0)
//				System.out.print(c);
//			else
//				continue ;
//		}
//	}	
	
}
