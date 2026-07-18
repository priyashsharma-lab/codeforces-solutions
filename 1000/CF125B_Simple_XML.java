import java.util.Scanner;

public class CF125B_Simple_XML 
{
    public static void printSpaces(int w)
    {
        for (int i=0;i<w*2;i++)
        {
            System.out.print(" ");
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String xml=sc.nextLine();
        int indent=-1;
        for (int i=0;i<xml.length();i++)
        {
            if (i+1<xml.length() && xml.charAt(i+1)=='/')
            {
                printSpaces(indent);
                do
                {
                    System.out.print(xml.charAt(i));
                    i++;
                }while (i < xml.length() && xml.charAt(i) != '<');
                if (i == xml.length())
                {
                    break;
                }
                i--;
                indent--;
                System.out.println();
                continue;
            }
            if (xml.charAt(i)=='<')
            {
                if (i + 1 < xml.length() && xml.charAt(i + 1) != '/')
                {
                    indent++;
                }
                printSpaces(indent);
            }
            System.out.print(xml.charAt(i));
            if (xml.charAt(i)=='>')
            {
                System.out.println();
            }
        }
        sc.close();
    }
}
