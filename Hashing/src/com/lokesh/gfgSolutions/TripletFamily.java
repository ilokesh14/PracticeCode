package com.lokesh.gfgSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class FindTriplet { 		
		public static Scanner s ;
		public static void main(String[] args) {
			System.out.println("Hello");
			s = new Scanner(System.in);
			int tc = s.nextInt() ;			
			while(tc>0){
				tc--;
				tripletFamily() ;
			}
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
					else if (arr[i] > arr[j] + arr[k]) {
						j += 1 ;
					}
					else {
						k -= 1 ;
					}
				}
			}
			for(int i=0;i < list.size();i++) 
				if(!list.isEmpty())
					System.out.print(list.get(i)+" ");			
		}
}
