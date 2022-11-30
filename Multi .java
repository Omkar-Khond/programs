class Base
{
    public int A,B;

    public Base()           // definition
    {
        System.out.println("inside Base");
        this.A = 10;
        this.B = 20;
    }
    public void fun()       // definition
    {
        System.out.println("inside Base fun");
    }
    public void gun()
    {
        System.out.println("inside Base gun");
    }
    public void fun(int iNo1) // overloaded definition
    {
        System.out.println("inside Base fun with one int :"+iNo1);
    }
}
class Derived extends Base  // class Derived : public Base
{
    public int X,Y;

    public Derived() //definition
    {
        System.out.println("inside derived constructor");
        this.X = 30;
        this.Y = 40;
    }
    public void sun() //definition
    {
        System.out.println("inside Derived sun");
    }
    public void gun() // overrided definition
    {
        System.out.println("inside Derived gun");
    }


}
class Multi
{
    public static void main(String arr[])
    {
       // Base bobj1 = new Base();            // No Castin
      // Derived dobj1 = new Derived();       // No Casting
        Base bobj2 = new Derived();         // Upcasting
       // Derived dobj2 = new Base();         // Downcasting

       bobj2.fun(11);
       bobj2.gun();
      // bobj2.sun();
       bobj2.fun();

    }
}