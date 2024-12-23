import java.util.Scanner;
public class PronicNum 
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean flag=false;
        for(int i=0;i<=n;i++)
        {
            if((i*(i+1))==n)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println(n+" is a pronic number");
        }
        else
        {
            System.out.println(n+" is not a pronic number");
        }
    }
}
