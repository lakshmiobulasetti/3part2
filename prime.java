import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int temp=0;
	boolean isPrime=true;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	s.close();
	for(int i=2;i<=num/2;i++)
	temp=num%i;
	if(temp==0)
	{
		isPrime=false;
		
	}
	if(isPrime)
	System.out.println(num+"is a prime");
	else
	System.out.println(num+"is not a prime");
	}
}
		
	
	
	
