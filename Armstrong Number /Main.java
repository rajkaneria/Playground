import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int count=0;
      int m=n;
      while(n>0)
      {
        ++count;
        n=n/10;
      }
      int sum=0;
      int digit;
      int k=m;
      double x;
      int y;
      while(m!=0)
      {
        digit=m%10;
        m=m/10;
        x=Math.pow(digit,count);
        y=(int)x;
        sum=sum+y;
      }
      if(sum==k)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
    }
}