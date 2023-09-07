import java.util.Scanner;
public class triangle
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a==b&&b==c)
        {
            System.out.println("Equilateral triangle");
        }
        else if(a==b||a==c||b==c)
        {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }
    }
}