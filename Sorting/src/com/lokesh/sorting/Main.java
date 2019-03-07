package com.lokesh.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
				tc--;
//				checkIfArrayIsSortedOrNot() ;
//				binaryArraySorting() ;
//				bubbleSort() ;
//				tripletFamily() ;
//				selectionSort() ;
//				sortTheHalfSorted() ;
//				sortArrayOf012();
//				countTriplet() ;
//				tripletSumInArray() ;
//				insertionSort();
//				mergeSortArray() ;
//				quickSortArray() ;
//				kthLargestElementInArray() ;
//				unknownSort();
			}
		}
		
	private static void unknownSort() {
		int n = s.nextInt() ;
		int arr[] = new int[n] ;
		
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt() ;
		int k = s.nextInt() ;

		
	}

	private static void kthLargestElementInArray() {
		int n = s.nextInt() ;
		int arr[] = new int[n] ;
		
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt() ;
		int k = s.nextInt() ;
		
		int kthMax = 0 ;
		
	}


	private static void mergeSortArray() {		
		int n = s.nextInt() ;
		int arr[] = new int[n] ;
		
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt() ;
		
		mergeSort(arr,0,n-1);
	}

	private static void mergeSort(int[] arr, int l, int r) {
		if(l<r) {
			int m = l + (r-l)/2 ;
			mergeSort(arr, l, m);
			mergeSort(arr, m+1,r);
			merge(arr,l,m,r);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1 ;
		int n2 = r - m ;
		
		int a1[] = new int[n1] ;
		int a2[] = new int[n2] ;
		
		for(int i=0;i<n1;i++)
			a1[i] = arr[l+i] ;
		
		for(int i=0;i<n2;i++)
			a2[i] = arr[m+1+i] ;
		
		int i = 0 ;
		int j = 0 ;
		int k = l ;
		
		while(i < n1 && j < n2  ) {
			if(a1[i] <= a2[j]) {
				arr[k] = a1[i] ;
				i++;
			}
			else {
				arr[k] = a2[j] ;
				j++;
			}	
			k++ ;
		}
		while(i<n1) {
			arr[k] = a1[i] ;
			k++ ;
			i++ ;
		}
		while(j<n2) {
			arr[k] = a2[j] ;
			k++ ;
			j++ ;
		}
	}

//	private static void insertionSort() {
//		int n = s.nextInt() ;
//		int arr[] = new int[n] ;
//		
//		for(int i=0;i<n;i++)
//			arr[i] = s.nextInt() ;
//		for(int i=1;i<n;i++) {
//			int k = arr[i] ;
//			int j = i - 1 ;
//			while(j>=0 && arr[j] > k) {
//				arr[j+1] = arr[j] ;
//				j-- ;
//			}
//			arr[j+1] = k ;
//		}
//		for(int i=0;i<n;i++)
//			System.out.print(arr[i]+" ");
//	}

	private static void tripletSumInArray() {
		int n = s.nextInt() ;
		int x = s.nextInt() ;
		int arr[] = new int[n] ;
		
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt() ;
		
		Arrays.sort(arr);
		for(int i=n-1;i>0;i--) {
			int j = 0 ;
			int k = i - 1 ;
			while(j<k) {
				if(x == arr[i] + arr[j] + arr[k]) {
					System.out.println(1);
					return ;
				}
				else if (x > arr[i] + arr[j] + arr[k])  
					j += 1 ;
				else    
					k -= 1 ;
			}
		}
			System.out.println(-1);
	}

	private static void countTriplet() {
		int n = s.nextInt() ;
		int arr[] = new int[n] ;
		
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt() ;
		
		Arrays.sort(arr);		
		int count = 0 ;
		for(int i=n-1;i>0;i--) {
			int j = 0 ;
			int k = i - 1 ;
			while(j<k) {
				if(arr[i] == arr[j] + arr[k]) {
					count++ ;
					j++;
					k-- ;
				}
				else if (arr[i] > arr[j] + arr[k])  
					j += 1 ;
				else    
					k -= 1 ;
			}
		}
		if(count>0)	
			System.out.println(count);
		else	
			System.out.println(-1);
	}


	private static void sortArrayOf012() {
		int n = s.nextInt() ;
		int arr[] = new int[n] ;
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt() ;
		
		int j = 0,k = 0 , z = 0 ;

			for(int i=0;i<n;i++)
				if(arr[i] == 0)
					j++;
				else if(arr[i] == 1)
					k++ ;
				else
					z++ ;
			
			for(int x=0;x<j;x++)
				System.out.print(0+" ");
			for(int x=0;x<k;x++)
				System.out.print(1+" ");
			for(int x=0;x<z;x++)
				System.out.print(2+" ");
			System.out.println();
		}


	private static void sortTheHalfSorted() {
		int n = s.nextInt() ;
		int arr[] = new int[n] ;
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt() ;

		int mergePoint = 1 ;
		for(int i = 1 ; i<n ; i++) 
			if(arr[i-1] > arr[i])
				mergePoint = i ;
		
		int a1[] = new int[mergePoint];
		int a2[] = new int[n-mergePoint];
		
		for(int i=0;i<mergePoint;i++)
			a1[i] = arr[i] ;
		for(int i=mergePoint;i<n;i++)
			a2[i-mergePoint] = arr[i] ;

		mergeAndPrint(a1,a2);
	}

	private static void mergeAndPrint(int[] a1, int[] a2) {
		int i = 0 ;
		int j = 0;
		int n1 = a1.length ;
		int n2 = a2.length ;
		while(i < n1 && j < n2  ) {
			if(a1[i] <= a2[j]) {
				System.out.print(a1[i]+" ");
				i++;
			}
			else {
				System.out.print(a2[j]+" ");
				j++;
			}	
		}
		while(i<n1) {
			System.out.print(a1[i]+" ");
			i++ ;
		}
		while(j<n2) {
			System.out.print(a2[j]+" ");
			j++ ;
		}
		System.out.println();
	}


	private static void selectionSort() {
		int n = s.nextInt() ;
		int arr[] = new int[n] ;
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt() ;
		
		for(int i = 0;i<n;i++){
			int min = i ;
			for(int j=i+1 ; j<n ;j++)
				if(arr[min] > arr[j]) 
					min = j ;
			
			int t = arr[min] ;
			arr[min] = arr[i] ;
			arr[i] = t ;
		}
		for(int j=0;j<n ;j++)
			System.out.println(arr[j]+" ");
	}


		private static void tripletFamily() {
			int n = s.nextInt() ;
			int arr[] = new int[n] ;
			for(int i=0;i<n;i++)
				arr[i] = s.nextInt() ;
			
			ArrayList<Integer> list = new ArrayList<>() ;
			Arrays.sort(arr);
			
			for(int i=n-1;i>=0;i--) {
				int j = 0 ;
				int k = i - 1 ;
				while(j<k) {
					if(arr[i] == arr[j] + arr[k]) {
						list.add(arr[j]) ;
						list.add(arr[k]) ;
						list.add(arr[i]) ;		
					}
//1.	here we know arr[i] is always greater than arr[k] because the array is sorted 
//2.	So there is no use to do k-- ,when arr[i] > arr[j] + arr[k] , hence we do j++ .
					else if (arr[i] > arr[j] + arr[k])
						j += 1 ;
					
					else 		
						k -= 1 ;
				}
			}
			for(int i=0;i < list.size();i++) 
				if(!list.isEmpty())
					System.out.print(list.get(i)+" ");			
		}


		private static void binaryArraySorting() {
			int n = s.nextInt() ;
			int arr[] = new int[n] ;
			for(int i=0;i<n;i++)
				arr[i] = s.nextInt() ;
			int j = 0 ;
			for(int i=0;i<n;i++){
				if(arr[i] == 0){
					int temp = arr[i] ;
					arr[i] = arr[j] ;
					arr[j] = temp ;
					j++ ;
				}
			}
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}


		private static void checkIfArrayIsSortedOrNot() {
			int n = s.nextInt() ;
			int arr[] = new int[n] ;
			for(int i=0;i<n;i++)
				arr[i] = s.nextInt() ;
			
			for(int i=0;i<n-1;i++){
				if(arr[i+1] < arr[i]) {
					System.out.println(0);
					return ;
				}
			}
			System.out.println(1);
		}
		
		
		private static void bubbleSort() {
			int n = s.nextInt() ;
			int arr[] = new int[n] ;
			for(int i=0;i<n;i++)
				arr[i] = s.nextInt() ;
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n-1;j++) {
					if(arr[j] > arr[j+1]){
						int temp = arr[j] ;
						arr[j] = arr[j+1] ;
						arr[j+1] = temp ;
					}
				}
			}			
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
}
