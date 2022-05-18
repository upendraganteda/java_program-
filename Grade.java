import java.util.Scanner;
calss Grdae
  {
    public static void main(String args[])
      {
        Scanner sc=new Scanner(System.in);
        int sno,s1,s2,s3,total;
        String sname;
        float avg;
        System.out.println("enter the student roll number:");
        sno=sc.nextInt();
        System.out.println("enter the student name:");
        sname=sc.next();
        System.out.println("enter the sub 1 marks:");
        s1=sc.nextInt();
        System.out.println("enter the sub 2 marks:");
        s2=sc.nextInt();
        System.out.println("enter the sub 3 marks:");
        s3=sc.nextInt();
        total=s1+s2+s3;
        avg=total/3;
        System.out.println(" student name is:"+name);
        
        System.out.println(" student total marks are:"=total);
        System.out.println(" student average marks are: "+avg );
        if(avg>=35)
        {
          if(avg<=50)
            System.out.println("student passed & grade is c");
          else if(avg>=51&&avg<=70)
            System.out.println("student passed & garde is b");
          else if(avg>=71&&avg<=80)
            System.out.println("student passed & grade is a");
          else
          {
            System.out.println("student passed in distension");
            
          }
          else
        {
          system.out.println("student is failed");
        }
          
        }
      }
  }