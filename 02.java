import java.io.*;
import java.util.Scanner;

public class MathFunctions
  {
   public static void main(String[] args)
   {
     float x1,x2,sum,diff,pro,quo,rem;
     x1=Integer.parseInt(args[0]);
     x2=Integer.parseInt(args[1]);
     
     sum=x2+x1;
     diff=x2-x1;
     pro=x2*x1;
     quo=x2/x1;
     rem=x2%x1;
     
     System.out.println("sum = "+sum);
     System.out.println("different = "+diff);
     System.out.println("product = "+pro);
     System.out.println("quotient = "+sum);
     System.out.println("reminder = "+sum);
   }
 }