import java.lang.String;
import java.util.Scanner;
class Number
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a;
      System.out.println("enter  any number");
      a=sc.nextInt();
      if(a>0)
        System.out.println("the number is positive");
      else
        System.out.println("the number is negative");
    }
  }