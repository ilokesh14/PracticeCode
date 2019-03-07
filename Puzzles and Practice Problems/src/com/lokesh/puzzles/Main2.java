package com.lokesh.puzzles;

import java.util.Scanner;


public class Main2 {

	public static Scanner s ;
	public static void main(String[] args) {
		System.out.println("Hello");
		s = new Scanner(System.in) ;
		int t = s.nextInt() ;

		for( int i = 0 ; i < t ; i++ ) {
//			System.out.println(findClosest());
//			System.out.println((int)findNthTermOfGP());
//			System.out.println(findKthDigitfromRight());
//			System.out.println(findGCDOfArray());	
//			System.out.println();
//			sieveOfEratosthenes() ;
//			printSumOfAllPrimeNumbers();
			findNthRoot() ;
		}
	}

	private static void findNthRoot() {
		long n = s.nextLong() ;//2
		long m = s.nextLong() ;//9
		boolean a = false ;
		for(int k = 0 ; k < m ; k++ ) {
			if(Math.pow(k,n) == m ) {
				a = true ;
				System.out.println(k);
			break ;
			}
		}
		if(!a)
		System.out.println(-1);
	}

	private static void printSumOfAllPrimeNumbers() {

		int n = s.nextInt() ;	        
		boolean prime[] = new boolean[n+1]; 

		for(int i=0;i<=n;i++) 
			prime[i] = true; 

		for(int p = 2; p*p <=n; p++) 
		{ 
			if(prime[p] == true) 
			{ 
				for(int i = p*p; i <= n; i += p) 
					prime[i] = false; 
			} 
		} 
		long sum = 0;
		for(int i = 2; i <= n; i++) 
		{ 
			if(prime[i] == true) 
				sum = sum + i ;
		}

		System.out.println(sum); 
	} 


	//	 private static void sieveOfEratosthenes() { 
	//		 	int n = s.nextInt() ;	        
	//		 	
	//		 	// Create a boolean array "prime[0..n]" and initialize 
	//	        // all entries it as true. A value in prime[i] will 
	//	        // finally be false if i is Not a prime, else true. 	        
	//		 	
	//		 	boolean prime[] = new boolean[n+1]; 
	//	        
	//		 	for(int i=0;i<n;i++) 
	//	            prime[i] = true; 
	//	          
	//	        for(int p = 2; p*p <=n; p++) 
	//	        { 
	//	            // If prime[p] is not changed, then it is a prime 
	//	            if(prime[p] == true) 
	//	            { 
	//	                // Update all multiples of p 
	//	                for(int i = p*p; i <= n; i += p) 
	//	                    prime[i] = false; 
	//	            } 
	//	        } 
	//	          
	//	        // Print all prime numbers 
	//	        for(int i = 2; i <= n; i++) 
	//	        { 
	//	            if(prime[i] == true) 
	//	                System.out.print(i + " "); 
	//	        } 
	//	    } 


	//	private static String isPrime() {
	//	int n = s.nextInt() ;
	//	for(int i = 2 ; i < n/2 ; i++ ) {
	//		if(n%i == 0) {
	//			return "No" ;
	//		}
	//	}
	//	return "Yes" ;
	//}


	static int gcd(int a, int b){
		if(a==0) 
			return b ;

		return gcd(b%a,a);
	}


	private static int findGCDOfArray() {
		int n = s.nextInt() ;
		int[] arr = new int[n] ;

		for(int i = 0 ; i<n ;i++)
			arr[i] = s.nextInt() ;

		int result = arr[0]  ;

		for(int i = 1 ; i<n ;i++)
			result = gcd(arr[i],result);	

		return result ;
	}

	//	private static int findKthDigitfromRight() {
	//		int a = s.nextInt() ;
	//		int b = s.nextInt() ;
	//		int k = s.nextInt() ;
	//		long d =  (long) Math.pow(a, b);
	//		System.out.println("d is "+d);
	//		int i = 0 ;
	//		int ans = 0 ;
	//		while( i < k) {
	//			ans = (int) (d%10);
	////			System.out.println("d%10 is "+d%10+" d/10 is "+d/10);
	//			d = d / 10 ;
	////			System.out.println("d is "+d);
	//			i++;
	//		}
	//		return ans ;
	//	}

	//	private static double findNthTermOfGP() {
	//		int a = s.nextInt() ;
	//		int b = s.nextInt() ;
	//		int n = s.nextInt() ;
	//		
	//		float r = (float) (b/(double)a) ;
	//		System.out.println("r is "+r);
	//		double nthTerm;
	//		nthTerm = (a * (Math.pow(r,n))) ;
	//		return Math.floor(nthTerm) ;
	//	}

	//	This solution only works for positive values.
	//	private static int findClosest() {
	//		int n = s.nextInt() ;//13
	//		int m = s.nextInt() ;//4
	//		int c = 0 ;
	//		
	//		for(int i = 1 ; i < n ; i++ ) {
	//			if( i%m == 0 && i > c )
	//				c=i ;	
	//		}
	//		return c ;
	//	}

	//	GFG solution for above problem
	//	private static int findClosest() {
	//		int n = s.nextInt() ;//-15
	//		int m = s.nextInt() ;//6
	//		int q ;
	//		int n1 = 0 ;
	//		int n2 = 0 ;
	//		
	//		q = n/m ; //-2
	//		System.out.println("q is "+q);
	//		
	//		n1 = m*q ; //-12
	//		System.out.println("n1 is "+n1);
	//		
	//		System.out.println("n*m is "+n*m+" m*(q+1) is "+m*(q+1)+" and m*(q-1) is "+m*(q-1));
	//		n2 = ((n*m) > 0) ? (m*(q+1)) :(m*(q-1)) ; //
	//		System.out.println("n2 is "+n2);
	//		
	//		System.out.println("Math.abs(n-n1) is "+Math.abs(n-n1)+" and Math.abs(n-n2) is "+Math.abs(n-n2));
	//		if(Math.abs(n-n1) < Math.abs(n-n2)) {
	//			return n1 ;
	//		}	
	//		return n2 ;
	//	}



}
