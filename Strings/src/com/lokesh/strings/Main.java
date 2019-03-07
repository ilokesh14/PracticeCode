package com.lokesh.strings;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static Scanner s ;
	public static void main(String[] args) throws NumberFormatException, IOException {

		s = new Scanner(System.in);
		System.out.println("hello");
		//		BufferReader object is created here to read the data from the screen and append it to the buffer
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = s.nextInt();
		
		while(tc>0){
			//			It reads a line from the screen until enter is pressed 
			//			String[] s = br.readLine().trim().split(" ");
			//			int n1 = Integer.parseInt(s[0]) ;
			//			int n2 = Integer.parseInt(s[1]) ;
			//			StringBuffer sb = new StringBuffer();
			//			convertToUpperCase(s);
			//			checkPalindrome(s,n);
			
//			checkSubSequence();
//			findFirstRepeatedCharacter() ;
//			findMaxNumberFromAlphanumericString();
//			PrintUncommonCharacters() ;
			tc--;
		}
	}
	
//	private static void findMaxNumberFromAlphanumericString() {
//		String string = s.next() ;
//		char[] c = string.toCharArray() ;
//		int x = 0;
//		int j = -1;
//		int z = 1 ;
//		int max = -1 ;
//		for(int i = string.length()-1 ;i>=0 ;i--) {
//			if(  c[i] <= '9' && c[i] >= '0' ) {
//				x = Character.getNumericValue(c[i]) ;
//				if(j < 0) 
//					j = x ;
//				else {
//					z*=10 ;
//					j =  j + x*z ; 
//				}
//				max = max > j ? max : j ;
//			}
//			else {
//				z = 1 ;
//				j = -1 ;
//			}
//		}
//		System.out.println(max);
//	}
	
//	private static void findFirstRepeatedCharacter() {
//		 String a = s.next();
//	     int n = a.length();	     
//	     int i,j ;
//	     boolean b = false ;
//	     for( i=0 ; i < n ; i++){
//	    	  for( j = 1+i ; j < n ; j++){
//	    		  if(a.charAt(i) == a.charAt(j)) {
//	    			  b = true ;
//	    			  break ;
//	    		  }
//	         }
//	 	     if(b) {
//	 	        System.out.println(a.charAt(i));
//	 	        break ;
//	 	     }
//	     }
//	     if(!b)
//	     System.out.println(-1);
//	}

	
//		private static void checkSubSequence() {
//			 String a = s.next();
//		     String b = s.next();
//		     int m = a.length();
//		     int n = b.length();	     
//		     int i,j ;
//		     for( i=0 , j=0 ; i < n && j < m ; i++){
//		         if(a.charAt(j) == b.charAt(i))
//		            j++;
//		     }
//		     if(j==m)
//		        System.out.println("1");
//		     else
//		        System.out.println("0");
//		}


//		private static void checkPalindrome(String string,int n) {
//			if(!string.isEmpty()) {
//				int count = 0 ;
//				for(int i=0;i<= n/2;i++) {
//					if(string.charAt(i) == string.charAt(n-i-1)) {
//						count++ ;
//						System.out.println(count+" "+string.charAt(i));
//					}
//				}
//				if(count> n/2)
//					System.out.println("Yes");
//				else 
//					System.out.println("No");
//			}
//		}

//		private static void convertToUpperCase(String s) {
//			char[] c = s.toCharArray() ;
//			if(c[0] != ' ' && c[0] != '\0')
//				c[0] = Character.toUpperCase(c[0]) ;
//			
//				for(int i = 0 ; i<c.length ; i++) {
//					
//					if(c[i] == ' ') {
//						i++ ;
//						c[i] = Character.toUpperCase(c[i]) ;
//						i--;
//					}
//				}
//				for(int i = 0 ; i<c.length ; i++) 
//				System.out.print(c[i]);
//				System.out.println();
//		}

}
