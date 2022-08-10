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
