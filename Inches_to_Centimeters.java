import java.util.*;
public class in
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int inches=sc.nextInt();
        double c=inches*2.54;
        System.out.printf("%.2f",c);
    }
}