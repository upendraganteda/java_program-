import java.util.Scanner;
import java.lang.String;
class Student
  {
    public static void main(String args[])
    {
      Scanner pc=new Scanner(System.in);
      int b,c,total,avg;
      String a;
      System.out.println("enter student name");
      a=pc.next();
      System.out.println("enter  subject1 marks");
      b=pc.nextInt();
      System.out.println("enter subject2 marks");
      c=pc.nextInt();
      total=b+c;
      avg=total/2;
      System.out.println("the name of the student is:"+a);
      
      System.out.println("enter avg");
      
    }
  }