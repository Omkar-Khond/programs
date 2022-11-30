import java .util.*;


class Collections2
{
    public static void main(String arg[])
    {
        LinkedList <String>lobj = new LinkedList<String>();

        lobj.add("Omkar");
        lobj.add("Kapil");
        lobj.add("Prasanna");
        lobj.add("Pawan");
        lobj.add("Tejas");

        System.out.println("Elements of linked list are :"+lobj);

        lobj.addFirst("Umesh");
        System.out.println("Elements of linked list are :"+lobj);

        lobj.addLast("Avdhut");
        System.out.println("Elements of linked list are :"+lobj);

        Iterator iobj = lobj.iterator();
        System.out.println("Data using iterator is :");
        while(iobj.hasNext())
        {
            System.out.println((iobj.next()));
        }
        
        if(lobj.contains("Omkar"))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Absent");
        }

        lobj.remove();
        System.out.println("Elements of linked list are :"+lobj);

        lobj.remove(0);
        System.out.println("Elements of linked list are :"+lobj);

        lobj.set(0,"Amar");
        System.out.println("Elements of linked list are :"+lobj);

        lobj.removeLast();
        System.out.println("Elements of linked list are :"+lobj);

        System.out.println("Number of elements are :"+lobj.size());

        lobj.set(1,"XYZ");
        System.out.println("Elements of linked list are :"+lobj);

        if(lobj.contains("Omkar"))
        {
            System.out.println("Present");
        }
        else
        {
            System.out.println("Absent");
        }

        lobj.clear();
        System.out.println("Elements of linked list are :"+lobj);



    }
}