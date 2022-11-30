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


 Derived dobj;
Base &bref = dobj;   //Upcasting
// bref is a reference of type base refering to dobj which is the object of Derived class.
 bref.fun();
 bref.gun();
 bref.sun();
 //bref.run();

    return 0;
}