/*
Algorithm
---------
Step1:Start.
Step2:Declare no of rows and cols for array[][].
Step3:Scan the elements into array, set i=0,repeat step 4 while i<r.
Step4:Set j=0,repeat step 5 while j<c.
Step5:Scan into array[i][j].
Step6:Declare and set trace=0.
Step7:Set i=0,repeat step 8 while i<r.
Step8:Set j=0,repeat step 9 to 10 while j<c.
Step9:Display array[i][j].
Step10:if (i == j),then set trace += a[i][j].
Step11:Display trace.
Step12:Set i=0,repeat step 13 while i<r.
Step13:Set j=0,repeat step 14 while j<c.
Step14:Display array[j][i].
Step15:Stop.

*/

//Program

import java.io.*;
import java.util.Scanner;

public class TraceAndTranspose
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row & col of the matrix : ");
		int r = s.nextInt();
		int c = s.nextInt();
		int a[][] = new int[r][c];

		System.out.println("Enter the elements to the matrix");
		for (int i=0; i<r; i++)
			for (int j=0; j<c; j++)
				a[i][j] = s.nextInt();

		int trace = 0;
		System.out.println("Entered matrix is ");
		for (int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(a[i][j] + " ");
				if (i == j) trace += a[i][j];
			}
			System.out.println();
		}

		System.out.println("Trace of the matrix is " + trace);
		System.out.println("Transpose of the matrix");
		for (int i=0; i<r; i++)
		{
			for (int j=0; j<c; j++)
				System.out.print(a[j][i] + " ");
			System.out.println();
		}
	}
}
