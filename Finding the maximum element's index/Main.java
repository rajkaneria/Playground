import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int size= in.nextInt();
    int a[]=new int[size];
    int index=0;
    int g=a[0];
    for(int i=0;i<size;i++)
    {
      a[i]=in.nextInt();
    }
    for(int i=0;i<size;i++)
    {
      if(a[i]>g)
      {
        g=a[i];
        index=i;
      }
    }
    System.out.print(index);
  }
}