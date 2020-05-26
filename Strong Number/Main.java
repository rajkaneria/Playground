import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int digit=0;
      int sum=0,fac=1;
      int m=n;
      while(n>0)
      {
        digit=n%10;
        fac=1;
        for(int i=1;i<=digit;i++)
          fac=fac*i;
        sum=sum+fac;
        n=n/10;
      }
      if(sum==m)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}