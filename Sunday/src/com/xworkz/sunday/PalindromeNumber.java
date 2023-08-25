package com.xworkz.sunday;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		//Scanner scanner=new Scanner(System.in);
		//System.out.println("Enter a number:");
		//int no=scanner.nextInt();
		//The above the comment lines is to enter the number during run time
		int no=121;
		int temp=no;
		int rev=0,rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+ " is a palindrome number");
		}
		else
		{
			System.err.println(no+ " is not a palindrome number");
		}
		

	}

}
