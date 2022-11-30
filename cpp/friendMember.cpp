#include<iostream>
using namespace std;

class Marvollous
{
      public:
        void fun();  // Naked function
     
};
class Demo
{
    public:
          int I;
    private:
          int J;
    protected : 
          int K;
    public:

           Demo()
           {
            I = 10;
            J = 20;
            K = 30;
           }            
  friend void Marvollous::fun();
};
       void Marvollous::fun()  // Naked function
     {
          Demo obj;
          cout <<"Value of I :"<<obj.I<<"\n";
          cout <<"Value of J :"<<obj.J<<"\n";
          cout <<"Value of K :"<<obj.K<<"\n";

      }


int main()
{
      Marvollous mobj;
   
   mobj.fun();
  return 0;
}