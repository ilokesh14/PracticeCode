package com.lokesh.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
//				findOccurence() ;
//				sort01Array() ;
//				linearSearch() ;
//				binarySearch() ;
//				sqrt() ;
//				printLastIndexOfOne() ;
//				findMissingElement() ;
//				facingTheSun() ;
//				floorInSortedArray() ;
//				searchInRotatedArray() ;
//				findMissingElementInAP() ;
//				transitionPoint();
//				findCommonElementsInThreeArrays() ;
//				System.out.println(findPeakElement());
//				smallestPositiveMissingNumber() ;
//				findAdjecent() ;
				tc--;
			}
		}
		
		
		
//		private static void findAdjecent() {
//			int n = s.nextInt() ;
//			int[] arr = new int[n] ;
//			for(int i=0;i<n;i++) 
//				arr[i] = s.nextInt() ;
//			if(n>2) {
//				int c = 0 ;
//				for(int i=0;i<arr.length-1;i++) {
//					if(arr[i] == arr[i+1]) {
//						c++ ;
//						
//					}
//				}
//				System.out.println("c is "+c);
//			}
//		}
		
		
//		private static int findPeakElement() {
//			int n = s.nextInt() ;
//			int[] arr = new int[n] ;
//			for(int i=0;i<n;i++)
//				arr[i] = s.nextInt() ;
//			
//			if(n>=2) {
//				if(arr[0] > arr[1]) 
//					return 0 ;
//				else if((arr[n-1] > arr[n-2])) 
//					return (n-1) ;
//			}
//			int j = 1 ;
//			for(int i=2;i<n-1;i++)
//				if(arr[i] > arr[j] && arr[i] > arr[i+1])
//					return i ;
//			return 1 ;
//		}

//		private static void findCommonElementsInThreeArrays() throws IOException {
//			String[] s = br.readLine().trim().split(" ");
//
//			int n1 = Integer.parseInt(s[0]) ;
//			int n2 = Integer.parseInt(s[1]) ;
//			int n3 = Integer.parseInt(s[2]) ;
//
//			int[] a1 = new int[n1];
//			int[] a2 = new int[n2];
//			int[] a3 = new int[n3];
//
//			String[] s1 = br.readLine().trim().split(" ");
//			for(int i = 0 ; i < n1 ; i++ )
//				a1[i] = Integer.parseInt(s1[i]) ;
//
//			String[] s2 = br.readLine().trim().split(" ");
//			for(int i = 0 ; i < n2 ; i++ )
//				a2[i] = Integer.parseInt(s2[i]) ;
//			
//			String[] s3 = br.readLine().trim().split(" ");
//			for(int i = 0 ; i < n3 ; i++ )
//				a3[i] = Integer.parseInt(s3[i]) ;
//			
//			int i=0,j=0,k=0 ;
//			while(i < n1 && j < n2 &&  k < n3) {
//				if(a1[i] == a2[j] && a2[j] == a3[k]){ 
//		    		System.out.print(a1[i]+" ");
//				    i++;j++;k++;
//				}
//				else if(a1[i] < a2[j]) 
//	    			i++ ;
//				else if(a2[j] < a2[k]) 
//					j++ ;
//				else 
//					k++ ;
//			}
//			System.out.println();
//		}

//		private static void transitionPoint() {
//			int n = s.nextInt() ;
//			int[] arr = new int[n] ;
//			for(int i=0;i<n;i++) 
//				arr[i] = s.nextInt() ;
//			int k = findElement(arr,0,n);
//			System.out.println(k);
//		}
//
//		private static int findElement(int[] arr, int l, int h) {
//			if( l >= h ) return -1 ;
//			int m = (l+h)/2 ;
//			if(arr[m-1] == 0 && arr[m] == 1) return m ;
//			if(arr[m] == 0 && arr[m+1] == 1) return m+1 ;
//			if(arr[l] < arr[m]) return findElement(arr, l, m-1) ;
//			return findElement(arr, m+1,h) ;
//		}

//		private static void findMissingElementInAP() {
//			int n = s.nextInt() ;
//			int[] arr = new int[n] ;
//			int total = 0 ;
//			int sum = 0 ;
//			for(int i=0;i<n;i++) {
//				arr[i] = s.nextInt() ;
//				total += arr[i] ;
//			}
//			sum = ((n+1)*(arr[0]+arr[n-1]))/2 ;
//			System.out.println((sum-total));
//		}

		
//		private static void searchInRotatedArray() {
//		int n = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i=0;i<n;i++)
//			arr[i] = s.nextInt() ;
//		int x = s.nextInt() ;
//		int k = search(arr,0,n-1,x) ;
//		System.out.println(k);
//		}
//
//		private static int search(int[] arr, int l, int h, int x) {
//			if(l>h)
//				return -1;
//			int m = (l+h)/2 ;
//			if(arr[m] == x)
//				return m ;
//			
////			if the arr[l..m] is sorted ...
//			if(arr[m] >= arr[l]) {
////				we can check if x lies in first half or the other using binary search
//				if(arr[l] <= x && x <= arr[m])
//					return search(arr,l,m-1,x) ;
//			
//			return search(arr, m+1, h, x) ;
//			}
////			if the arr[l..m] is not sorted then arr[m..h] must be sorted and we can use binary search here ...
//			if(x >= arr[m] && x <= arr[h]) 
//				return search(arr, m+1, h, x) ;
//
//			return search(arr,l,m-1,x) ;					
//		}

	
//	private static void floorInSortedArray() {
//		int n = s.nextInt() ;
//		int x = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i=0;i<n;i++)
//			arr[i] = s.nextInt() ;
//		
//		System.out.println(floorSearch(arr,0,n-1,x));
//	}


//		private static int floorSearch(int[] arr, int l, int r, int x) { 
//	        // If low and high cross each other 
//	        if (l > r) 
//	            return -1; 
//	  
//	        // If last element is smaller than x 
//	        if (x >= arr[r]) 
//	            return r; 
//	  
//	        // Find the middle point 
//	        int mid = (l+r)/2; 
//	  
//	        // If middle point is floor. 
//	        if (arr[mid] == x) 
//	            return mid; 
//	  
//	        // If x lies between mid-1 and mid 
//	        if (mid > 0 && arr[mid-1] <= x && x < arr[mid]) 
//	            return mid-1; 
//	  
//	        // If x is smaller than mid, floor must be in left half. 
//	        if (x < arr[mid]) 
//	            return floorSearch(arr, l,mid - 1, x); 
//	  
//	        // If mid-1 is not floor and x is greater than arr[mid], 
//	        return floorSearch(arr, mid + 1, r, x); 
//	   }

		
//		private static void facingTheSun() {
//			int n = s.nextInt() ;
//			int[] arr = new int[n] ;
//			for(int i=0;i<n;i++)
//				arr[i] = s.nextInt() ;
//	
//			int j = 0 ;
//			int count = 1 ;
//			for(int i=1;i<n;i++) {
//				if(arr[i] > arr[j]) {
//					count++ ;
//					j=i ;
//				}
//			}
//			System.out.println(count);
//		}

	
//	private static void findMissingElement() {
//		int n = s.nextInt() ;
//		int sum = 0 ;
//		for(int i=0;i<n-1;i++)
//			sum += s.nextInt() ;
//        System.out.println((n*(n+1))/2-sum);
//	}

//	private static void printLastIndexOfOne() {
//		String a = s.next() ;
//		int l = a.length() ;
//		for(int i=l-1;i>=0;i--) {
//			if(a.charAt(i) == '1') {
//				System.out.println(i);
//				return ;
//			}
//		}
//		System.out.println(-1);
//	}

//	private static void sqrt() {
//		int x = findSQRT(s.nextInt()) ;
//		System.out.print(x);		
//	}
//	private static int findSQRT(long x) {
//		int j ;
//		for(j = 0 ; j*j<=x ; j++) 
//			if(j*j == x) 
//				return j ;		
//		return j-1 ;
//	}

//	private static void binarySearch() {
//		int n = s.nextInt() ;
//		int x = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i=0;i<n;i++)
//			arr[i] = s.nextInt() ;
//		int m = find(arr,0,n,x) ;
//		if(m == -1)
//			System.out.println(-1);
//		else
//			System.out.println(m+1);
//	}
//
//	private static int find(int[] arr, int l, int r, int x) {
//		if(r>=l) {
//			int m = l + (r-l)/2 ;
//			if(arr[m] == x) {
//				System.out.println(m);
//				return m;
//			}
//			if( arr[m] > x )
//				return find(arr, l, m-1, x);
//			return find(arr, m+1, r, x);
//		}
//		return -1 ;
//	}


//	private static void linearSearch() {
//		int n = s.nextInt() ;
//		int x = s.nextInt() ;
//		boolean flag = true ;
//		int[] arr = new int[n] ;
//		for(int i=0;i<n;i++)
//			arr[i] = s.nextInt() ;
//		for(int i=0;i<n;i++) {
//			if(arr[i] == x ) {
//				System.out.println(i+1);
//				flag = false;
//				break ;
//			}
//		}
//		if(flag)
//			System.out.println(-1);			
//	}

	
//	private static void sort01Array() {
//		int[] a = {1,1,1,0,1,0,1,0,1} ;
//		int j = 0 ;
//		for(int i=1;i<a.length;i++) {
//			if(a[i] == 0) {
//				int temp = a[i] ;
//				a[i] = a[j] ;
//				a[j] = temp ;
//				j++ ;
//			}
//		}
//		for(int i=0;i<a.length;i++)
//			System.out.print(a[i]+" ");
//	}

//	private static void findOccurence() {
//		int n = s.nextInt() ;
//		int x = s.nextInt() ;
//		int[] arr = new int[n] ;
//		for(int i=0;i<n;i++)
//			arr[i] = s.nextInt() ;
//		
//		int count = 0 ;
//		for(int i=0;i<n;i++){
//			if(arr[i] == x) {
//				count++ ;
//			}
//			else if (arr[i] != x && count != 0) {
//				break ;
//			}
//		}
//		if(count == 0)
//			System.out.println(-1);
//		else
//		System.out.println(count);
//	}

	
	
}
