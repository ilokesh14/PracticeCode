package com.lokesh.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertToUpperCase {
	public static void main(String[] args) throws NumberFormatException, IOException {

//		BufferReader object is created here to read the data from the screen and append it to the buffer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		while(tc>0){

//			It reads a line from the screen until enter is pressed 
			String s = br.readLine();
	    	
			convertToUpperCase(s);
			tc--;
			}
		
	}
		
	private static void convertToUpperCase(String s) {
		char[] c = s.toCharArray() ;
		
		if(c[0] != ' ' && c[0] != '\0')
			c[0] = Character.toUpperCase(c[0]) ;
		
			for(int i = 0 ; i<c.length ; i++) {
				
				if(c[i] == ' ') {
					i++ ;
					c[i] = Character.toUpperCase(c[i]) ;
					i--;
				}
			}
			for(int i = 0 ; i<c.length ; i++) 
			System.out.print(c[i]);
			System.out.println();
	}
}
