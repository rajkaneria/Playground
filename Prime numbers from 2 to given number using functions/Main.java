import java.util.Scanner;
class Main{
  
      public static boolean isprime(int n)
      {
        int count=0;
        for(int i=1;i<=n;i++)
        {
          if(n%i==0)
            count++;
          else
            continue;
        }
        if(count==2)
          return true;
        else
          return false;
      }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=2;i<=n;i++)
      {
        if(isprime(i)){
          System.out.println(i);
        }
      }
    }
}
