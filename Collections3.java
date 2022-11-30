import java .util.*;

class Book
{
    public String Name;
    public int Prize;

    public Book(String s, int i)
    {
        this.Name = s;
        this.Prize =i;
    }

    public void Display()
    {
        System.out.println("Book Name :"+this.Name+ "Prize : "+this.Prize);
    }
}
class Collections3
{
    public static void main(String arg[])
    {
        LinkedList <Book>lobj = new LinkedList<Book>();

        lobj.add(new Book("Let us c", 400));
        lobj.add(new Book("Data Structures", 500));
        lobj.add(new Book("C++", 980));
        lobj.add(new Book("Angular", 670));

        Iterator iobj = lobj.iterator();
        Book bRef = null;

        while(iobj.hasNext())
        {
            bRef = (Book)iobj.next();
            bRef.Display();
        }

        //lobj.clear;

    }
}