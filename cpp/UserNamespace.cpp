#include<iostream>
//using namespace std;

namespace Marvellous
{
    class Demo
    {
        public:
              int I, J;

              void fun()
              {
               std::cout<<"Inside fun -> Marvellous\n";
              }
    };
    class Hello
    {
        public:
        int X, Y;
    };
}

namespace Infosystems
{
    class Demo
    {
        public :
        int A, B;
        
        void fun()
        {
            std::cout<<"Inside fun -> Infosystems\n";
        }
       
    };
}

int main()
{
   Marvellous::Demo obj1;
   obj1.fun();

   Infosystems:: Demo obj2;
   obj2.fun();

    using namespace Marvellous;
    Hello Hobj;
    Demo Dobj;


    return 0;
}