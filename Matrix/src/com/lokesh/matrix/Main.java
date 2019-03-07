package com.lokesh.matrix;

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
//				transposeOfMatrix() ;
//				printMatrixInSnakePattern();
//				squareInAMatrix() ;
//				rowWithMinimumNumberOfOnes();
//				spirallyTraverseTheMatrix();
//				System.out.println(searchInSorterMatrix()); ;
//				countPairSumInMatrix();
//				booleanMatrixProblem();
				rowWithMaxOnes();
//				columnWithMiinimunDifference();
			}
		}


		private static void rowWithMaxOnes() {
			int n = f.nextInt() ;
			int m = f.nextInt() ;
			int minZeroCount = 0 ;
			int minOneCount = 0 ;
			int indexOfMinOne = -1 ; 
			int p = Integer.MIN_VALUE ;
			int i,j;
			for(i=0;i<n;i++) {
				for(j=0;j<m;j++) {
					int temp = f.nextInt() ;
					if(temp == 1)
						minOneCount++ ;
					else 
						minZeroCount++ ;
				}
				if(minOneCount > p &&  minOneCount > 0  ) {
					indexOfMinOne = i ;
					p = minOneCount ;
				}
				minOneCount = 0 ;
			}
			if(minZeroCount == n*m){
				System.out.println(-1);
				return ;
			}
			else
				System.out.println(indexOfMinOne);
		}

		
		/**
		 *	1
			5
			1 2 3 4 5
			6 7 8 9 0
			2 4 6 8 0
			1 3 5 7 9
			3 1 6 8 9
		 */
		private static void columnWithMiinimunDifference() {
			int n = f.nextInt() ;
			int a[][] = new int[n][n] ;
			int sum[] = new int[n] ;
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a[i][j] = f.nextInt() ;		
			
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					sum[i] += a[j][i] ;

			int min ;
			boolean b = false ;
			min = Integer.MAX_VALUE ;
			for(int i= 0;i<n;i++) {
				for(int j=1;j<n;j++) {
					if(j>i && min > sum[j]-sum[i]) {
						b = true ;
						min = sum[j] - sum[i] ;
					}
				}
			}
			if(b)
				System.out.println(min);
			else
				System.out.println("Not Possible");
		}


		private static void booleanMatrixProblem() {
			int m = f.nextInt() ;
			int n = f.nextInt() ;
			int a[][] = new int[m][n] ;
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					a[i][j] = f.nextInt() ;		

			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if( a[i][j] == 1 ) {
						setRow(a,i,n);
//						setCol(a,j,m);
//						System.out.println("i is "+i+" j is "+j);
						break ;
					}
				}
			}
			System.out.println();
			printArray(a,n,m) ;
		}

		private static void setCol(int[][] a, int j, int m) {
			for(int i=0;i<m;i++)
				a[i][j] = 1 ;
		}
		private static void setRow(int[][] a, int i , int n) {
			for(int j=0;j<n;j++)
				a[i][j] = 1 ;
		}

		private static void printArray(int[][] a, int n, int m) {
			for(int i=0;i<n;i++) { 
				for(int j=0;j<m;j++) { 
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}


		private static void countPairSumInMatrix() {
			int n = f.nextInt() ;
			int x = f.nextInt() ;
			int a1[][] = new int[n][n] ;
			int a2[][] = new int[n][n] ;
			int count = 0;
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a1[i][j] = f.nextInt() ;		
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					a2[i][j] = f.nextInt() ;		
			
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					count += check(x-a1[i][j],a2,x);
			System.out.println(count);
		}

		private static int check(int z, int[][] a2,int x) {
			for(int i=0;i<a2.length;i++){
				for(int j=0;j<a2.length;j++){
					if(z == a2[i][j]) {
						System.out.println("found "+a2[i][j]+" and "+(x-a2[i][j]));
						return 1 ;
					}
				}
			}
			return 0 ;
		}

		private static int searchInSorterMatrix() {
			int n = f.nextInt() ;
			int m = f.nextInt() ;
			int a[][] = new int[n][m] ;
			
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					a[i][j] = f.nextInt() ;		
			
			int k = f.nextInt() ;			
			
			for(int i=0 ; i<n ; i++ ){
				if(k >= a[i][0] && k <= a[i][m-1] ) {
					for(int j = 0 ; j < m ; j++)
						if(k == a[i][j]) 
							return 1;
					return 0;
				}
			}
			return 0;
		}

//		solution
		private static void spirallyTraverseTheMatrix() {
			int n = f.nextInt() ;
			int m = f.nextInt() ;
			int a[][] = new int[n][m] ;	
			for(int i=0;i<n;i++)
				for(int j=0;j<m;j++)
					a[i][j] = f.nextInt() ;			
			int i, k = 0, l = 0;
			while (k < m && l < n){ 
	            // Print the first row from the remaining rows 
	            for (i = l; i < n; ++i)
	                System.out.print(a[k][i]+" "); 
	            k++; 
	            // Print the last column from the remaining columns  
	            for (i = k; i < m; ++i) 
	                System.out.print(a[i][n-1]+" "); 
	            n--; 	   
	            // Print the last row from the remaining rows */ 
	            if ( k < m){ 
	                for (i = n-1; i >= l; --i) 
	                    System.out.print(a[m-1][i]+" ");
	                m--; 
	            } 
	            // Print the first column from the remaining columns */ 
	            if (l < n){ 
	                for (i = m-1; i >= k; --i) 
	                    System.out.print(a[i][l]+" ");
	                l++;     
	            }         
	        } 
		}

//		private static void rowWithMinimumNumberOfOnes() {
//			int n = f.nextInt() ;
//			int m = f.nextInt() ;
//			int a[][] = new int[n][m] ;	
//			int minZeroCount = 0 ;
//			int minOneCount = 0 ;
//			int indexOfMinOne = -1 ; 
//			int p = Integer.MAX_VALUE ;
//			int i,j;
//			for(i=0;i<n;i++) {
//				for(j=0;j<m;j++) {
//					int temp = f.nextInt() ;
//					if(temp == 1)
//						minOneCount++ ;
//					else 
//						minZeroCount++ ;
//				}
//				if(minOneCount < p &&  minOneCount > 0  ) {
//					indexOfMinOne = i ;
//					p = minOneCount ;
//				}
//				minOneCount = 0 ;
//			}
//			if(minZeroCount == n*m){
//				System.out.println(-1);
//				return ;
//			}
//			else
//				System.out.println(indexOfMinOne);
//		}
		
//		private static void squareInAMatrix() {
//			int a = s.nextInt() ;
//			int b = s.nextInt() ;
//			long sum = 0;
//			while(a>0&&b>0)
//			{
//			sum=sum+a*b; 
//			a--;
//			b--;
//			}
//			System.out.println(sum);
//		}
//
//		private static void printMatrixInSnakePattern() {
//			int n = s.nextInt() ;
//			int a[][] = new int[n][n] ;
//			for(int i=0;i<n;i++)
//				for(int j=0;j<n;j++)
//					a[i][j] = s.nextInt() ; 
//			for(int i=0;i<n;i++)
//				for(int j=0;j<n;j++) {
//					if(i%2 == 0)
//						System.out.print(a[i][j]+" ");					
//					if(i%2 != 0)
//					System.out.print(a[i][n-1-j]+" ");					
//				}
//			System.out.println();
//		}	
//
//		private static void transposeOfMatrix() {
//			int n = s.nextInt() ;
//			int a[][] = new int[n][n] ;
//			for(int i=0;i<n;i++)
//				for(int j=0;j<n;j++)
//					a[i][j] = s.nextInt() ; 
//			for(int j=0;j<n;j++)
//				for(int i=0;i<n;i++)
//					System.out.print(a[i][j]+" ");
//			System.out.println();
//		}

}
