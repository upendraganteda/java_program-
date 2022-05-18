import java.lang.String;
import java.util.Scanner;
class perfect
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,sum=0,i=1;
      System.out.println("enter the number");
      n=sc.nextInt();
      for(i=1;i<n;i++)
      if(n%i==0)
      {
        sum=sum+i;
      }
      if(n==sum)
        System.out.println("number is perfect");
      else
        System.out.println("number is not perfect"); 
    }
  }