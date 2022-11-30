import java .util.*;


class Collections7
{
    public static void main(String arg[])
    {
        Stack <Character>sobj = new Stack<Character>();

        sobj.push('a');
        sobj.push('b');
        sobj.push('c');
        sobj.push('d');
        sobj.push('e');
        sobj.push('f');

        System.out.println("Elements of stack are : "+sobj);
        System.out.println("Popped element is : "+sobj.pop());
    }  
}