import java.util.Arrays;
import java.util.Scanner;

public class CF2203B_Beautiful_Numbers 
{
    public static int solve(String s)
    {
        int n=s.length();
        int []sortedS=new int[n];
        int digitSum=0;
        int ans=0;
        int res=0;
        int temp=0;
        for (int i=0;i<n;i++)
        {
            sortedS[i]=(s.charAt(i)-'0');
            digitSum+=sortedS[i];
        }
        if (digitSum<=9)
        {
            return 0;
        }
        Arrays.sort(sortedS,1,n);
        temp+=sortedS[0];
        for (int i=1;i<n;i++)
        {
            temp+=sortedS[i];
            if (temp>=10)
            {
                break;
            }   
            ans++;
        }
        temp=1;
        for (int i=1;i<n;i++)
        {
            temp+=sortedS[i];
            if (temp>=10)
            {
                break;
            }
            res++;
        }
        return Math.min(n-res,n-1-ans);
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
