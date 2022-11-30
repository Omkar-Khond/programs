
class EqualsDemo
{
    public static void main(String[] args) 
    {
        //Demo obj1 = new Demo(11, 21);
        //Demo obj2 = new Demo(11, 21);

        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("Hashcode of S1 :"+s1.hashCode()); //1001
        System.out.println("Hashcode of S1 :"+s2.hashCode()); // 1001
        
        if(s1.equals(s2)) //if("Hello" == "Hello")
        {
            System.out.println("Objects are Same ");
 
        }
        else
        {
            System.out.println("Objects are different");

        }

        if(s1 == s2)    // if ( 1001 == 1001)
        {
            System.out.println("Objects are same");
 
        }
        else
        {
            System.out.println("Objects are different");

        }


    }
}