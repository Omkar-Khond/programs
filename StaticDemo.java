public class StaticDemo 
{   static{
    System.out.println("Inside Static Main ");

    public staticDemo()
    {
        System.out.println("Inside constructor Static Main ");
    }


}
    public static void main(String Arg[])
    {
        System.out.println("Inside Main ");
        Demo.gun();
        System.out.println("Value of static no3  "+Demo.iNo3);
        Demo.gun();

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();
        obj1.fun();

    }
}


class Demo
{
    public int iNo1;  //non ststic
    public int iNo2;
    public static int iNo3;  // static characterestics
    public static int iNo4;  

    static  // Static block
    {
        System.out.println("Inside Static block");
        iNo3 = 51;
        iNo4 = 101;

    }
    public  Demo()
    {
        System.out.println("Inside Constructor ");

        iNo1 = 11;
        iNo2 = 21;
    }
    public void fun()  // non Static method
    {
        System.out.println("Inside non static method fun ");
        System.out.println("the value of no1 = "+this.iNo1);
        System.out.println("the value of no2 = "+this.iNo2);
        System.out.println("the value of no3 = "+this.iNo3);
        System.out.println("the value of no4 = "+this.iNo4);
    }
    public static void gun() // Static Method
    {
        System.out.println("Inside Static Gun ");
       // System.out.println("the value of no1"+iNo1);
        //System.out.println("the value of no2"+iNo2);
        System.out.println("the value of no3 = "+iNo3);
        System.out.println("the value of no4 = "+iNo4);
    }
}