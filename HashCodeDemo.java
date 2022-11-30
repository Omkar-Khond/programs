
class Demo
{
    public int No1;
    public int No2;

    public Demo(int A, int B)
    {
        No1 = A;
        No2 = B;
    }

}
class HashCodeDemo
{
    public static void main(String[] args) 
    {
        Demo obj = new Demo(11, 21);

        System.out.println("Hashcode of obj is :"+obj.hashCode());
    }
}