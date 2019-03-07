package com.lokesh.divideAndConquer;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
		public static Scanner f ;
//		public static FastReader f ;
		public static void main(String[] args) throws NumberFormatException, IOException {
			System.out.println("Hello");
//			f = new FastReader() ;
			f = new Scanner(System.in);
//			int tc = f.nextInt() ;
			int tc = f.nextInt() ;
			while(tc>0){
				tc--;
				powerOfNumber();
//				System.out.println(findLastDigit(f.nextLong()));
//				indxOfLeft() ;
//				inversionCount() ;
			}
		}

		private static void powerOfNumber() {
			int n  = f.nextInt() ;
			int k  = f.nextInt() ;
			Long r = (long) 1 ;
			for(int i=0;i<k;i++) {
				System.out.println("r "+r);
				r = r*n ;
			}
			System.out.println(r);
		}

		private static void indxOfLeft() {
			int n = f.nextInt() ;
			int q = f.nextInt() ;
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = f.nextInt() ;
			Arrays.sort(a);
			
			for(int i=1;i<=q;i++) {
                int j = f.nextInt() ; 
                if(j>0 && j <= a.length)
                    System.out.println(a[j-1]);
                else
                    System.out.println(-1);
			}
		}

		private static void inversionCount() {
			int n = f.nextInt();
			int[] a = new int[n] ;
			for(int i=0;i<n;i++)
				a[i] = f.nextInt() ;
			System.out.println(count(a,n));
		}

		static int count(int arr[], int n) { 
		    int count = 0; 
		    for (int i = 0; i < n - 1; i++) 
		        for (int j = i + 1; j < n; j++) 
		            if (arr[i] > arr[j]) 
		                count++; 
		  
		    return count; 
		} 



		// Filongs f[] with first  
	    // 60 Fibonacci numbers 
	    static void fib(int f[]){ 
	        // 0th and 1st number of  
	        // the series are 0 and 1 
	        f[0] = 0; 
	        f[1] = 1; 
	  
	        // Add the previous 2 numbers  
	        // in the series and store  
	        // last digit of result  
	        for (int i = 2; i <= 59; i++) 
	            f[i] = (f[i - 1] + f[i - 2]) % 10; 
	    } 
	  
	     // Returns last digit of n'th Fibonacci Number 
	    static int findLastDigit(long n){ 
	        // In Java, values are 0 by default 
	        int f[] = new int[60]; 
	  
	        // Precomputing units digit of  
	        // first 60 Fibonacci numbers 
	        fib(f); 
	      
	        int index = (int)(n % 60);  
	  
	        return f[index]; 
	    } 

		
//		private static void powerOfNumber() {
//			int n = f.nextInt() ;
//			int rev = findReverse(n) ;
//		}
//
//		private static int findReverse(int n) {
//			int rev = 0 ;
//			while(n>0) {
//				rev = n%10 + rev*10 ;
//				n = n/10 ;
//			}
//			return rev ;
//		}
		
		
//		private static void printPattern() {
//			int n = f.nextInt() ;
//			printPatternHepler(n) ;
//			System.out.println();
//		}
//		
//		private static void printPatternHepler(int n) {
//				if(n>0) {
//					System.out.print(n+" ");
//					printPatternHepler(n-5);
//				}
//				System.out.print(n+" ");
//		}
		
		
//		private static void toh() {
//			int n = f.nextInt() ;
//			tohHelper(n,1,3,2) ;
//			System.out.println((int)Math.pow(2,n)-1);
//		}
//	
//		private static void tohHelper(int n, int from, int to, int temp) {
//			if(n==1) {
//				System.out.println("move disk 1 from rod "+from+" to rod "+to);
//				return ;
//			}
//			tohHelper(n-1, from, temp,to);
//			System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
//			tohHelper(n-1, temp,to,from);
//		}
		
//		private static void permute() {
//			String s = f.next() ;
//			ArrayList<String> list = new ArrayList<>() ;
//
//			permuteHelper(s,0,s.length()-1,list);
//			Collections.sort(list);
//			
//			for(int i=0;i<list.size();i++)
//				System.out.print(list.get(i)+" ");
//			System.out.println();
//		}
//
//		
//		private static void permuteHelper(String s,int l,int r, ArrayList<String> list) {
//			
//			if(l==r) 
//				list.add(s) ;
//			else {
//				for(int i=l;i<=r;i++) {
//					//chose 
//					s = swap(s,l,i) ;
//					//explore
//					permuteHelper(s,l+1,r, list);
//					//unchose
//					s = swap(s,i,l);
//				}
//			}
//		}
//
//		private static String swap(String s, int l, int i) {
//			char[] c = s.toCharArray() ; 
//			char temp = c[i] ;
//			c[i] = c[l] ;
//			c[l] = temp ;
//			return String.valueOf(c) ;
//		}

}
