#include<iostream>
using namespace std;

class Demo
{
    //access specifier
    public:
         int i;             //instance variable
         int j;             //instance variable
         static int k;      // class variable

         Demo()   // default constructor
         {
            i = 0;
            j = 0;
         }
         Demo(int a, int b)   // parameterised constructor
         {
            i = a;
            j = b;
        }

        void fun()   // instance method
        {

        }
        static void gun()      // class method
        {


        }
};

int Demo::k =0;

int main()
{
    cout<<"Value of k : "<<Demo::k<<"\n";
    Demo obj1(10,11);
    Demo obj2(20,21);

    cout<<"value of i in obj1 :"<<obj1.i<<"\n";
    cout<<"value of i in obj2 : "<<obj2.i<<"\n";

   cout<<"value of j in obj1 : "<<obj1.j<<"\n";
   cout<<"value of j in obj2 : "<<obj2.j<<"\n";

    return 0;
}