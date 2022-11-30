class Maths
{
    public int iNo1;  // Characterestics
    public int iNo2;  // characterestics

    public Maths()  // Default constructor
    {
        System.out.println("Inside Default constructor");
    }
    public Maths(int a, int b)  // Parameterised Constructor
    {
        System.out.println("Inside Parameterise Constructor");
        iNo1 = a;
        iNo2 = b;
    }
    public int Addition()  // Behavior
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
    public int Substraction()  // Behavior
    {
        int iAns = 0;
        iAns = iNo1 - iNo2;
        return iAns;
    }
}// End of Maths class

class Addition
{
    public static void main(String args[])
    {
        System.out.println("Inside Main Function");

        Maths mobj1 = new Maths();
        Maths mobj2 = new Maths(10,11);

        int iRet = 0;
        iRet = mobj1.Addition();
        System.out.println("Addition is :"+iRet);

         iRet = mobj2.Addition();
        System.out.println("Addition is :"+iRet);
    }
}