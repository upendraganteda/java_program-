
import java.util.Scanner;
class fac
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,f=1;
      System.out.println("enter n the value");
      n=sc.nextInt();
      while(n>0)
        {
         f=f*n;
          i=i--;
        }
      System.out.print ("\t the factorial of the number is:"+f);
    }
  }