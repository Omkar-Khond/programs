#include<iostream>
using namespace std;

class Demo
{
    private :
    int A,B;
    
    public :
    Demo(int i = 0, int j = 0)
    {
        cout<<"Inside  constructor\n";
        A = i;
        B = j;
    }
    void Display()
    {
        cout<<A<<"\n";
        cout<<B<<"\n";
    }
    friend Demo operator +(Demo , Demo);
    friend Demo operator -(Demo , Demo);
    friend Demo operator *(Demo , Demo);
    friend Demo operator /(Demo , Demo);
};
Demo operator +(Demo obj1, Demo obj2)
{
    cout<<"Inside + operator function\n";
    return Demo(obj1.A+obj2.A, obj1.B+obj2.B);
}
Demo operator -(Demo obj1, Demo obj2)
{
    cout<<"Inside - operator function\n";
    return Demo(obj1.A-obj2.A, obj1.B-obj2.B);
}
Demo operator *(Demo obj1, Demo obj2)
{
    cout<<"Inside * operator function\n";
    return Demo(obj1.A*obj2.A, obj1.B*obj2.B);
}
Demo operator /(Demo obj1, Demo obj2)
{
    cout<<"Inside + operator function\n";
    return Demo(obj1.A/obj2.A, obj1.B/obj2.B);
}

int main()
{
    cout<<"Inside  main\n";
    Demo A(10,20);
    Demo B(30,40);
    Demo Ans(0,0);

    Ans = A + B;
    Ans.Display();
   // cout<<Ans.A<<"\n";
   // cout<<Ans.B<<"\n";

       Ans = A - B;
    Ans.Display();

    Ans = A * B;
    Ans.Display();

    Ans = A / B;
    Ans.Display();


    return 0;
}