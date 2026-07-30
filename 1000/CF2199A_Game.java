import java.util.Scanner;

public class CF2199A_Game 
{
    public static boolean  solve(Scanner sc)
    {
        int k=sc.nextInt();
        int aliceTotal=0;
        int bobTotal=0;
        int aliceRounds=0;
        int bobRounds=0;
        for (int i=0;i<2;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            aliceTotal+=x;
            bobTotal+=y;
            if (x>y)
            {
                aliceRounds++;
            }
            else
            {
                bobRounds++;
            }
        }
        int aliceThirdRound=aliceTotal+0;
        int bobThirdRound=bobTotal+k;
        if (aliceThirdRound<bobThirdRound)
        {
            return true;
        }
        else if (aliceThirdRound==bobThirdRound)
        {
            if (aliceRounds>bobRounds)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            boolean ans=solve(sc);
            if (ans==true)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
    }      
}
