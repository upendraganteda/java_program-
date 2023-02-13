import java.util.*;
public class Stringstart
{
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
    String str;
      char ch;
      System.out.println("enter the String ");
      str=sc.nextLine();
       System.out.println("enter the character ");
      ch=sc.next().charAt(0);
      if(ch>='a'&&ch<='z')
      {
        System.out.println(str.startsWith("ch"));
        System.out.println("the String not Starts with digit");
      }
      else 
      {
        System.out.println("Starts with digit");
      }
      
    }
}