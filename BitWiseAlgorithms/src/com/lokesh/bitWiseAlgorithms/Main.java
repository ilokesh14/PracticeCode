package com.lokesh.bitWiseAlgorithms;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static Scanner f ;
//	public static FastReader f ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Hello");
//		f = new FastReader() ;
		f = new Scanner(System.in);
		int tc = f.nextInt() ;
		while(tc-- > 0) {
//			findPositionOfSetbit() ;
//			powerOf2();
//			findOddOcurrence();
			setBits();
		}
	}
	
	private static void setBits() {
		int n = f.nextInt() ;
		String s = "" ;
		while(n>0) {
			s= n%2+s ;
			n = n/2 ;
		}
		int c = 0 ;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i) == '1') 
				c++ ;
		System.out.println(c);
	}

	private static void findOddOcurrence() {
		int n = f.nextInt();
		Map<Integer, Integer> map = new HashMap<>() ;
		int a[] = new int[n] ;
		for(int i=0;i<n;i++) {
			a[i] = f.nextInt() ;
			if(map.containsKey(a[i]))
				map.put(a[i], map.get(a[i])+11) ;
			else
				map.put(a[i],1) ;
		}
		for(int i=0;i<n;i++) {
			if(map.get(a[i]) != null)
				if(map.get(a[i]) == 1 )
				System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	private static void powerOf2() {
//		Integer n = new Integer(f.next()) ;
		String n = f.next() ;
		for(int i=0;i*i<Long.parseLong(n);i++) {
			if(Long.parseLong(n) == Math.pow(2,i)){
				System.out.println("YES");
				return ;
			}
		}
		System.out.println("NO");
	}

	private static void findPositionOfSetbit() {
		int n = f.nextInt() ;
		String s = "" ;
		while(n>0) {
			s= n%2+s ;
			n = n/2 ;
		}
//		System.out.println(s);
		int c = 0 ;
		int index = -1 ;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == '1') {
				c++ ;
				index = i ;
			}
		}
		if(c==1)
			System.out.println(s.length()-index);
		else
			System.out.println(-1);
	}
	
}
