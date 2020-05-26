import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
        arr[i]=in.nextInt();
      int count =0;
      int temp=0;
      for(int i=0;i<size;i++)
      {
        if(arr[i]!=0)
        {
          temp=arr[i];
          arr[i]=arr[count];
          arr[count]=temp;
          count++;
        }
      }
      for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
}