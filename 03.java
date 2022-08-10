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

