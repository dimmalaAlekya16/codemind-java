import java.util.Scanner;
public class disk
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        long k=(t*s*b*512)*2;
        System.out.println(k);
}
}