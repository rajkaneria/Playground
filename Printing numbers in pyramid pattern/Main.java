import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int num=n-1;
      int count=1;
      for (int i=0; i<n; i++) 
      { 
        for (int j=n-i; j>1; j--) 
        { 
          System.out.print(" "); 
        } 
        for (int j=0; j<=i; j++ ) 
        {
          System.out.print(count);
          System.out.print(" ");
          count++;
        } 
        System.out.println(); 
      } 
    }    
}