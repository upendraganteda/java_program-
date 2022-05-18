import java.util.Scanner;
class Months
  {
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("enter any month number");
      n=sc.nextInt();
      switch(n);
        {
          case 3:
            case 4:
            case 5:
            case 6:          
          System.out.println("its SUMMER");
          break;         
          case 7:
            case 8:
            case 9:
            case 10:
          System.out.println("its RAINY");
          break;
          case 11:
            case 12:
            case 1:
            case 2:
          System.out.println("its WINTER");
          break;
          default:
            System.out.println("WRONG CHOICE");
        }
    }

    
  }