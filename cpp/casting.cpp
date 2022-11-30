#include<iostream>
using namespace std;

class Base
{
    public : 
    int A,B;
};
class Derived : public Base
{
    public :
    int X,Y;

};


int main()
{
    Base * bp = NULL;

    Derived * dp = NULL;

    Base bobj;
    Derived dobj;

    bp = &bobj;  // No casting
    bp = &dobj;  // Upcasting
   // dp = &bobj;   Downcasting   -> NA
    dp = &dobj;  // No casting

    return 0;
}