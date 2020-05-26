import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int f;
      int l=n%10;
      while (n>=10)
      {
        n=n/10;
      }
      f=n;
      int sum=f+l;
      System.out.println(sum);
    }
}