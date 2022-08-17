/*
Algorithm
----------
Step1:Start.
Step2:Declare num1,num2.
Step3:Print Enter the lower limit and upper limit.
Step4:Scan lower limit and upper limit into num1 and num2.
Step5:Repeat from i = start_value to end_value.
       Repeat until (temp != 0).
       remainder = temp % 10.
       len=getOrder(i).
       sum = sum + pow(remainder,len).
       temp = temp/10.
       if (result == number).
       Print the number.
Step6:Stop.

getOrder Function
Step1:Start.
Step2:Declare len=0.
Step3:Repeat step 4 and 5 until i!=0
Step4:len++;
Step5:i=i/10;
Step6:Return len.
Step:Stop.

*/
import java.io.*;
import java.util.Scanner;

public class Armstrong
{
      public static void main(String[] args)
	{
	  int num1,num2;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the lower limit");
	  num1 = sc.nextInt();
	  System.out.println("Enter the upper limit");
	  num2 = sc.nextInt();
	
	  for(int i=num1; i<=num2;i++)
	      {
		int sum=0, rem, temp,len;
		len=getOrder(i);
		temp=i;
		while(temp!=0)
		{
		  rem=temp%10;
		  sum=sum +(int) Math.pow(rem,len);
		  temp/=10;
		}
		
	       if(sum==i)
	        {
                System.out.print(i+" ");
                }
	       }
	}

	private static int getOrder(int i)
	{
	 int len=0;
	 while(i!=0)
	  {
	   len++;
	   i=i/10;
	   }
	return len;
	}
}
