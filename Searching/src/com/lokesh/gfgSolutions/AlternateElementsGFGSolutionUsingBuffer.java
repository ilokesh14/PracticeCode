package com.lokesh.gfgSolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternateElementsGFGSolutionUsingBuffer {
	
	public static void main (String[] args) throws IOException {
		
//		BufferReader object is created here to read the data from the screen and append it to the buffer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		while(tc>0){

//			It reads a line from the screen untill enter is pressed 
			String[] s = br.readLine().trim().split(" ");
			int n1 = Integer.parseInt(s[0]) ;
			int n2 = Integer.parseInt(s[1]) ;

			int[] a1 = new int[n1];
			int[] a2 = new int[n2];

			String[] s1 = br.readLine().trim().split(" ");
			for(int i = 0 ; i < n1 ; i++ )
				a1[i] = Integer.parseInt(s1[i]) ;

			String[] s2 = br.readLine().trim().split(" ");
			for(int i = 0 ; i < n2 ; i++ )
				a2[i] = Integer.parseInt(s2[i]) ;

			StringBuffer sb = new StringBuffer();

			int n = n1 > n2 ? n1 : n2 ;
	    	for(int i=0; i<n ;i++) {// i=0 to i<8
	    		if(i < n1)
					sb.append((int)a1[i]+" ");
	    		if(i < n2)
					sb.append((int)a2[i]+" ");
	    	}
	    	
			System.out.println(sb);
			tc--;
			}
	}
}
