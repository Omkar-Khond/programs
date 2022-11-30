class Jagged
{
    public static void main(String arg[])
    {
        int Arr[][] = {{10,20,},{50,60,70,80},{90,100,110}};  // JAVA

        System.out.println(Arr.length);
        System.out.println(Arr[0].length);
        System.out.println(Arr[1].length);
        System.out.println(Arr[2].length);
   
        System.out.println(Arr[0][1]);
        System.out.println(Arr[1][1]);
        System.out.println(Arr[2][2]);
        System.out.println(Arr[1][1]);
        System.out.println(Arr[1][2]);
        System.out.println(Arr[2][1]);
        System.out.println(Arr[0][1]);
        System.out.println(Arr[0][1]);
        System.out.println(Arr[0][2]);
    }
}