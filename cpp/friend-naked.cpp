#include<iostream>
using namespace std;

class Demo
{
    public:
          int I;
    protected:
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
  friend void fun();
};
void fun()  // Naked function
{
   Demo obj;
   cout <<"Value of I :"<<obj.I<<"\n";
   cout <<"Value of J :"<<obj.J<<"\n";
   cout <<"Value of K :"<<obj.K<<"\n";

}

int main()
{
   fun();
  return 0;
}