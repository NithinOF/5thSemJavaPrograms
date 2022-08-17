/*
Algorithm
---------
Step1:Start.
Step2:Declare variables i, a,b ,temp.
Step3:Initialize the variables, a=0, b=1, and temp=0.
Step4:Enter the number of terms of Fibonacci series to be printed.
Step5:Print First two terms of series.
Step6:Use loop for the following steps.
      temp=a+b.
      a=b.
      b=temp.
      increase value of i each time by 1.
      print the value of show.
Step7:Stop.
*/


//Program

import java.io.*;
import java.util.Scanner;

class Fibonacci{
  public static void main(String[] args) {

    int lim , firstTerm = 0, secondTerm = 1,nextTerm;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the limit");
    lim=sc.nextInt();
      
       for (int i = 0; i <= lim; i++)
     {
         if(lim>firstTerm)
       {
       System.out.print(firstTerm + ",");
        
       // compute the next term
       nextTerm = firstTerm + secondTerm;
       firstTerm = secondTerm;
       secondTerm = nextTerm;
       }   
	
    }

 }
}

