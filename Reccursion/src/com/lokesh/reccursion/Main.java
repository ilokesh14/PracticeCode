package com.lokesh.reccursion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
//		public static Scanner f ;
		public static FastReader f ;
		public static void main(String[] args) throws NumberFormatException, IOException {
			System.out.println("Hello");
			f = new FastReader() ;
//			f = new Scanner(System.in);
//			int tc = f.nextInt() ;
			int tc = f.nextInt() ;
			while(tc>0){
				tc--;
//				toh();
//				permute();
//				printPattern();
//				recursivelyRemoveAdjecentDuplicate() ;
			}
		}
		
		
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
