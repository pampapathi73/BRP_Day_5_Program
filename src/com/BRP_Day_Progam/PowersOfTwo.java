package com.BRP_Day_Progam;

import java.util.Scanner;
public class PowersOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number:");
         int n = sc.nextInt();
         for(int i=0 ; i<=n ; i++)
         {
             System.out.println(i + "\t" + ((int)(Math.pow(2,i))));
         }

	}

}
