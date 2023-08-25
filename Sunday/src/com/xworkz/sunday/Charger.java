package com.xworkz.sunday;

public class Charger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row=1;row<5;row++)
		{
			for(int col=1;col<5;col++)
			{
				if(row==1&&col==1||row==1&&col==3||row==3&&col==1||row==3&&col==3)
				{
					System.out.print("*" +"  ");
				}
				}
				System.out.println(" ");
			
		}

	}

}
