class Demo<T>
{
    public T No1, No2;

    public Demo(T a, T b)
    {
        No1 = a;
        No2 = b;
    }

    public void Display()
    {
        System.out.println(No1);
        System.out.println(No2);
    }
}
public class GenericClass 
{
    public static void main(String[] args) 
    {
        Demo<Integer> iObj = new Demo<Integer>(11,21) ;
        iObj.Display();   
    }
}
