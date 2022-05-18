import java.util.Scanner;
class current
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int cn,pmr,lmr;
      String cunm;
      float cbill;
      System.out.println("enter the customer num");
      cn=sc.nextInt();
      System.out.println("enter the customer name");
      cunm=sc.next();
      System.out.println("enter the present month reading");
      pmr=sc.nextInt();
      System.out.println("enter the last month reading");
      lmr=sc.nextInt();
      tu=(pmr-lmr);
      if (tu<=50)
      cbill=(tu*1.45f);
      else if (tu<=100)
        cbill=(50*1.45f)+(tu-50)*2.30f;
      else if (tu<=200)
        cbill=(50*1.45f)+(50*2.30)+(tu-100*3.56);
      else if (tu<=300)
        cbill=(50*1.45f)+(50*2.30f)+(100*3.56f)+(tu-200*4.87);
      else if (tu<=400)
        cbill=(50*1.45f)+(50*2.30f)+(100*3.56f)+(100*4.87f)+(tu-100*5.70f);
      else (tu>=400);
        cbill=(tu*6.56f);
      System.out.println("enter the customer number is:+cn");
      System.out.println("enter the customer name is:+cunm");
      System.out.println("enter the present month reading is:+pmr");
      System.out.println("enter the last month reading is:+lmr");
      }
  }