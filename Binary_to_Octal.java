import java.util.*;
public class binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int queries=sc.nextInt();
        for (int i=0;i<queries;i++)
        {
          String binary=sc.next();
          int decimal=Integer.parseInt(binary,2);
          String octal=Integer.toOctalString(decimal);
          System.out.println(octal);
        }
    }
}