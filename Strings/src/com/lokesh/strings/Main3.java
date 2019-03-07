package com.lokesh.strings;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static Scanner scanner ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		scanner = new Scanner(System.in);
		System.out.println("hello");
		int tc = scanner.nextInt();		
		while(tc>0){
//			goodOrBadString() ;
//			mergeTwoStringsAlternatively() ;
//			sortInLexographicalDecendingOrder();
			tc--;
		}
	}
	
//	private static void sortInLexographicalDecendingOrder() {
//		String s = scanner.next() ;
//		char[] c = s.toCharArray() ;
//		Arrays.sort(c);
//		int n = c.length ;
//		for(int i=0;i< n/2;i++) {
//			char temp = c[i] ;
//			c[i] = c[n-i-1] ; 
//			c[n-i-1] = temp ;
//		}
//		
//		s = new String(c) ;
//		System.out.println(s);
//	}
	
//	private static void mergeTwoStringsAlternatively() {
//		String str1 = scanner.next() ;
//		String str2 = scanner.next() ;
//		String result ="" ;
//		
////		if str1 is bigger 
//		if(str2.length() < str1.length()){
//			for(int i = 0; i < str2.length(); i++){
//				result = result + str1.charAt(i) + str2.charAt(i);
//			}
//			result = result + str1.substring(str2.length());
//		}
//		
////		if str2 is bigger 
//		else if(str2.length() > str1.length()){
//			for(int i = 0; i < str1.length(); i++){
//				result = result + str1.charAt(i) + str2.charAt(i);
//			}
//			result = result + str2.substring(str1.length());
//		}
//		
////		if both are equal
//		else{
//			for(int i = 0; i < str1.length(); i++){
//				result = result + str1.charAt(i) + str2.charAt(i);
//			}
//		}
//		System.out.println(result) ;
//	}
	
//	private static void goodOrBadString() {
//		String s = scanner.next() ;
//		int v = 0 ;
//		int c = 0 ;
//		int z = 0 ;
//		for(int i=0;i<s.length();i++) {
//			if((s.charAt(i) == 'a') || (s.charAt(i) == 'e')  ||(s.charAt(i) == 'i') ||(s.charAt(i) == 'o') ||(s.charAt(i) == 'u')) {
//				c = ( c<=5 ) ? 0 : c ;
//				v++ ;	            
//			}
//			else if(s.charAt(i) != '?') {
//				v = ( v<=5 ) ? 0 : v ;
//				c++ ;
//			}			
//			else 
//				z++ ;
//			
//			if( c + z > 3 ||  v + z > 5 ) {
//				System.out.println("0");
//				return ;
//			}
//			
//		}
//		if( c + z > 3 ||  v + z > 5 )
//			System.out.println("0");
//		else
//			System.out.println("1");		
//	}	
}
