import java.util.Scanner;
public class Main{
  public static int gdc(int n1,int n2)
  {
    int hcf=0,min=0;
    if(n1>n2)
      min=n2;
    else
      min=n1;
    while(min>0)
    {
      if((n1%min==0)&&(n2%min==0))
      {  
        hcf=min;
        break;
      }
      min--;
    }
    return hcf;
  }
  
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int next=gdc(n1,n2);
      int ans=gdc(n3,next);
      System.out.print(ans);
	}
}