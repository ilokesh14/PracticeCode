package com.lokesh.prefixSumAndSlidingWindow;

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
		while(tc-- > 0){
//			maxSumSubarrayOfSizeK() ;
//			subArrayWithGivenSum() ;
			equilibrimPoint() ;
		}
	}

	private static void equilibrimPoint() {		
		int n = f.nextInt() ;
	    int pre[] = new int[n];
	    int arr[] = new int[n] ;
		for(int i=0;i<n;i++)
			arr[i] = f.nextInt() ;
			
        int sum1 = 0, sum2 = 0, ans = -1;
        for(int i=0; i<n; i++){
            sum1 += arr[i];
            pre[i] = sum1;
        }
        for(int i=n-1; i>=0; i--){
            sum2 += arr[i];
            if(sum2 == pre[i])
                ans=i+1;
        }
        if(ans==0){
            System.out.println(-1);
        }
            System.out.println(ans);
	}

	private static void subArrayWithGivenSum() {
//
//		int n = f.nextInt() ;
//		int sum = f.nextInt() ;
//		int a[] = new int[n] ;
//		for(int i=0;i<n;i++)
//			a[i] = f.nextInt() ;
//		Map<Integer, Integer> map = new Hashtable<>() ;
//		
//		int pSum = a[0] ;
//		map.put(a[0],pSum) ;
//		for(int i=1;i<n;i++) {
//			pSum += a[i] ;
//			map.put(a[i],pSum) ;
//			System.out.println(pSum+" aaa "+a[i]);
//		}
//		if() {
//			
//		}
	}

	private static void maxSumSubarrayOfSizeK() {
		int n = f.nextInt() ;
		int k = f.nextInt() ;
		int a[] = new int[n] ;

		for(int i=0;i<n;i++)
			a[i] = f.nextInt() ;

		int sum = 0 ;
		for(int i=0;i<k;i++)
			sum += a[i] ;

		int temp = sum ;
		for(int i=k;i<n;i++) {
			temp += a[i] - a[i-k] ;
			sum = Math.max(temp,sum) ;
		}
		System.out.println(sum);
	}
	
}
