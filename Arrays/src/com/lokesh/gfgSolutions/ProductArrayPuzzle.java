package com.lokesh.gfgSolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class ProductArrayPuzzle {
	
	public static void main (String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		while(tc>0){
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			long pro = 1;
			String[] s = br.readLine().trim().split(" ");

			for(int i = 0 ; i < n ; i++ ){
				arr[i] = Integer.parseInt(s[i]);
				pro *= arr[i];
			}

			StringBuffer sb= new StringBuffer();

			for(int i = 0 ; i < n ; i++ ){
				sb.append((int)pro/arr[i]+" ");
			}
			System.out.println(sb);
			tc--;
			
			sc.close();
		}
	}
}

