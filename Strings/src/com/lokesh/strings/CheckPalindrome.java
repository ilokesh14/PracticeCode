	package com.lokesh.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckPalindrome {
	public static Scanner s ;
	public static void main(String[] args) throws NumberFormatException, IOException {

//		BufferReader object is created here to read the data from the screen and append it to the buffer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		while(tc>0){
			int n = Integer.parseInt(br.readLine()) ;
//			It reads a line from the screen until enter is pressed 
			String s = br.readLine();
	    	
			checkPalindrome(s,n);
			tc--;
			}
		
	}
		
	private static void checkPalindrome(String string,int n) {
		if(!string.isEmpty()) {
			int count = 0 ;
			for(int i=0;i<= n/2;i++) {
				if(string.charAt(i) == string.charAt(n-i-1)) {
					count++ ;
					System.out.println(count+" "+string.charAt(i));
				}
			}
			if(count> n/2)
				System.out.println("Yes");
			else 
				System.out.println("No");
		}
	}
	
}
