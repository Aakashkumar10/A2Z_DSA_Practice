package Patterns_Star;

import java.util.Scanner;

public class Pattern1 {

public static void main(String args [])
{
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the value of Rows... ");
	
	int n = sc.nextInt();
	
	System.out.print(" Enter the Coloumn values ...");

	 int m = sc.nextInt();
	for (int i=0;i<n;i++)
	{
	for(int j=1;j<=m;j++)	
	{
		
		System.out.print("*");
		System.out.print(" ");
	}
	System.out.println(" ");	
		
	}
	
	
	
}
	
	
	
	
}
