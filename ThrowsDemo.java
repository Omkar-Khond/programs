import java.util.Scanner;

 class Arithmatic 
 {
    public int Division(int A, int B) throws ArithmeticException
    {
        int Ans = 0;
        Ans = A/B;
        return Ans;
    }
 }
 
 class ThrowsDemo
 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter second number");
        int iNo2 = sobj.nextInt();

            Arithmatic aobj = new Arithmatic();

        try
        {
            int iRet = aobj.Division(iNo1,iNo2);
            System.out.println("Division is :"+iRet);

        }

        catch(ArithmeticException obj)
        {
            System.out.println("Exception Occured");

            System.out.println(obj);
        }
    }
 }