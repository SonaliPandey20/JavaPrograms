import java.util.Scanner;
public class SunnyNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        double num = Math.sqrt(n+1);

        if((int)num==num)
        {
            System.out.println(n +" is a sunny number");
        }
        else
        {
            System.out.println(n +" is not a sunny number");
        }
    }
}
