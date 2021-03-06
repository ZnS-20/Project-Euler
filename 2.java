/*Problem 2 
 * 

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

 */


class euler2
{
  public static void main(String []args)
  {
     long n1=1,n2=1,swap=0,sum=0;
      while(swap<=4000000)
      {
            swap=n1;
            n1=n2;
            n2=swap+n1;
            if (swap%2==0)
            {
              sum+=swap;
            }
     }
      System.out.println(sum);
  }
}