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
 
