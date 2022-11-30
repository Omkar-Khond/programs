#include<iostream>
using namespace std;

class Base
{
   public :      // Access specifier
          int A , B;

          void fun()  // function definition   1000
          {
            cout << "Base Fun\n";
          }

          void gun(int i)  // function definition   2000
          {
             cout << "Base Gun with 1 int\n"<<i<<"\n";
          }

          void gun(int i, int j)    // overloaded function definition    3000
          {
             cout << "Base gun with 2 int \n"<<i<<"\n"<<j<<"\n";
          }

};

class Derived : public  Base
{
  public :
         int X,Y;

         void sun()    // Function definition       4000
         {
             cout << "Derived Sun\n";
         }

         void fun()    // Function redefinition     5000
         {
             cout << "Derived Fun\n";
         }

};
int main()
{
    cout<<"Inside main\n";
   Derived dobj;

   dobj.fun();       //CALL 5000
   dobj.gun(11);     // CALL 2000
   dobj.gun(11,21);  // CALL 3000
   dobj.sun();       // CALL 4000

   

    return 0;
}