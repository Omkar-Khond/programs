
class Demo extends Thread
{
    public void run()
    {
        int i = 0;

        for(i = 1; i <= 10; i++)
        {
            try
                {
                    System.out.println(Thread.currentThread().getName()+" :"+i);
                    Thread.sleep(500);
                }
                catch(InterruptedException obj)
                {}
        }

    }
}

public class ThreadDemo6
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println("Inside main method");

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("1st :");
        t2.setName("2nd :");

        System.out.println("priority of 1st thread"+t1.getPriority());///////////
        System.out.println("priority of 2nd thread"+t2.getPriority());///////////

        t1.setPriority(10);
        t2.setPriority(2);

        t1.start();
        t2.start();
        // t2.join();
        t1.join();

        System.out.println("priority of 1st thread"+t1.getPriority());///////////
        System.out.println("priority of 2nd thread"+t2.getPriority());///////////

       

        System.out.println("End of main method");///////////

    }
}
