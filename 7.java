/*10001st prime
Problem 7

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
*/

class euler7
{
static boolean isPrime(int number)//F(n) to check Prime Number
{
	int i,flag=0;
	for (i=2;i<=number/2;i++)
	{
		if(number%i==0)
		{
			flag=1;
		}
	}
	if(flag==0)
	{
		return true;
	}
	else return false;
}
public static void main(String []args)
{
	int number=1;
	int count=1;
	while(count<=10001)
	{
		number++;
		if(isPrime(number)==true)
		count++;
	}
	System.out.println("The 10001 Prime number = "+number);
}
}
