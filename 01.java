import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class distance
  {
   public static void main(String[] args) throws IOException  
   {
 	int x1,x2,y1,y2;
	float d;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Distance x1 x2 y1 y2");
	x1=Integer.parseInt(br.readLine());
	x2=Integer.parseInt(br.readLine());
	y1=Integer.parseInt(br.readLine());
	y2=Integer.parseInt(br.readLine());

	d=(float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	System.out.println("the Distance is = "+d);

       }
   }
	
