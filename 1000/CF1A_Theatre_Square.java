import java.util.Scanner;

public class CF1A_Theatre_Square 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();    
        long m=sc.nextLong();    
        long a=sc.nextLong();    
        long horizontal=(long)Math.ceil((double)n/a);
        long vertical=(long)Math.ceil((double)m/a);
        long ans=horizontal*vertical;
        System.out.println(ans);
        sc.close();
    }    
}
