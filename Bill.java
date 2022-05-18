import java.util.Scanner;
class Bill
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      float c,q,b;
      String p;
      System.out.println("Enter product number");
      n=sc.nextInt();
      System.out.println(" Enter product name");
      p=sc.next();
      System.out.println("Enter product cost");
      c=sc.nextInt();
      System.out.println("Enter product quantinty");
      q=sc.nextInt();
      b=c*q;
      System.out.println("Enter product bill");
      
      
    }
  }