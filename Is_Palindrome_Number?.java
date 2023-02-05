import java.util.*;
class s
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int a;int c=0;
            int d,temp;
            a=sc.nextInt();
            temp=a;
            while(a!=0)
            {
                d=a%10;
                a=a/10;
                c=(c*10)+d;
            }
            if(temp==c)
            {
                System.out.println("2");
            }
            else
            {
                System.out.println("1");
            }
        }
    }
}