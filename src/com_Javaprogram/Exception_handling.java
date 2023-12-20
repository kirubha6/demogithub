package com_Javaprogram;

public class Exception_handling {
	
	public static void main(String[] args) {
		
	 		try {
			int i = 15;
	        int k = 0;
	        int H = i/k;
	       System.out.println(H);
			
			
		} catch (Exception e) {
			
			 System.out.println("handle arithmatic"+e);
		}
		
		
	}
	

}
