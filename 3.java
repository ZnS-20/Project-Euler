/*Problem 3
 The prime factors of 13195 are 5,7,13 and 29.
 What is the largest prime factor of the number 600851475143 ?
 */

class euler3
{
	public static void main(String []args)
	{
	 double n = 600851475143.00; //initializing the value of n.
	 int i;
	  for (i=2;i<=n;i++)
	  {
	    if(n%i==0 && i%2!=0 && i%3!=0) //Condition to calculate prime factor.
	   {
	       n = n/i;
	      if (n == 1)
		   break;  //break the loop.
	   }
      }
        System.out.println("Largest Prime Factors = "+i);
    }
}