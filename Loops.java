class Loops
{
    public static void main(String arg[])
    {
        int Arr[] ={10,20,30,40};
        int iCnt =0;

        System.out.println("Traversal of array using FOR LOOP");  //1

        for(iCnt =0; iCnt < Arr.length; iCnt++)  // Same in C,C++, JAVA
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Traversal of array using WHILE LOOP");  //2
        iCnt =0;
        while(iCnt < Arr.length)  // Same in C,C++, JAVA
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }
        System.out.println("Traversal of array using DO WHILE LOOP");  //3
       
        iCnt = 0;
        
        do  // Same in C,C++, JAVA
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        } while(iCnt < Arr.length);

        System.out.println("Traversal of array using FOR EACH LOOP");  //4

        for(int iNo1 : Arr)
        {
            System.out.println(iNo1);
        }



    }
}