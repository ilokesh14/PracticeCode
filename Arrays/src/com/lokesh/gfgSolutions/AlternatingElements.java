package com.lokesh.gfgSolutions;

//Java program to merge two sorted arrays 
import java.io.*; 

class GFG { 
	
	// Alternatively merge arr1[0..n1-1] and 
	// arr2[0..n2-1] into arr3[0..n1+n2-1] 
	static void alternateMerge(int arr1[], int arr2[],int n1, int n2, int arr3[]) 
	{ 
		int i = 0, j = 0, k = 0; 
	
		// Traverse both array 
		while (i < n1 && j < n2) 
		{ 
			arr3[k++] = arr1[i++]; 
			arr3[k++] = arr2[j++]; 
		} 
	
		// Store remaining elements of first array 
		while (i < n1) 
			arr3[k++] = arr1[i++]; 
	
		// Store remaining elements of second array 
		while (j < n2) 
			arr3[k++] = arr2[j++]; 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		int arr1[] = {1, 3, 5, 7, 9, 11}; 
		int n1 = arr1.length; 
	
		int arr2[] = {2, 4, 6, 8}; 
		int n2 = arr2.length; 
	
		int arr3[] = new int[n1+n2]; 
		alternateMerge(arr1, arr2, n1, n2, arr3); 
	
		System.out.println("Array after merging"); 
		for (int i = 0; i < n1 + n2; i++) 
			System.out.print( arr3[i] + " "); 
	} 
} 

