#include<iostream>
using namespace std;

class Base
{
    public : 
    int A,B;

    void fun()
    {
        cout<<"Base fun\n";
    }
    virtual void gun()
    {
        cout<<"Base gun\n";
    }
   virtual void sun()
    {
        cout<<"Base sun\n";
    }
};
class Derived : public Base
{
    public :
    int X,Y;
   
   virtual void gun()     // Redefinition
    {
        cout<<"Derived gun\n";
    }
    void run()   // Definition
    {
        cout<<"Derived run\n";
    }
   virtual void mun()
    {
        cout<<"Derived mun\n";    // Definition
    }
};


int main()
{
 cout<<"Inside main\n";

 //cout<<"Sizeof base class=="<<sizeof(Base)<<"\n";
 //cout<<"Sizeof base class=="<<sizeof(Derived)<<"\n";

 Base * bp = NULL;
 
 bp = new Derived;   //Upcasting
 // bp = (Derived *)malloc(size of(Derived))
 bp->fun();
 bp->gun();
 bp->sun();

    return 0;
}