import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedInput
{
    public static void main(String[] args) 
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

        String name = null;
        int Age = 0;
        float marks = 0.0f;
        try
        {
            System.out.println("Enter your Name : ");
             name = bobj.readLine();

            System.out.println("Enter your age ");
             Age = Integer.parseInt(bobj.readLine());

            System.out.println("Enter your Marks ");
             marks = Float.parseFloat(bobj.readLine());
        }
        catch(IOException obj)
        {}
        System.out.println("Name:"+name);
        System.out.println("Age: "+Age);
        System.out.println("Marks: "+marks);
    }
}