package com.lokesh.strings;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
		public static Scanner scanner ;
		public static void main(String[] args) throws NumberFormatException, IOException {
			scanner = new Scanner(System.in);
			System.out.println("hello");
			int tc = scanner.nextInt();		
			while(tc>0){
//				checkIfStringsAreRotationOrNot() ;
//				locateSubStringInString() ;
//				addBinaryStrings() ;
//				checkIfTwoStringsContainsSameCharactersOrNot();
//				findFirstNonRepeatingCharacter() ;
//				reverseWordsInAGivenString() ;
//				countLongestDistinctCharacters() ;
//				System.out.println(checkPalindrome(scanner.nextLine()));
//				findNearestMultipleOfTen() ;
//				weightOfStrings();
				tc--;
			}
		}		
		
//		private static void weightOfStrings() {
//			String s1 = scanner.next() ;
//			String s2 = scanner.next() ;
//			int sum1 = 0,sum2 = 0 ;
//			for(int i=0;i<s1.length();i++)
//				sum1 += (int)s1.charAt(i) ;
//			System.out.println("sum1 is "+sum1);
//			for(int i=0;i<s1.length();i++)
//				sum2 += (int)s2.charAt(i) ;
//			System.out.println("sum2 is "+sum2);
//			if(sum1 > sum2)
//				System.out.println(s1);
//			else if(sum1 == sum2 )
//				System.out.println("equal");
//			else
//				System.out.println(s2);
//		}
		

//	private static void findNearestMultipleOfTen() {
//		String s1 = scanner.next();//12345789
//		String result="";
//		int n = s1.length() ;
//		int k = Integer.parseInt(s1.substring(n-1));
//		if(n == 1){
//		     if(k<=5)
//		    	 result="0";
//		     else
//		    	 result="10";
//		}
//		else{  
//		   if(k<=5)
//			   result=s1.substring(0,n-1)+"0";
//		   else{
//			   int m = n-2;
//			   while(m>=0 && s1.charAt(m)=='9'){
//			      result+="0";
//			      m--;
//			   }
//			   if(m<0)
//				   result="1"+result+"0";
//			   else{
//		    	 int j=(int)(s1.charAt(m)-'0')+1;
//		    	 System.out.println("j is "+j);
//		    	 result=s1.substring(0,m)+j+result+"0";
//			   }
//		   }
//		}
//		System.out.println(result);
//    }
		
		
//		public static String checkPalindrome(String s){
//		    if(s=="") 
//		        return "NO";
//		    s = s.replaceAll("([^A-za-z0-9]+)", "").toLowerCase();
//		    StringBuilder sb = new StringBuilder(s);
//		    sb.reverse();
//		    String rev = sb.toString();
//		    if(s.equals(rev)){
//		        return "YES";
//		    }
//		    else{
//		        return "NO";
//		    }
//		}
		
		
//		private static void countLongestDistinctCharacters() {
//			String s = scanner.next() ;
//			int n = s.length() ;
//			int count = 1 ;
//			int max = count ;
//			int p = 0 ;
//			int[] temp = new int[254] ;
//			for(int i = 0 ; i <temp.length ; i++) 
//				temp[i] = -1 ;
//			
//			temp[s.charAt(0)] = 0 ;
//			for(int i = 1 ; i < n ; i++) {
//				p = temp[s.charAt(i)] ;
//				if(p == -1 || i - count > p ) 
//					count++ ;
//				
//				else {		
//					if(count > max )
//						max = count ;
//					
//					count = i - p ;
//				}
//				temp[s.charAt(i)] = i ;
//			}
//			if(count > max )
//				max = count ;
//
//			System.out.println(max);
//		}
		

//	private static void reverseWordsInAGivenString() {
//		String s = scanner.next() ;
//		int n = s.length() ;
//		int lastIndex = n ;
//		int previousIndex = 0;
//		String result = "" ;
//		for(int i=n-1;i>=0;i--) {
//			if(s.charAt(i) == '.') {
//				result = result + s.substring(i+1,lastIndex) +".";
//				lastIndex = i ;
//			}
//			previousIndex = i ;
//		}
//		result += s.substring(previousIndex,lastIndex) ;
//		System.out.println(result);
//	}
	
//	private static void findFirstNonRepeatingCharacter() {
//        int n =scanner.nextInt();
//        boolean flag = true ;
//        char c[] = scanner.next().toCharArray();
//        HashMap<Character,Integer>h=new HashMap<>();
//        for(int i=0;i<n;i++){
//            if(h.containsKey(c[i]))
//                h.put(c[i],h.get(c[i])+1);
//            else 
//            	h.put(c[i],1);
//        }
//        for(int i=0;i<n;i++){
//            if(h.get(c[i]) == 1 ){
//                System.out.println(c[i]);
//                flag = false ;
//                break ;
//            }
//            else
//                flag = true ;
//        }
//        if(flag)
//          System.out.println(-1);
//        h.clear();
//	}
	
//	private static void checkIfTwoStringsContainsSameCharactersOrNot() {
//	        char c[]=scanner.next().toCharArray();
//	        char d[]=scanner.next().toCharArray();
//	        HashMap<Character,Integer>h=new HashMap<>();
//	        int n=c.length;
//	        for(int i=0;i<n;i++){
//	            if(h.containsKey(c[i])){
//	                h.put(c[i],h.get(c[i])+1);
//	            }
//	            else {
//	            	h.put(c[i],1);
//	            }
//	        }
//	        int p=0;
//	        for(int i=0;i<n;i++){
//	            if(h.containsKey(d[i])){
//	                if(h.get(d[i])==1)
//	                	h.remove(d[i]);
//	                else
//	                	h.put(d[i],h.get(d[i])-1);
//	            }
//	            else{
//	                System.out.println("NO");
//	                p=1;
//	                break;
//	            }
//	        }
//	        if(p==0 && h.isEmpty())
//	        System.out.println("YES");
//	        h.clear();
//	}

//	private static void addBinaryStrings() {
//		String a = scanner.next() ;
//		String b = scanner.next() ;
////		long sum = toDecimal(s1) + toDecimal(s2) ; 
////		System.out.println(toBinary(sum));
//
//        // Initialize result and Initialize digit sum  
//        String result = "";            
//        int s = 0;          
//  
//        // Traverse both strings starting from last characters 
//        int i = a.length() - 1, j = b.length() - 1; 
//        
//        while (i >= 0 || j >= 0 || s == 1){     	
//        	if(i>=0) 
//        		if(a.charAt(i) == '1' )
//        			s++ ;
//        	if(j>=0) 
//        		if(b.charAt(j) == '1' )
//        			s++ ;
//            // If current digit sum is 1 or 3, add 1 to result 
//            result = (s % 2) + result; 
//            
//            // Compute carry 
//            s /= 2; 
//  
//            // Move to next digits 
//            i--; j--; 
//        } 
//    System.out.println(result);    
//	}
	
//	private static String toBinary(long n) {
//		String sum = "0" ;
//		String result = "" ;
//		while(n>0) {
//			sum = Long.toString(n % 2) ;
//			n = n / 2 ;
//			result = sum + result ;
//		}
//		return result;
//	}
//	
//	private static long toDecimal(String s) {
//		int n = s.length() ;
//		long sum = 0 ;
//		for(int i = n-1 ;i>=0;i--) 
//			if(s.charAt(i) == '1') 
//				sum += Math.pow(2, n-i-1) ;
//		return sum ;
//	}
	
//	private static void locateSubStringInString() {
//		String s = scanner.next() ;
//		String ss = scanner.next() ;
//		int n = s.indexOf(ss) ;
//		if(n>0 || s.equals(ss))
//			System.out.println(n);
//		else
//			System.out.println(-1);
//	}
	
//	private static void checkIfStringsAreRotationOrNot() {
//		String s1 = scanner.next() ;
//		String s2 = scanner.next() ;
//		if(s1.length() == s2.length()) {
//			s1 = s1+s1 ;
//			if(s1.contains(s2))
//				System.out.println(1);
//			else
//				System.out.println(0);
//		}
//		else
//			System.out.println(0);
//	}

}
