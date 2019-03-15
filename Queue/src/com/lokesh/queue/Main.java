package com.lokesh.queue;

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
//		int tc = f.nextInt() ;
		int tc = f.nextInt() ;
		while(tc-- > 0){
//			findNonRepeatingCharInStream() ;
		}
	}
	private static void findNonRepeatingCharInStream() throws IOException {
		int n = f.nextInt() ;
		char crr[]=new char[n];
        for(int i=0;i<n;i++){
            char c = f.next().charAt(0);
            crr[i]= c;
        }
        Map<Character, Integer> map = new Hashtable<>() ;
        for(int i=0;i<n;i++) {
        	if(map.containsKey(crr[i])) {
        		map.put(crr[i],map.get(crr[i])+1) ;
        	}
        	else
        		map.put(crr[i],1) ;		
        }

        StringBuilder sb = new StringBuilder() ;
        for(int i=0;i<n;i++) {
        	if(map.get(crr[i]) >= 1) {
        		sb.append(crr[i]+" ") ;
        		map.put(crr[i], map.get(crr[i])-100) ;
        	}
        	else 
        		sb.append(-1+" ") ;
        }
        System.out.println(sb.toString());
	}
	
}
