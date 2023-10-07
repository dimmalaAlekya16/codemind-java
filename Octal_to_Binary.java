import java.util.Scanner;
public class bin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++)
        {
          String octal=sc.next();
          int decimal=Integer.parseInt(octal,8);
          String binary=Integer.toBinaryString(decimal);
          System.out.println(binary);
}
}
}