import java.lang.String;
import java.util.Scanner;
public class Area
  { 
    public static void main(String args[])
    {
      Scanner m=new Scanner(System.in);
      System.out.println("enter the radius of the circle");
      float radius;
      float area;
      radius=m.nextInt();
      area=2*3.14f*radius*radius;
      System.out.println("area of the circle="+area);
      
    }
  }  
