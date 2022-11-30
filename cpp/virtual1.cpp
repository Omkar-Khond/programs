#include<iostream>
using namespace std;

class Base
{
    public : 
    int A,B;

    void fun()       //1000
    {
        cout<<"Base fun\n";
    }
    virtual void gun()  //2000
    {
        cout<<"Base gun\n";
    }
   virtual void sun()  //3000
    {
        cout<<"Base sun\n";
    }
     virtual void run()   // Definition  //4000
    {
        cout<<"Derived run\n";
    }
};
class Derived : public Base
{
    public :
    int X,Y;
   
    void gun()     // Redefinition  
    {
        cout<<"Derived gun\n";  //5000
    }
   virtual void run()   // Definition
    {
        cout<<"Derived run\n";  // 6000
    }
   virtual void mun()  // 7000
    {
        cout<<"Derived mun\n";    // Definition
    }
};


int main()
{
 cout<<"Inside main\n";

 //cout<<"Sizeof base class=="<<sizeof(Base)<<"\n";
 //cout<<"Sizeof base class=="<<sizeof(Derived)<<"\n";

 Base * bp = new Derived;
// Derived dobj;
 bp = &dobj;   //Upcasting

 

    return 0;
}