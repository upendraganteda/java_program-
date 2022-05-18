import java.util.Scanner;
class current
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int cn,pmr,lmr;
      String cunm;
      float cubill;
      System.out.println("enter the customer num");
      cn=sc.nextInt();
      System.out.println("enter the customer name");
      cunm=sc.next();
      System.out.println("enter the present month reading");
      pmr=sc.nextInt();
      System.out.println("enter the last month reading");
      lmr=sc.nextInt();
      tu=(pmr-lmr);
      cubill=(tu*4.5);
      System.out.println("enter the customer number is:+cn");
      System.out.println("enter the customer name is:+cunm");
      System.out.println("enter the present month reading is:+pmr");
      System.out.println("enter the last month reading is:+lmr");
      }
  }