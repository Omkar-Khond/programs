#include<iostream>
using namespace std;

class Demo 
{
    public :
    int i;
    const int j;  // constant characterestics
   // parameterized constructor with default values 
    Demo(int x =10 , int y = 20) : j(y)
    {
        i = x;
        
    }

    void fun()
    {
        int a = 10;
        const int b = 20;  // constant variable
        i++;
        j++;
    }

    void gun() const    // constant behavior
    {
        int a = 10;
        const int b = 20;  
        i++;
        j++;
        a++; 
        b++;
    }
};
int main()
{
  Demo obj1;
  Demo obj2(11);
  Demo obj3(11,21);
  obj3.fun();
  obj3.gun();

    return 0;
}
// incomplete