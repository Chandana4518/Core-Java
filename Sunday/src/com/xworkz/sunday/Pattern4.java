package com.xworkz.sunday;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");//or s.o.p("*"+" ")
			}
			System.out.println();
		
		}
		

	}

}
