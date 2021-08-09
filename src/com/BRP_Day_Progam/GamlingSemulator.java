package com.BRP_Day_Progam;

import java.util.*;
public class GamlingSemulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many stake u have?");
		int n=sc.nextInt();
		System.out.println("How many stake u want to spend");
		int s=sc.nextInt();
		
		Game g=new Game();
		g.play(n,s);

	}

}


class Game
{

	static Scanner sc;

	void play(int n,int s)
	{
		
	int win=0, loss=0;

		sc=new Scanner(System.in);
		n=n-s;
		System.out.println("\nstake are = "+n);
		Random r=new Random();
		int a[]=new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=r.nextInt(s);

			if(a[i]>s/2)
			{
		System.out.println("win");
			}
			else
			{
		System.out.println("Loss");
			}
		}
		
	/*	System.out.println("Generated no. are");
		
		for(int i=0;i<s;i++)
		{
			System.out.println(a[i]);
		}*/
		

		for(int j=0;j<s;j++)
		{
			if(a[j]>s/2)
			{
				win++;
				n++;
			}
			else
			{
				loss++;
				 n--;
			}
		}
		System.out.println("win = "+win+ "\nLoss = "+loss+ "\nwin % = "+(win*100)/s+"\nLoss % = "+(loss*100)/s+"\nremaining stake are = "+n);
		
		System.out.println("\nDo u want to play again press y");

		char k=sc.next().charAt(0);

		if(k=='y')

		playAgain(n);
		
		
				
	}


	void playAgain(int n)
	{
		
		System.out.println("How many stake u want to spend?");
		int s=sc.nextInt();
		//n=n-s;
		//System.out.println(" stake are = "+n);
		play(n,s);
	}
	

}