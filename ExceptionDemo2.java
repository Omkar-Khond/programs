import java.util.*;
class ExceptionDemo2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {10,20,30,40};

        System.out.println("Enetr the sequence ");

        int i = sobj.nextInt();

        System.out.println("data at the specified index is  "+Arr[i]);
 
    }
}