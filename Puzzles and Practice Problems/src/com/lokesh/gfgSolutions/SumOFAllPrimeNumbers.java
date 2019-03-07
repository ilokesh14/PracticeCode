package com.lokesh.gfgSolutions;

import java.util.Scanner;

public class SumOFAllPrimeNumbers {

	    	public static Scanner s ;
	    	
	    	public static void main(String[] args) {
				s = new Scanner(System.in) ;
				int t = s.nextInt() ;
				
				for( int i = 0 ; i < t ; i++ ) {
					sieveOfEratosthenes() ;
				}
			
	    	}
	    	
			 private static void sieveOfEratosthenes() { 
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
}
