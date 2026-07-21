import java.util.Scanner;

public class CF292A_SMSC 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int time=0;
        int SMSC=0;
        int maxMsg=0;
        for (int i=0;i<n;i++)
        {
            int ti=sc.nextInt();
            int ci=sc.nextInt();
            if (ti!=time+1)
            {
                while (true)
                {
                    if (SMSC==0)
                    {
                        time=ti;
                        break;
                    }
                    if (ti==time)
                    {
                        break;
                    }
                    SMSC--;
                    time++;
                }
            }
            else
            {
                time++;
                if (SMSC!=0)
                {
                    SMSC--;
                }
            }
            SMSC+=ci;
            if (SMSC>maxMsg)
            {
                maxMsg=SMSC;
            }
            if (i==n-1)
            {
                time+=SMSC;
            }
        }    
        System.out.print(time+" "+maxMsg);
        sc.close();
    }    
}
