package com.lokesh.puzzles;

import java.util.Scanner;

public class Main4 {

	public static Scanner s ;
	public static void main(String[] args) {
		System.out.println("Hello");
		s = new Scanner(System.in) ;
		int t = s.nextInt() ;

		for( int i = 0 ; i < t ; i++ ) {
//			printjumpingNumbers() ;
//			findTrailingZerosInFactorial();
			
		}
	}
	
	
//	private static void findTrailingZerosInFactorial() {
//		int number = s.nextInt() ;
//		int trailingzero = 0;
//		while (number != 0)
//		trailingzero += number/=5;
//		 System.out.println(trailingzero);
//		}
	
	
//	private static void printjumpingNumbers() {
//		int n = s.nextInt() ;
//		
//        LinkedList<Integer> queue = new LinkedList<>();
//        ArrayList<Integer> arr = new ArrayList<>() ;
//
//        arr.add(0, 0);
//        int j = 1 ;
//        for (int i = 1; i <= 9; i++) {
//            queue.add(i);
//            while (!queue.isEmpty()) {
//                int temp = queue.remove();
//                
//                if (temp > n) 
//                	continue;
//                
//                arr.add(j,temp) ;
////                arr[j] = temp ;
//                j++ ;
//                
//                int leftMost = temp % 10;
//                
//                if (leftMost > 0) 
//                	queue.add(temp * 10 + (leftMost - 1));
//                
//                if (leftMost < 9) 
//                	queue.add(temp * 10 + (leftMost + 1));
//            }
//        }
//        printArray(arr,j) ;
//    }
//	private static void printArray(ArrayList<Integer> arr,int j) {
//
////		for(int k=0;k<j;k++) 
////			System.out.print(arr.get(k)+" ");
////		
////		System.out.println();
////		System.out.println("Using Array.sort()");
//
//		arr.sort(null);
//		
//		for(int k=0;k<j;k++) 
//			System.out.print(arr.get(k)+" ");
//	}
//	
	
}
