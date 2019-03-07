package com.lokesh.puzzles;

import java.util.Scanner;

public class Main {

	public static Scanner s ;
	public static void main(String[] args) {
		System.out.println("Hello");
		s = new Scanner(System.in) ;
		int t = s.nextInt() ;
		
		for( int i = 0 ; i < t ; i++ ) {
//			System.out.println(findAP());
//			System.out.println(findArmstrongNumber());	
//			System.out.println(findDecimalNumber());
//			System.out.println(findnPr());
//			System.out.println(isPrime());
//			findLCMandHCF();
		}
	}
	
//	static int gcd(int a, int b) 
//    { 
//        // Everything divides 0  
//        if (a == 0 || b == 0) 
//           return 0; 
//       
//        // base case 
//        if (a == b) 
//            return a; 
//       
////         a is greater 
//        if (a > b) 
//            return gcd(a-b, b); 
//        return gcd(a, b-a); 
//    } 
      
//     method to return LCM of two numbers 
//    static int lcm(int a, int b) 
//    { 
//        return (a*b)/gcd(a, b); 
//    } 
	
//	private static void findLCMandHCF() {
//		int a = s.nextInt() ;
//		int b = s.nextInt() ;
//		int lcm = 1 ;
//		int hcf = 1 ;
//		for(int i = 1 ; i <= (a<b?a:b) ; i++ ) {
//			if( a%i == 0 && b%i == 0) {
//				hcf = i ;
//			}
//		}	
//		System.out.println((a*b)/gcd(a, b)+" "+hcf);
//		System.out.println();
//	}
	
//	private static String isPrime() {
//		int n = s.nextInt() ;
//		for(int i = 2 ; i < n/2 ; i++ ) {
//			if(n%i == 0) {
//				return "No" ;
//			}
//		}
//		return "Yes" ;
//	}
	

//	private static long factorial(long n) {
//		if(n == 1 ) 
//			return 1 ;
//		else {
//			
//			return n*factorial(n-1) ;
//		}
//	}

//	private static long findnPr() {
//		int n = s.nextInt() ;
//		int r = s.nextInt() ;
//		System.out.println("n "+factorial(n));
//		System.out.println("n-r "+factorial(n-r));
//		System.out.println("n/n-r "+factorial(n)/factorial(n-r));
//		long ans = nPr(n,r) ;
//		return ans ;
//		return factorial(n)/factorial(n-r) ;
//	}
	
	
//	private static long nPr(int n, int r) {
//			if(r == 0 || r == 1 ) {
//				return (r == 0) ? 1 : n ; 
//			}
//			long result =  nPr(n-1, r-1) ;
//			result = result * n ;
//			return result ;
//	}
	

//	private static int findDecimalNumber() {
//		s.nextLine();
//		String string = s.nextLine() ;
//		
//		int sum = 0 ;
//		int j = 0 ;
//		System.out.println("string is "+string+" stirng length is "+string.length());
//		for(int i = string.length() - 1 ; i >= 0 ; i-- ) {
//			if(string.charAt(i) == '1') {
//				System.out.println("string.charAt(i) is "+string.charAt(i)+" sum is " );
//				sum = (int) (sum + Math.pow(2,j)) ;
//				System.out.print(sum);
//			}
//			j++ ;
//		}
//		System.out.println("sum is "+sum);
//		return sum;
//	}

	
//	private static String findArmstrongNumber() {
//		int n = s.nextInt() ;
//		int no = n ;
//		int i =  0 ;
//		while( n > 0 ) {
//			n = n / 10 ;
//			i++ ;
//		}
//		int sum = 0 ;
//		n = no ;
//		while(n > 0) {
//			sum = (int) (sum + Math.pow(n%10,i)) ;
//			n = n/10 ;
//		}
//		if(sum == no) {
//			System.out.println("Yes");
//		}
//		return "No";
//	}

//	private static int findAP() {
//		int a1 = s.nextInt() ;
//		int a2 = s.nextInt() ;
//		int n = s.nextInt() ;
//		return (a1+(n-1)*(a2-a1));
//	}
		
}
