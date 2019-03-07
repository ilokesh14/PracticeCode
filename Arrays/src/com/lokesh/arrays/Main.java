package com.lokesh.arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static Scanner s ;
	public static void main(String[] args) {
		System.out.println("Hello");
		s = new Scanner(System.in) ;
		int t = s.nextInt() ;
		for( int i = 0 ; i < t ; i++ ) {
//			printSumOfArray() ;
//			reverseArray();
//			findSecondLargestElementInTheArray() ;
//			printAlternativeElementsOfArray();
//			countSmallerElements() ;
//			rotateArrayElements() ;
//			findMaxAndMin();
//			removeDuplicatedFromUnsortedArray();
//			findDistanceBetweenTwoNumbersInArray() ;
//			countSmallerElements();
//			findMajorityElement();
//			findSortedSubsequenceOfThree();
//			findLeadersInArray() ;
		}
	}

//	private static void findLeadersInArray() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0; i < n; i++)  
//		    arr[i] = s.nextInt() ;	
//		
//		int[] ans = new int[n] ;
//		int j = 0;
//		int max = arr[n-1];
//		ans[j] = max ;
//		
//		for(int i = n-2;i>=0;i--) {
//			if(arr[i] >= max ) {
//				j++ ;
//				max = arr[i];
//				ans[j] = max ;
//			}
//		}
//		for(int i=j;i>=0;i--)
//			System.out.print(ans[i]+" ");
//		System.out.println();
//	}

	
//	private static void findSortedSubsequenceOfThree() {
//
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0; i < n; i++)  
//		    arr[i] = s.nextInt() ;	
//
//        int max = n-1; //Index of maximum element from right side 
//        int min = 0; //Index of minimum element from left side 
//        int i; 
//  
//        // Create an array that will store index of a smaller 
//        // element on left side. If there is no smaller element 
//        // on left side, then smaller[i] will be -1. 
//        int[] smaller = new int[n]; 
//        smaller[0] = -1;  // first entry will always be -1 
//        for (i = 1; i < n; i++) 
//        { 
//            if (arr[i] <= arr[min]) 
//            { 
//                min = i; 
//                smaller[i] = -1; 
//            } 
//            else
//                smaller[i] = min; 
//        } 
//  
//        // Create another array that will store index of a 
//        // greater element on right side. If there is no greater 
//        // element on right side, then greater[i] will be -1. 
//        int[] greater = new int[n]; 
//        greater[n-1] = -1;  // last entry will always be -1 
//        for (i = n-2; i >= 0; i--) 
//        { 
//            if (arr[i] >= arr[max]) 
//            { 
//                max = i; 
//                greater[i] = -1; 
//            } 
//            else
//                greater[i] = max; 
//        } 
//  
//        // Now find a number which has both a greater number 
//        // on right side and smaller number on left side 
//        for (i = 0; i < n; i++) 
//        { 
//            if (smaller[i] != -1 && greater[i] != -1) 
//            { 
//                System.out.print(arr[smaller[i]]+" "+ 
//                                 arr[i]+" "+ arr[greater[i]]); 
//                return; 
//            } 
//        } 
//  
//        // If we reach number, then there are no such 3 numbers 
//        System.out.println("No such triplet found"); 
//        return; 
//	}

//	private static void findMajorityElement() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		int maxCount = 0 ;
//		int index = 0 ;
//		for(int i = 0; i < n; i++)  
//		    arr[i] = s.nextInt() ;	
//		
//		for(int i = 0; i < n; i++)  {  
//	        int count = 0;  
//	        for(int j = 0; j < n; j++){  
//	            if(arr[i] == arr[j])  
//	            count++;  
//	        }  
//	        if(count > maxCount) {  
//	            maxCount = count;  
//	            index = i;  
//	        }  
//	    }  
//		if(maxCount > n/2)
//			System.out.println(arr[index]);
//		else 
//			System.out.println(-1);
//	}

//	private static void countSmallerElements() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0 ; i<n ; i++ )
//			arr[i] = s.nextInt() ;
//		int counter = 0 ;
//		for(int i = 0 ; i<n ; i++ ) {
//			for(int j = i ; j< n  ; j++ ) {
//				if(arr[i] > arr[j] ) {
//					counter++ ;
//				}
//			}
//			System.out.print(counter+" ");
//			counter = 0 ;			
//		}		
//		System.out.println();
//	}

//	private static void findDistanceBetweenTwoNumbersInArray() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0 ; i<n ; i++ )
//			arr[i] = s.nextInt() ;
//		int n1 = s.nextInt();
//		int n2 = s.nextInt();
//		int k=-1;
//		int l=-1;
//		for(int i=0;i<n;i++) {
//			if(arr[i] == n1 )
//				k = i ;
//			if(arr[i] == n2 )
//				l = i ;
//		}
//		if(k>=0 && l>=0)
//		System.out.println(Math.abs(k-l));	
//		else
//			System.out.println(-1);
//	}

//	private static void removeDuplicatedFromUnsortedArray() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		HashMap<Integer,Integer> map = new HashMap<>();
//
//		for(int i = 0 ; i<n ; i++ ) {
//			arr[i] = s.nextInt() ;
//		}	
//		
//		
//		for(int i=0;i<n;i++) {
//			if(!map.containsValue(arr[i])) {
//				map.put(i, arr[i]) ;
//				System.out.println(arr[i]+" ");
//			}
//		}				
//		System.out.println();
//	}

//	private static void findMaxAndMin() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0 ; i<n ; i++ )
//			arr[i] = s.nextInt() ;
//		int min,max ;
//		if(arr[0]<arr[1]) {
//			min = arr[0] ;
//			max = arr[1] ; 
//		}
//		else {
//			max = arr[1] ;
//			min = arr[0] ;
//		}
//		for(int i=0;i<n;i++) {
//			if(arr[i] > max ) 
//				max = arr[i] ;
//			if(min > arr[i]) 
//				min = arr[i] ;
//			if(max < min) {
//				int temp = max ;
//				max = min ;
//				min = temp ;
//			}
//		}
//		System.out.println("Max is "+max+" and min is "+min);
//	}

	
//	private static void rotateArrayElements() {
//		int n = s.nextInt() ;
//		int d = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0 ; i<n ; i++ )
//			arr[i] = s.nextInt() ;
//
//		int j=0;
//		int i = 0;
//		for( i = 0 ; i<d ; i++ ){
//		    int temp = arr[0] ;
//			for(j=0;j<n-1;j++){
//		        arr[j] = arr[j+1] ;
//			}
//			arr[j] = temp ;
//		}
//		for(int k=0;k<n;k++)
//		System.out.print(arr[k]+" ");
//		System.out.println();		
//	}

//	private static void countSmallerElements() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0 ; i<n ; i++ )
//			arr[i] = s.nextInt() ;
//		int element = s.nextInt() ;
//
//		int k = 0 ;
//		for(int i = 0 ; i<n ; i++ )
//			if(arr[i] <= element )
//				k++;
//		System.out.println(k);
//	}

//	private static void printAlternativeElementsOfArray() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0 ; i<n ; i++ )
//			arr[i] = s.nextInt() ;
//		for(int i = 0 ; i<n ; i+=2 )
//			System.out.println(arr[i]+" ");
//		System.out.println();
//	}

//	private static void findSecondLargestElementInTheArray() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0 ; i<n ; i++ )
//			arr[i] = s.nextInt() ;
//
//		int max = arr[0] ;
//		for(int i = 1 ; i<n ; i++ )
//			if(max <= arr[i])
//				max = arr[i] ;
//
//		System.out.println("max is "+max);
//
//		int smax = 0 ;
//		for(int i = 0 ; i<n ; i++ ) 
//			if(arr[i]<max && arr[i]>smax)
//				smax = arr[i] ;
//
//		System.out.println(smax);			
//	}

//	private static void reverseArray() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i = 0 ; i<n ; i++ )
//			arr[i] = s.nextInt() ;
//
//		for(int j = 0 ; j<n/2 ; j++ ) {
//			int temp = arr[n-j-1] ;
//			arr[n-j-1] = arr[j] ;
//			arr[j] = temp ;
//		}
//		printArray(arr) ;
//	}

//	private static void printArray(int[] arr) {
//		for(int i = 0 ; i<arr.length ; i++ )
//			System.out.println(arr[i]+" ");		
//	}

//	private static void printSumOfArray() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		int sum = 0 ;
//		for(int i = 0 ; i<n ; i++ )
//			arr[i] = s.nextInt() ;
//		for(int i = 0 ; i<n ; i++ )
//			sum +=arr[i] ;
//		System.out.println(sum);
//	}

}
