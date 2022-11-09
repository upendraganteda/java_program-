class Deletemethod
  {
    public void delete(int a[],int value)
    {
      int n=a.length;
      for(int i=0;i<a.length;i++)
        {
          if(a[i]==value)
          {
            continue;
            
          }
          System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[])
    {
      int arr[]={34,87,90,100,54,88,55,23};
      Deletemethod obj=new Deletemethod();
      obj.delete(arr,87);
    }
  }