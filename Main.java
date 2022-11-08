import java.util.*;

public class Main
{
    public int maxSaving(int sal[],int exp[])
    {
        int sav[]=new int[sal.length];
        int max=sav[0];
        for(int i=0;i<sal.length;i++)
        {
            sav[i]=sal[i]-exp[i];
            if(sav[i]>max)
            {
                max=sav[i];
            }
        }
        return max;
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the size :");
        n=sc.nextInt();
        int arr[]=new int[n];
        int a[]=new int[n];
        int sav[]=new int[n];
        System.out.println("enter the salries :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the expenses :");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Main obj=new Main();
        int result=obj.maxSaving(arr,a);
        System.out.println("the maximum savings is "+result);
    }
}
