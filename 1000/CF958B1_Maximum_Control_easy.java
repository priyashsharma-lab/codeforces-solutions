import java.util.Scanner;

public class CF958B1_Maximum_Control_easy
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] planets=new int[n+1];
        int remotePlanets=0;
        for (int i=0;i<(n-1)*2;i++)
        {
            int planet=sc.nextInt();
            planets[planet]++;
        }
        for (int i:planets)
        {
            if (i==1)
            {
                remotePlanets++;
            }
        }
        System.out.println(remotePlanets);
        sc.close();
    }
}