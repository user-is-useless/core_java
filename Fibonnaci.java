import java.util.Scanner;
public class Fibonnaci
{
    public static void main(String args [])
    { 
        long n,n0=0,n1=1,i,n2;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        System.out.print("The Fibonnaci series is: " +n0);
        System.out.print(" " +n1);
        for (i=1;i<=n-2;++i)
        {
           n2=n0 + n1;
           n0=n1;
           n1=n2;
           System.out.print(" " +n2);
        }
        
    }
}