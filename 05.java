/*

Algorithm
---------
Step1:Start.
Step2:Declare x, y, z;
Step3:Scan values into x, y, z.
Step4:Call function checkTriangle.
Step5:Stop.

checkTriangle function
Step1:Start.
Step2:Check (x == y && y == z )
      print Equilateral Triangle.
Step3:if step 2 is wrong, then Check (x == y || y == z || z == x )
      print Isosceles Triangle.
Step4:if step 3 is wrong,
      print Scalene Triangle.
Step5:Stop.

*/

//Program

import java.io.*;
import java.util.Scanner;

class Triangle
{
    public static void main(String[] args)
     {
     
      int x, y, z;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter value of 1st side");
	x=sc.nextInt();
      System.out.println("Enter value of 2nd side");
	y=sc.nextInt();
      System.out.println("Enter value of 3rd side");
        z=sc.nextInt();
      checkTriangle(x, y, z);
     }



static void checkTriangle(int x, int y, int z)
{
    if (x == y && y == z )
        System.out.println("Equilateral Triangle");
    else if (x == y || y == z || z == x )
        System.out.println("Isosceles Triangle");
    else
        System.out.println("Scalene Triangle");
}
 

}
 
