/*Problem 3
 The prime factors of 13195 are 5,7,13 and 29.
 What is the largest prime factor of the number 600851475143 ?
 Testing gist
 */

class euler3
{
	public static void main(String []args)
	{
	 double n = 600851475143.00; //initializing the value of n.
	 int i;
	 double m=n/2;
	  for (i=2;i<=m;++i)
	  {
	    while(n%i==0)
	   {
	       n = n/i;
	       if (n == 1)
	       {
	           System.out.println("Largest Prime Factors = "+i);
		   break;//break the while loop.
	       }
	   }
	   if(n==1)
	   break;//break the for loop.
      }
    }
}