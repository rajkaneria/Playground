import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int row = in.nextInt();
      int star=0;
      for(int rcount=1;rcount<=row;rcount++)
      {
        for(int ccount=1;ccount<=rcount;ccount++)
        {
          star++;
          if(star%2!=0)
            System.out.print("*");
          else
            System.out.print("#");
        }
        System.out.print("\n");
      }
    }
}