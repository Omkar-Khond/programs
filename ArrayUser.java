import java.util.Scanner;
class ArrayUser 
{
    public static void main( String Arg[])
    {
        int iCnt = 0;
        int iSum = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int iSize = 0;
        iSize = sobj.nextInt();
     // int Arr[] = (int *)malloc(iSize * sizeof(int));   
        int Arr[] = new int[iSize];

        System.out.println("Number of elements in array are :"+Arr.length);

        System.out.println("Enter the elements in array  :");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        System.out.println("Elements of the array  :");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
            System.out.println("sum is :"+iSum);
        }


    }
}    

