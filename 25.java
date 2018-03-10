/*Problem 25
 * The Fibonacci sequence is defined by the recurrence relation:

    Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.

Hence the first 12 terms will be:

    F1 = 1
    F2 = 1
    F3 = 2
    F4 = 3
    F5 = 5
    F6 = 8
    F7 = 13
    F8 = 21
    F9 = 34
    F10 = 55
    F11 = 89
    F12 = 144

The 12th term, F12, is the first term to contain three digits.
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?*/
 
import java.math.BigInteger;
class euler25
{
	public static void main(String []args)
	{
	  BigInteger sum=new BigInteger("0");  //initializing Big Integer
	  BigInteger num1=new BigInteger("1");
	  BigInteger num2=new BigInteger("1");
	  int i;
	   for (i=3;i<=10000;i++)           //starting with 3 as we initialized first 2.
	   {
	     sum=num1.add(num2);
	     num1=num2;
	     num2=sum;
	     int length=String.valueOf(sum).length();   //To find the length of Number using String based Solution.
	     if(length>=1000)
	         {
	             break;
	         }
	   }
	   System.out.println(i);  //Printing the index of fabonacci sequence which contain 1000 digit.
        }
}
