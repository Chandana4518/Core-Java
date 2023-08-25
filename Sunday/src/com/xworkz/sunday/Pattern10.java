package com.xworkz.sunday;

public class Pattern10 {

	public static void main(String[] args) {
		
		
		//Another way for pattern9
		
		for(int i=1;i<=5;i++)
		{
			
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<(i*2);k++)
		{
			System.out.print("*");
		}
		System.out.println();
		}

	}

}
