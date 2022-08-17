/*
Algorithm
---------
step1:Start.
step2:Create object to scan recieve input
step3:Print "Enter the number of elements:".
Step4:Scan elements into n.
Step5:Create an Array.
Step6:Scan elements into array.
Step7:Sort the array using loop.
Step8:Print elements in the index position 0, n-1,n-2.
Step9:Stop

*/

//Program
import java.io.*;
import java.util.Scanner;

public class SmallestAndLargest
{
	public static void main(String args[])
        {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of elements : ");

		int n = s.nextInt();

		int array[] = new int[n];

		System.out.print("Enter the elements into array : ");

		for(int i=0; i<n; i++)
                     {
                     array[i] = s.nextInt();
                      }
		for(int i=0; i<n; i++)
                    {
			for(int j=0; j<n-1; j++)
                            {
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
                             }
                     }
		System.out.println("\nSmallest - "+array[0]+"\nLargest - "+array[n-1]+"\nSecond Largest - "+array[n-2]);
	}
}
