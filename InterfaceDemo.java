interface Circle
{
    float PI = 3.14f;                   // public static void float PI = 3.14
    float Area(float Radius);           // public abstract float area(float radius)
    float Circumference(float Radius);  // public abstract float Circumference(float radius)
}
class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return PI*Radius*Radius;
    }
    public float Circumference(float Radius)
    {
        return 2*Radius*PI;
    }
}
class InterfaceDemo
{
    public static void main(String[] args) 
    {
      System.out.println("Value of PI is :"+Circle.PI);

      Circle cobj = new Marvellous();

      float Ret = 0.0f;
      Ret = cobj.Area(10.5f);
      System.out.println("Area is :"+Ret);
      Ret = cobj.Circumference(10.5f);
      System.out.println("Circumference is :"+Ret);
    }
}