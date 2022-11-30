

public class GenericMethod 
{
    public static <T> void Display(T Arr[])
    {
        for( int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        Integer iArr[] = {10,20,30,40};
        Display(iArr);

        System.out.println("Characters are");

        Character cArr[] = {'a','b','c','d','e'};
        Display(cArr);
       
        System.out.println("floats are");
        
        Float fArr[] = {1.1f, 2.1f,3.1f};
        Display(fArr);
    }    
}
