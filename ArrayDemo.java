class ArrayDemo
{
    public static void main ( String Hi[])
    {
        // Ways of creating array
        // Single dimensional array Creation

        int Arr1 [] = {10,20,30,40};
       // int Arr2[4] = {10,20,30,40}; -> Explicit size is Not Allowed in JAVA

       int Arr3[] = new int[4];   // Dynamic Memory allocation
       Arr3[0] = 10;
       Arr3[1] = 20;
       Arr3[2] = 30;
       Arr3[3] = 40;

       int Arr4[] = new int[]{10,20,30,40};  // Dynamic memory with initialization list
       
    }
}