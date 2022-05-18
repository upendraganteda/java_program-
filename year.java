import java.util.Scanner;
class year
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a;
      System.out.println("enter the year");
      a=sc.nextInt();
      if(a%4==0)
      {
        System.out.println("entered year is leap year");
      }
      else
      {
        System.out.println("entered year is not a leap year");
      }
    }
  }