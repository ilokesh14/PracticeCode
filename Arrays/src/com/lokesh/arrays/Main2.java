package com.lokesh.arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
	public static Scanner s ;
	public static void main(String[] args) {
		System.out.println("Hello");
		s = new Scanner(System.in) ;
		int t = s.nextInt() ;
		for( int i = 0 ; i < t ; i++ ) {
//			pairWithGivenSum();
//			productArrayPuzzle();
//			printDuplicates();
			printAlternativeArrays();
//			countUpsAndDowns();
//			findLoopInArray();
		}
	}

	private static void printAlternativeArrays() {
	int n1 = s.nextInt() ;//3
	int n2 = s.nextInt() ;//5
	int[] a1 = new int[n1+n2] ;//8
	for(int i = 0; i < n1; i++)  
	    a1[i] = s.nextInt() ;	// 1 2 3	
	for(int i = n1; i < n1+n2; i++)  
	    a1[i] = s.nextInt() ;	// 1 2 3 4 5
	int n = n1 > n2?n1 : n2 ;
	for(int i=0; i<n ;i++) {// i=0 to i<8
		if(i < n1)
			System.out.print(a1[i]+" ");
		if(i < n2)
			System.out.print(a1[i+n1]+" ");		
	}
	System.out.println();
}

	
//	private static void findLoopInArray() {
//		int n = s.nextInt() ;
//		int[] a = new int[n] ;
//		for(int i = 0; i < n; i++)  
//		    a[i] = s.nextInt() ;
//		boolean flag = false ;
//		for(int i = 0; i < n; i++) {
//			for(int j=0;j<n;j++) {
//				if(i == a[j]) {
//					flag = true ;
//					System.out.println(1);
//					break ;
//				}
//
//			}
//		}
//		if(!flag)
//		System.out.println(0);
//	}

	
//	private static void countUpsAndDowns() {
//		int n = s.nextInt() ;
//		int u = 0 ;
//		int d = 0 ;
//		int[] a = new int[n] ;
//		for(int i = 0; i < n; i++)  
//		    a[i] = s.nextInt() ;
//		
//		for(int i = 1; i < n-1 ; i++)  {
//			if(a[i] > a[i+1] && a[i] > a[i-1])
//				u++ ;
//			if(a[i] < a[i+1] && a[i] < a[i-1])
//				d++ ;
//		}
//			System.out.println(u+" "+d);
//	}

	
	
//	private static void printDuplicates() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0; i < n; i++)  
//		    arr[i] = s.nextInt() ;	
//			// First check all the values that are 
//			// present in an array then go to that 
//			// values as indexes and increment by 
//			// the size of array 
//			for (int i = 0; i < n; i++) 
//			{ 
////				System.out.println("arr[i] % n "+arr[i] % n);
//				int index = arr[i] % n; 
////				System.out.println("arr[index] + n = "+( arr[index] + n));
//				arr[index] += n; 
//			} 
//
//			// Now check which value exists more 
//			// than once by dividing with the size 
//			// of array 
//			boolean found =  false ;
//			for (int i = 0; i < n; i++) { 
////				System.out.println("arr[i]/n = "+arr[i]/n);
//				if ((arr[i]/n) > 1) {
//					found = true ;
//					System.out.print(i +" ");
//				}
//			}
//			if(!found)
//				System.out.println(-1);
//	}
	
//	private static void productArrayPuzzle() {
//
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		long temp = 1 ;
//        
//        for(int i = 0; i < n; i++)  {
//		    arr[i] = s.nextInt() ;	
//		    temp *= arr[i] ;
//		}
//		for(int i=0;i<n;i++)
//	    	if(arr[i] != 0)
//		    	System.out.print(temp/arr[i]+" ");
//			System.out.println();
//
//	}
	
//	private static void productArrayPuzzle() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		int[] p = new int[arr.length];
//
//		int temp = 1 ;
//
//		for(int i = 0; i < n; i++)  {
//		    arr[i] = s.nextInt() ;	
//		    p[i] = 1 ;
//		}
//		
//		for(int i = 0; i < n; i++)  {
//			p[i] = temp ;
//			temp *= arr[i] ;
//		}
//		temp = 1;
//		for(int i = n-1 ; i>=0 ; i--){
//		    p[i] *= temp ;
//		    temp *= arr[i] ;
//		}
//		
//        for(int i = 0; i < n; i++)  
//			System.out.print(p[i]+" ");
//		System.out.println();
//		
//	}

	
//	private static void productArrayPuzzle() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		int[] temp = new int[arr.length];
//
//		for(int i = 0; i < n; i++)  
//		    arr[i] = s.nextInt() ;	
//
//		for(int i = 0; i < n; i++) { 
//			temp[i] = fillArrayProductElements(i,arr,temp);
//			System.out.print(temp[i]+" ");
//		}
//		System.out.println();		
//	}
	
	
//	private static int fillArrayProductElements(int i, int[] arr,int[] temp) {
//		int product = 1 ;
//		for(int k = 0; k < arr.length ; k++)
//			if( k != i )
//			product *= arr[k] ;
//		
//		return product ;		
//	}
	
	
//	private static void pairWithGivenSum() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0; i < n; i++)  
//		    arr[i] = s.nextInt() ;	
//		int x = s.nextInt() ;
//		int i = 0 ;
//		int j = n-1 ;
//		boolean b = false ;
//		while(i<j) {
//			if(arr[i] + arr[j] == x) {
//				System.out.println(arr[i]+" "+arr[j]+" "+x);
//				i++;
//				j--;
//				b=true ;
//			}
//			else if(arr[i] + arr[j] < x)
//				i++ ;
//			else if(arr[i] + arr[j] > x)
//				j-- ;
//		}
//		if(!b)
//			System.out.println(-1);
//	}


}
