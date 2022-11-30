 class Demo
 {
    public int iNo1 = 0;
    public final int iNo2 = 11;
    public final int iNo3;

    public Demo()
     {
        iNo1 = 0;
        iNo3 = 21;
     }
 }
 
class FinalChar
{
    public static void main(String arg[])
    {
        final int i = 51;
        Demo a = new Demo();
        a.iNo1++;
        //a.iNo2++;
        //a.iNo3++;
    }
}
