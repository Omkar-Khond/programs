#include<iostream>
using namespace std;

class Demo
{
    public :
    int A,B;

    Demo(int i = 0, int j = 0)
    {
        cout<<"Inside  constructor\n";
        A = i;
        B = j;
    }
};
Demo operator +(Demo obj1, Demo obj2)
{
    cout<<"Inside + operator function\n";
    return Demo(obj1.A+obj2.A, obj1.B+obj2.B);
}

int main()
{
    cout<<"Inside  main\n";
    Demo A(10,20);
    Demo B(30,40);
    Demo Ans(0,0);

    Ans = A + B;

    cout<<Ans.A<<"\n";
    cout<<Ans.B<<"\n";



    return 0;
}