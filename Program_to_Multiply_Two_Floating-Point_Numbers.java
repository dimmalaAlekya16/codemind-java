import java.util.Scanner;
public class fio
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        float m=sc.nextFloat();
        float a=n*m;
        System.out.printf("%.2f",a);
    }
}