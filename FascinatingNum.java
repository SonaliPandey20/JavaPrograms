import java.util.Scanner;
public class FascinatingNum 
{
    public static boolean fascinating(int num) 
    {
        String s = "" + num + (num * 2) + (num * 3);
        if (s.length() != 9) 
        {
            return false;
        }
        for (char d = '1'; d <= '9'; d++) {
            if (s.indexOf(d) == -1) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();

        if (fascinating(num)) {
            System.out.println(num + " is a Fascinating Number!");
        } else {
            System.out.println(num + " is not a Fascinating Number.");
        }
    }
}
