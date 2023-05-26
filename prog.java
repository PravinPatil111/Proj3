package com.testCase;

public class prog {

	public static void main(String[] args) {
		String str = "1  2  3(5,8)" ;
        String  at= str.replaceAll("[("
        		+ "),58]","   "); 
  
        
       System.out.println(at);


	}

}
