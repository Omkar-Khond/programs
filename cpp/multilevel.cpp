#include<iostream>
using namespace std;

class Base
{
    public :
    int A,B;

    Base()
    {
        cout<<"inside base constructor\n";
    }

    ~Base()
    {
        cout<<"inside Destructor\n";

    }

    void fun ()
    {
        cout<<"inside Base Fun\n";
    }

};

class Derived : public Base
{
    public :
    int X,Y;

    Derived()
    {
        cout<<"inside derived constructor\n";

    }

    ~Derived()
    {
        cout<<"inside derived destructor\n";
    }
    void gun()
    {
        cout<<"inside gun of Derived\n";
    }

};

class Derivedx : public Derived
{
   public:

   int i,j;

   Derivedx()
   {
    cout<<"inside derivedx const\n";
   }

   ~Derivedx()
   {
    cout<<"inside derivedx destructor\n";

   }
   void sun()
    {
        cout<<"inside gun of Derived\n";
    }

};
int main()
{
    
     
        cout<<"sizeof base:"<<sizeof(Base)<<"\n";
         cout<<"sizeof base:"<<sizeof(Derived)<<"\n";
          cout<<"sizeof base:"<<sizeof(Derivedx)<<"\n";
    Derivedx dobj;

    dobj.fun();
    dobj.gun();
    dobj.sun();

    
    return 0;
}