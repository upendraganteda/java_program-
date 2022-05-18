import java.util.Scanner;
class Switch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("eneter the value");
      n=sc.nextInt();
      Switch(n%2);
        {
          case 0:
          System.out.println("it is even num");
          break;
          case 1:
          System.out.println("it is odd num");
        }
    }
  }