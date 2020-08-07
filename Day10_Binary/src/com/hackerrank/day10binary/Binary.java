package com.hackerrank.day10binary;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Binary {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String binary = Integer.toBinaryString(n);
        String[] oneZero = binary.split("0");
        
        int consecuence = 0;
        
        for (int i = 0; i < oneZero.length; i++) {
        if (consecuence < oneZero[i].length()) {
        	consecuence = oneZero[i].length();
        	}
        }
        System.out.println(consecuence);
        
        
        
        
        
        
        
        
        scanner.close();
    

	}

}
