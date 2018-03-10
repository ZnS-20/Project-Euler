/*Problem 16
 * 

215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?

 */

import java.math.*;
class euler16
{
    public static void main(String []args)
    {
        int exponent=1000,i;
        BigInteger number,total,num,sum;
        number=new BigInteger("2");
        sum=new BigInteger("0");
        total=number.pow(exponent);
        num=total;                   //storing total in num as total will be changed to string.
        int len=String.valueOf(total).length();  //total change to string and find the length of that number.
        for(i=1;i<=len;i++)          //for loop upto length of Number i.e, length of 2^1000.
        {
            BigInteger n=new BigInteger("10");//Initalising n to 10 as we use this to divide the num.
            sum=sum.add(num.remainder(n));
            num=num.divide(n);
        }
        System.out.println("The sum of Digit = "+sum);
    }
}
