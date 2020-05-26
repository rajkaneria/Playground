import java.util.Scanner;
class Main
{
  public static int sqr(int a){
    return (a*a);
  }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int square=sqr(n);
      System.out.print(square);
	} 
}