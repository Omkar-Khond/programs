// Abstract class is a class ehich contains 0 or more abstract method in it
abstract class Arithmatic
{
    public int Addition(int iNo1, int iNo2)
    {
        return iNo1+iNo2;
    }
    public abstract int Substraction(int iNo1, int iNo2);
    // Virtual int Substraction(int iNo1, int iNo2) = 0;        CPP
}
class Marvellous extends Arithmatic
{
    @Override
    public int Substraction(int iNo1, int iNo2)
    {
        return iNo1 -iNo2;
    }
}
class AbstractDemo
{
    public static void main(String[] args) 
    {
        Marvellous a = new Marvellous();
        int Ret = 0;
        Ret = a.Addition(11, 10);
        System.out.println("Addition is:"+Ret);
        Ret = a.Substraction(11, 10);
        System.out.println("Substraction is:"+Ret);
    }
}