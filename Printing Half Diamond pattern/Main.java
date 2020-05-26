import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=n-1;
      for(int row=1;row<=n;row++)
      {
        for(int space=1;space<=num;space++)
        {
          System.out.print(" ");
        }
        for(int col=1;col<=(2*row-1);col++)
        {
          System.out.print("*");
        }
        System.out.println("");
        --num;
      }

	}
}