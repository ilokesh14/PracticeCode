package com.lokesh.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
		public static Scanner s ;
//		public static BufferedReader br ;
		public static void main(String[] args) throws NumberFormatException, IOException {
			System.out.println("Hello");
			s = new Scanner(System.in);
//			br = new BufferedReader(new InputStreamReader(System.in));
//			int tc = Integer.parseInt(br.readLine());
			int tc = s.nextInt() ;
			
			while(tc>0){
				tc--;
//				checkIfArrayIsSortedOrNot() ;
//				checkIfTwoArraysAreEqualOrnot() ;
//				firstElementToOccurKTimes();
//				inFirstButNotInSecond() ;
//				checkIfArrayIsSubsetOfAnotherArrayOrNot() ;
//				findDistinctElements() ;
//				countPairWithAGivenSum();
//				nonRepeatingElement();
//				frequencyOfArrayElements();
//				groupAnagramsTogether();
//				findWinnerOfElection();
//				countDistinctPairsWithDifferenceK();
//				keypair();
//				largestFibonacciSubsequence();
//				findElementWithKthFrequency();
//				sumOfPrimes();
			}
		}


		private static void sumOfPrimes() {
		 	int n = s.nextInt() ;
		 	int sum = 0;
//		 	boolean prime[] = new boolean[n+1]; 
			Map<Integer,Boolean> map = new HashMap<>() ;
			
		 	for(int i=0;i<n;i++) 
//	            prime[i] = true;
		 		map.put(i, true) ;
	          
	        for(int p = 2; p*p <=n; p++){ 
	            if(map.get(p) == true){ 
	                for(int i = p*p; i <= n; i += p) 
	                    map.put(i,false); 
	            } 
	        } 
	        for(int i = 2; i <= n; i++) {
	        	if(map.containsKey(i))
	            if(map.get(i) == true) 
	                sum += i ; 
	        } 
	        System.out.println(sum+n);
		}

		private static void findElementWithKthFrequency() {

			int n = s.nextInt() ;
			int k = s.nextInt() ;
			
			int a1[] = new int[n] ;
			for(int i=0;i<n;i++)
				a1[i] = s.nextInt() ;
			
			Arrays.sort(a1);
			HashMap<Integer,Integer> map = new HashMap<>() ;
			for(int i=0;i<n;i++) {
				if(!map.containsKey(a1[i]))	
					map.put(a1[i],0) ;
				
				map.put(a1[i], map.get(a1[i])+1) ;
			}		
			String s = "";
			for(int i=0;i<n;i++) {
				if(map.get(a1[i]) == k) {
					s+= a1[i]+" ";
					map.put(a1[i], map.get(a1[i])-1) ;
				}
			}
			if(s != "")
				System.out.println(s);
			else
				System.out.println(-1);
		}

		private static void largestFibonacciSubsequence() {
			int n = s.nextInt() ;
			int a1[] = new int[n] ;
			for(int i=0;i<n;i++)
				a1[i] = s.nextInt() ;
			
//			int a2[] = new int[n] ;
			for(int i=0;i<n;i++){
				if(checkFibonacci(a1[i]))
					System.out.print(a1[i]+" ");
			}
			System.out.println();
		}

		private static boolean checkFibonacci(int n) {
			return isPerfectSquare(5*n*n + 4) ||  isPerfectSquare(5*n*n - 4); 
		}

		private static boolean isPerfectSquare(int n) {
			int s = (int) Math.sqrt(n); 
		    return (s*s == n);
		}

		private static void keypair() {

			int n = s.nextInt() ;
			int k = s.nextInt() ;
			
			int a1[] = new int[n] ;
			for(int i=0;i<n;i++)
				a1[i] = s.nextInt() ;
			
			HashMap<Integer,Integer> map = new HashMap<>() ;
			for(int i=0;i<n;i++) {
				if(!map.containsKey(a1[i]))	
					map.put(a1[i],0) ;
				
				map.put(a1[i], map.get(a1[i])+1) ;
			}			
			int count = 0;
			for(int i=0;i<n;i++) {
				if(map.get(k-a1[i]) != null)
					count += map.get(k - a1[i]);
				if(k - a1[i] == a1[i]) 
					count-- ;				
			}
			if(count>0)
				System.out.println("Yes");
			else
				System.out.println("No");
		}

		private static void countDistinctPairsWithDifferenceK() {
			int n = s.nextInt() ;			
			int arr[] = new int[n] ;
			for(int i=0;i<n;i++)
				arr[i] = s.nextInt() ;
			int k = s.nextInt() ;
			
			Arrays.sort(arr); // Sort array elements 
			 int count = 0; 
			 for(int i=0;i<n;i++) {
				 for(int j=1;j<n;j++) {
					 if(arr[i]+k == arr[j] && arr[i] != arr[j] && k>0) {
						 count++ ;
					 }
					 if(k==0) {
						 count=1;
					 }
				 }
			 }
			System.out.println(count);
		}

		private static void findWinnerOfElection() {
			int n = s.nextInt() ;
			String a[] = new String[n] ;
			
			for(int i=0;i<n;i++)
				a[i] = s.next() ;

			Map<String,Integer> map = new TreeMap<>() ;
			
			for(int i=0;i<n;i++) {
				if(!map.containsKey(a[i]))	
					map.put(a[i],1) ;
				else 
					map.put(a[i], map.get(a[i])+1) ;
			}
			int max = 0 ;
			String s = "" ;
			int i;
			for(i=0;i<n;i++) {
				if(max < map.get(a[i])) {
					max = map.get(a[i]) ;
					s = a[i] ;
				}
				else if(max == map.get(a[i])) {
					s = s.compareTo(a[i]) > 0 ? a[i]: s ; 
				}
			}
			System.out.println(s+" "+max);
		}

		private static void groupAnagramsTogether() {
			
		}

		private static void frequencyOfArrayElements() {
			int n = s.nextInt() ;
			int a[] = new int[1000000] ;
			for(int i=0;i<a.length;i++)
				a[i] = 0 ;
			for(int i=0;i<n;i++){
				int t = s.nextInt() ;
				if(a[t] > 0 )
					a[t] = a[t]+1;
				else if (a[t] == 0)
					a[t] = 1 ;
			}
			for(int i=1;i<a.length;i++)
				if(a[i]>0 || n>=i)
					System.out.print(a[i]+" ");	
			System.out.println();
		}

		private static void nonRepeatingElement() {	
			int n = s.nextInt() ;
			long a1[] = new long[n] ;
			for(int i=0;i<n;i++)
				a1[i] = s.nextLong() ;
			
			HashMap<Long,Integer> map = new HashMap<>() ;
			for(int i=0;i<n;i++) {
				if(!map.containsKey(a1[i]))	
					map.put((long) a1[i],0) ;
				
				map.put((long) a1[i], map.get(a1[i])+1) ;
			}			
			for(int i=0;i<n;i++)
				if(map.get(a1[i]) == 1 ) {
					System.out.println(a1[i]);
					return ;
				}
			
			System.out.println(0);
		}

		private static void countPairWithAGivenSum() {
			int n = s.nextInt() ;
			int k = s.nextInt() ;
			
			int a1[] = new int[n] ;
			for(int i=0;i<n;i++)
				a1[i] = s.nextInt() ;
			
			HashMap<Integer,Integer> map = new HashMap<>() ;
			for(int i=0;i<n;i++) {
				if(!map.containsKey(a1[i]))	
					map.put(a1[i],0) ;
				
				map.put(a1[i], map.get(a1[i])+1) ;
			}			
			int count = 0;
			for(int i=0;i<n;i++) {
				if(map.get(k-a1[i]) != null)
//					we have done count += map.get(k-a1[i]) here because map.get gives the value at the specified key .
//					Since we are storing a1[i] as keys and their count as values. so we need to add values to the count.
					count += map.get(k - a1[i]);
//				if the element pairs with itself
				if(k - a1[i] == a1[i]) 
					count-- ;				
			}
			System.out.println(count/2);
		}

		private static void findDistinctElements() {
			int n = s.nextInt() ;
			int a[][] = new int[n][n] ;
			HashSet<Integer> hash = new HashSet<>() ;
			HashSet<Integer> temp = new HashSet<>() ;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) { 
					a[i][j] = s.nextInt() ;
					if(i==0)
						hash.add(a[i][j]) ;
					else
						temp.add(a[i][j]) ;
				}
				if( i != 0 ) {
					Iterator<Integer> itr = hash.iterator();
					while(itr.hasNext()) {
						int x = itr.next() ;
						if(!temp.contains(x)) {
							itr.remove();
						}
					}	
				}
			}
			System.out.println(hash.size());
		}

		private static void checkIfArrayIsSubsetOfAnotherArrayOrNot() {
			int n1 = s.nextInt() ;
			int n2 = s.nextInt() ;
			int a1[] = new int[n1] ;
			int a2[] = new int[n2] ;
			for(int i=0;i<n1;i++)
				a1[i] = s.nextInt() ;
			for(int i=0;i<n2;i++)
				a2[i] = s.nextInt() ;
			int count = 0 ;
			HashMap<Integer,Integer> map = new HashMap<>() ;
			for(int i=0;i<n1;i++) {
				if(!map.containsKey(a1[i]))	
					map.put(a1[i],1) ;
				else 
					map.put(a1[i], map.get(a1[i])+1) ;
			}
			
			for(int i=0;i<n2;i++) {
				if(!map.containsKey(a2[i])){

				}
				else {
					if(map.get(a2[i]) > 1) {
						count++ ;
						map.put(a2[i], map.get(a2[i])-1) ;
					}
					else {
						map.remove(a2[i]) ;
						count++ ;
					}
				}
			}
			if(count == a2.length)
				System.out.println(1);
			else
				System.out.println(0);
		}

		private static void inFirstButNotInSecond() {
			int n1 = s.nextInt() ;
			int n2 = s.nextInt() ;
			long a1[] = new long[n1] ;
			long a2[] = new long[n2] ;
			for(int i=0;i<n1;i++)
				a1[i] = s.nextInt() ;
			for(int i=0;i<n2;i++)
				a2[i] = s.nextInt() ;
			
			HashMap<Long,Integer> map = new HashMap<>() ;
			for(int i=0;i<n2;i++) {
				if(!map.containsKey(a2[i]))	
					map.put((long) a2[i],1) ;
				else 
					map.put((long) a2[i], map.get(a2[i])+1) ;
			}
			
			for(int i=0;i<n1;i++) {
				if(!map.containsKey(a1[i])){
					System.out.print(a1[i]+" ");
				}
				else {					
						map.put((long) a1[i], map.get(a1[i])-1) ;
				}
			}
			System.out.println();
		}

		private static void firstElementToOccurKTimes() {
			int n = s.nextInt() ;
			int x = s.nextInt() ;
			int a1[] = new int[n] ;
			for(int i=0;i<n;i++)
				a1[i] = s.nextInt() ;
			
			HashMap<Integer,Integer> map = new HashMap<>() ;
			for(int i=0;i<n;i++) {
				if(!map.containsKey(a1[i]))	
					map.put(a1[i],1) ;
				else 
					map.put(a1[i], map.get(a1[i])+1) ;
			}
			
			for(int i=0;i<n;i++) {
				if(map.get(a1[i]) == x ) {
					System.out.println(a1[i]);
					return ;
				}
			}
			System.out.println(-1);
		}

		private static void checkIfTwoArraysAreEqualOrnot() {
			int n = s.nextInt() ;
			int a1[] = new int[n] ;
			int a2[] = new int[n] ;
			for(int i=0;i<n;i++)
				a1[i] = s.nextInt() ;
			for(int i=0;i<n;i++)
				a2[i] = s.nextInt() ;
			
			HashMap<Integer,Integer> map = new HashMap<>() ;
			for(int i=0;i<n;i++) {
				if(!map.containsKey(a1[i]))	
					map.put(a1[i],1) ;
				else 
					map.put(a1[i], map.get(a1[i])+1) ;
			}
			
			for(int i=0;i<n;i++) {
				if(!map.containsKey(a2[i])){
					System.out.println(0);
					return ;
				}
				else {
					if(map.get(a2[i]) > 1)
						map.put(a2[i], map.get(a2[i])-1) ;
					else
						map.remove(a2[i]) ;
				}
			}
			if(map.isEmpty())
				System.out.println(1);
			else
				System.out.println(0);
		}

//		private static void checkIfArrayIsSortedOrNot() {
//			int n = s.nextInt() ;
//			int arr[] = new int[n] ;
//			for(int i=0;i<n;i++)
//				arr[i] = s.nextInt() ;
//			
//			for(int i=0;i<n-1;i++){
//				if(arr[i+1] < arr[i]) {
//					System.out.println(0);
//					return ;
//				}
//			}
//			System.out.println(1);
//		}


}
