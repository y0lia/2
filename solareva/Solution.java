package com.solareva;
import java.io.*;

public class Solution {
	
    

	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number: ");
        String a = reader.readLine();
        int b = Integer.parseInt(a);
        System.out.print("The next number for the number " + b + " is " );
        
       int  c;
            c = b+1;
           
            System.out.println(c);
        
        System.out.print("The previous number for the number " + b + " is "  );
        b = b-1;
        
        System.out.println(b);
        		
    }

}
