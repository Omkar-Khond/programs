import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BufferedInput1
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);

       // BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        String name = null;
        int Age = 0;
        float marks = 0.0f;
        
        System.out.println("Enter your Name : ");
        name = bobj.readLine();

        System.out.println("Enter your age ");
        Age = Integer.parseInt(bobj.readLine());

        System.out.println("Enter your Marks ");
        marks = Float.parseFloat(bobj.readLine());
        
        System.out.println("Name:"+name);
        System.out.println("Age: "+Age);
        System.out.println("Marks: "+marks);
    }
}