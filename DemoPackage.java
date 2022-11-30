import java.util.*;  // In Built Package

import Marvellous.Arithmatic;

import Marvellous.PPA.loop;

class DemoPackage
{
        public static void main(String arr[])
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter first number");
            int iNo1 = sobj.nextInt();

            System.out.println("Enter Second number");
            int iNo2 = sobj.nextInt();

            Arithmatic aobj = new Arithmatic(iNo1, iNo2);

            int iResult = aobj.Addition();

            System.out.println("Addition is :"+iResult);

             iResult = aobj.Subtract();

            System.out.println("Subtraction is : "+iResult);


        }

}