package com.lokesh.puzzles;

import java.util.Scanner;

public class Main3 {

	public static Scanner s ;
	public static void main(String[] args) {
		System.out.println("Hello");
		s = new Scanner(System.in) ;
		int t = s.nextInt() ;

		for( int i = 0 ; i < t ; i++ ) {
//			addFraction();
//			pairOfPrimeNumbers() ;
//			printPairCubeCount();
			largestPrimeFactor() ;
		}
	}
	

	private static void largestPrimeFactor() { 
		 	int n = s.nextInt() ;	  
		 	int max = 0 ;
		 	for(int i = 1 ; i < n ; i++) {
		 		if(n%i == 0 && i > max) {
		 			max = i ;
		 		}
		 	}
		 	System.out.println(max);
	} 
	


	private static void printPairCubeCount() {
		int n = s.nextInt() ;
		int count = 0 ;
		for(int i = 1 ; Math.pow(i, 3) < n ; i++ ) {
			for(int j = 0 ; Math.pow(j, 3) < n ; j++ ) {
				if(Math.pow(i, 3) + Math.pow(j, 3) == n ) {
					count += 1 ;
				}
			}
		}
		System.out.println(count);
	}

	private static void pairOfPrimeNumbers() {
		int n = s.nextInt() ;
		sieveOfEratosthenes(n) ;
	}
	
	private static void sieveOfEratosthenes(int n) { 
		// 	int n = s.nextInt() ;	        

		// Create a boolean array "prime[0..n]" and initialize 
		// all entries it as true. A value in prime[i] will 
		// finally be false if i is Not a prime, else true. 	        

		boolean prime[] = new boolean[n+1]; 

		for(int i=0;i<n;i++) 
			prime[i] = true; 

		for(int p = 2; p*p <= n ; p++) 
		{ 
			// If prime[p] is not changed, then it is a prime 
			if(prime[p] == true) 
			{ 
				// Update all multiples of p 
				for(int i = p*p; i <= n; i += p) 
					prime[i] = false; 
			} 
		} 

		// Print all prime numbers 
		for(int i = 2; i <= n; i++) 
		{ 
			if(prime[i] == true) {
				for(int j = 2 ; j <= n ; j++ ) {
					if( i*j <= n-1 ) {
						if(prime[i] == true && prime[j] == true )
							System.out.print(i+" "+j+" ");
					}
				}
			}
		} 
	} 


	private static void addFraction() {
		int n1 = s.nextInt() ;
		int d1 = s.nextInt() ;
		int n2 = s.nextInt() ;
		int d2 = s.nextInt() ;

		//taking LCM of the two denominators 
		int lcm = d1*d2 / gcd(d1, d2) ;

		System.out.println("gcd is "+gcd(d1,d2));

		System.out.println("lcm is "+lcm);

		//Balancing the numerator
		int n = n1*(lcm/d1) + n2*(lcm/d2) ;

		lowest(n,lcm) ;
	}
	private static void lowest(int n, int d) {
		int gcd = gcd(n, d) ;
		n = n/gcd ;
		d = d/gcd ;
		System.out.println(n+"/"+d);
	}


	static int gcd(int a, int b){
		if(a==0) 
			return b ;

		return gcd(b%a,a);
	}

}
