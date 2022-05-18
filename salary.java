import java.util.Scanner;
class salary
  {
    public static void main(String args[])
    {
      int enumb,esal;
      String ename;
      double DA,HRA,TA,PF,IT,netsalary,grosssalary;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the employee number");
      snumb=sc.nextInt();
      System.out.println("enter the employee name");
      sname=sc.next();
      System.out.println("enter thr employee salary");
      esal=sc.nextInt();
       DA=20/100*esal;
      HRA=10/100*esal;
      TA=12/100*esal;
      PF=8/100*esal;
      IT=5/100*esal;
      grosssalary=esal+DA+HRA+TA;
      netsalary=gross salary-(PF+IT);
      System.out.println(" netsalary is:"+net salary);
      System.out.println(" grosssalary is:"+gross salary);
      
    }
  }