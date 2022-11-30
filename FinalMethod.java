class Base
{
    public void fun()
    {
        System.out.println("inside Base fun");
    }
    public final void gun()
    {
        System.out.println("inside Base gun");
    }
}
class Derived extends Base
{
    public void fun()
    {
        System.out.println("inside Derived fun");
    }
    public final void gun()
    {
        System.out.println("inside Derived gun");
    }

}
public class FinalMethod 
{
    public static void main(String[] args) 
    {
        Base b = new Derived();
    }
}
