import java.util.Scanner;
  class control
  {
    public static void main(String args[])
    {
      Scanner u= new Scanner(System.in);
      int a;
      System.out.println("enter the number");
      a=u.nextInt();
      if(a<=0)
      {
        System.out.println("enter the number is negitive");
      }
      else
      {
        System.out.println("enter the number is positivetive");
      }
    }
  }