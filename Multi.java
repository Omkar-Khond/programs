class Multi
{
    public static void main(String arg[])
    {
        // Arr is 2 dimensional array which contains 3 one dimensional array
        //each one dimensional array contains 4 elements each element of type integer
      //  int Arr [3][4] = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};  -> c,CPP

     int Arr[][] = {{10,20,30,40},{50,60,70,80},{90,100,110,120}};  // JAVA

     System.out.println(Arr.length);  //3
     System.out.println(Arr[0].length);  //4
     System.out.println(Arr[0][3].length);  //4

    }
}