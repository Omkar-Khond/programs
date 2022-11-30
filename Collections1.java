import java .util.*;


class Collections1
{
    public static void main(String arg[])
    {
        LinkedList <Integer>lobj = new LinkedList<Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println("Elements of linked list are :"+lobj);

        lobj.addFirst(1);
        System.out.println("Elements of linked list are :"+lobj);

        lobj.addLast(111);
        System.out.println("Elements of linked list are :"+lobj);

        Iterator iobj = lobj.iterator();
        System.out.println("Data using iterator is :");
        while(iobj.hasNext())
        {
            System.out.println((iobj.next()));
        }
        
        if(lobj.contains(212))
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

        lobj.set(0,0);
        System.out.println("Elements of linked list are :"+lobj);

        lobj.removeLast();
        System.out.println("Elements of linked list are :"+lobj);

        System.out.println("Number of elements are :"+lobj.size());

        lobj.set(1,500);
        System.out.println("Elements of linked list are :"+lobj);



        lobj.clear();
        System.out.println("Elements of linked list are :"+lobj);



    }
}