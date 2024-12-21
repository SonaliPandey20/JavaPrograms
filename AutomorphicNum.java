import java.util.Scanner;
public class AutomorphicNum 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int square = n * n;
        int num = n;
        boolean count = false;
        while (num != 0) 
        {
            int rem = num % 10;
            int srem = square % 10;
            if (srem % rem == 0)
            {
                count=true;
            }
            num = num / 10;
            square = square / 10;
        }
        if (count == true)
        {
            System.out.println(n + " is an automorphic number");
        }
        else
        {
            System.out.println(n + " is not an automorphic number");
        }
    }  
}
