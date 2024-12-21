import java.util.Scanner;
public class PerfectNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<n)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        if(sum==n)
        {
            System.out.println(n+" is a perfect number");
        }
        else
        {
            System.out.println(n+" is not a perfect number");
        }
    }
}
