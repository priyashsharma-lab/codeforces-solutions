import java.util.Scanner;
public class CF96A_Football 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String players=sc.nextLine();

        int c=0;
        int key=players.charAt(0);

        if (players.length()<7)
        {
            System.out.println("NO");
            System.exit(0);
        }

        for (int i=0;i<players.length();i++)
        {
            if (players.charAt(i)==key)
            {
                c++;
            }
            else
            {
                key=players.charAt(i);
                c=1;
            }
            if (c==7)
            {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
        sc.close();
    }   
}
