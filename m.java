import java.util.Scanner;
class Amount
  {
    public static void main(String args[])
    {
      Scanner si=new Scanner(System.in);
    int p,t,r,s;
    System.out.println("Enter the principle:");
    p=si.nextInt();
      System.out.println("Enter time in years:");
      t=si.nextInt();
      System.out.println("Enter  rate of intrest");
      r=si.nextInt();
      s=p*t*r/100;
      System.out.println("simple intrest is ="+s);
    }
  }  