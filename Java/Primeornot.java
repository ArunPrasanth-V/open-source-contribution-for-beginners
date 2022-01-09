package prime;
import java.util.Scanner;
public class Primeornot 
{
    public static void main(String args[]) 
    {
        Scanner sc =new Scanner(System.in);
	boolean prime=isPrime(sc.nextInt());
	System.out.print(prime?"Prime Number":"not a Prime Number");    
    }
		
    static boolean isPrime(int number)
    {	    	
      if(number<=1)
  	 return false;
      int c=2;
      while(c*c<=number)
      {
	 if(number%c==0)
	     return false;
         c++;
      }
      return true;
      }
}
