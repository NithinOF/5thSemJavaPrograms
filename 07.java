/*
Algorithm
---------
Step1:Start.
Step2:Declare p, r, digit,count=0,i.
Step3:Create an array.
Step4:Display Enter the decimal, base values and scan it to array. 
Step5:Set p=num and repeat step7 to step11 while p!=0.
Step6:r=p%base,digit='0'+r;
Step7:(digit>9),then digit+=7.
Step8:array[count]=digit.
Step9:Count++,p=p/base.
Step10:print the array.
Step11:Stop.

*/

//Program

import java.io.*;
import java.util.Scanner;

public class BaseConversion {

  public static void main(String[] args) {
    int p, r, digit, count = 0, i;
    char array[] = new char[20];
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the decimal number: ");
    int num = sc.nextInt();

    System.out.println("Enter the base to be converted: ");
    int base = sc.nextInt();

    p = num;
    do {
      r = p % base;
      digit = '0' + r;
      if (digit > '9')
         {
        digit += 7;
         }
      array[count] = (char) digit;
      count++;
      p = p / base;
    } while (p != 0);
    System.out.println("\nBase " +  base  + "Equivalent of num " + num + " is: ");
    for (i = count - 1; i >= 0; --i) 
        {
      System.out.print(array[i]);
        }
    System.out.println("\n");
  }
}
