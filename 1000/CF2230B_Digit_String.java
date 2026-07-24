
import java.util.Scanner;

public class CF2230B_Digit_String 
{
    public static int solve(String s)
    {
        int n=s.length();
        int []prefix=new int[n];
        int []suffix=new int[n];
        int c=0;
        int mx=0;
        for (int i=0;i<n;i++)
        {
            if (s.charAt(i)=='2')
            {
                c++;
            }
            prefix[i]=c;
        }
        c=0;
        for (int i=n-1;i>=0;i--)
        {
            if (s.charAt(i)=='1' || s.charAt(i)=='3')
            {
                c++;
            }
            suffix[i]=c;
        }
        for (int i=0;i<n;i++)
        {
            mx=Math.max(mx, prefix[i]+suffix[i]);
        }
        return n-mx;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            String s=sc.next();
            int ans=solve(s);
            System.out.println(ans);
        }
        sc.close();
    }    
}
