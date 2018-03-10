/*Problem 20 
 * 

n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

 */
import java.math.*;  //wrapper file which contain various mathematical functions.
class euler20
{
    public static void main(String []args)
    {
        BigInteger sum,fact,m,store,reverse,no_to_divide;
        int i,length;
        sum=new BigInteger("0");
        fact=new BigInteger("1");
        for (i=1;i<101;i++)
        {
            m=BigInteger.valueOf(i);  // Converting i to BigInteger and Assiging into m.
            fact = fact.multiply(m);
        }
        store=fact;
        length=String.valueOf(fact).length();  //Length of factorial No.
        while(length!=0)
        {
            no_to_divide=new BigInteger("10"); //initialzing the value to 10.
            reverse=fact.remainder(no_to_divide);
            sum=sum.add(reverse);
            fact=fact.divide(no_to_divide);
            length--;
        }
        System.out.println("The sum of 100! = "+sum);
    }
}