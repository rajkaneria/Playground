import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int base =in.nextInt();
    int expo = in.nextInt();
    System.out.print(pow(base,expo));
  }
  public static int pow(int m,int n)
  {
    int p=1;
    for(int i=1;i<=n;i++)
    {
      p*=m;
    }
    return p;
  }
}