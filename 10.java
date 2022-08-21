/*
Algorithm
---------
Step1:Start
Step2:Declare and set sum=0,rev=0.
Step3:Declare and scan num.
Step4:Declare and set i=num.
Step5:Repeat steps 6 to 9 while i!=0.
Step6:Declare and set dig = i % 10.
Step7:Set sum += dig, rev=(rev*10)+dig;
Step8:update i=i/10.
Step9:Display rev.
Step10:Stop.
*/
import java.io.*;
import java.util.Scanner;

public class SumAndReverse
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = s.nextInt();

		int sum = 0, rev = 0;
		for(int i = num; i != 0; i /= 10){
			int dig = i % 10;
			sum += dig;
			rev = ( rev * 10) + dig;
		}

		System.out.println("\nSum of digits is " + sum + "\nReverse of the number is " + rev);
	}
}
