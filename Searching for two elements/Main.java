import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i] = in.nextInt();
      }
      int ele1=in.nextInt();
      int ele2=in.nextInt();
      int c1=0,c2=0;
      for(int i=0;i<size;i++)
      {
        if(ele1==arr[i])
          c1=i;
        else if(ele2==arr[i])
          c2=i;
      }
      if(c1!=0)
        System.out.println(c1);
      else
        System.out.println("-1");
      if(c2!=0)
        System.out.println(c2);
      else
        System.out.println("-1");
    }
}