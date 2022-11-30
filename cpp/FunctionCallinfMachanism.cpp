#include<iostream>
using namespace std;
// Call by value
void fun(int no)
{
    cout<<" Insaide call by value :"<<no<<"\n";
    no++;
}
// call by address
void gun(int *p)
{
        cout<<" Insaide call by address :"<<*p<<"\n";
        (*p)++;
}
// call by reference
void sun(int &ref)
{
        cout<<" Insaide call by reference :"<<ref<<"\n";
        ref++;

}
int main()
{
    int i = 20;
    int j = 20;
    int k = 20;

    fun(i);
    cout<<i<<"\n";
    gun(&j);
    cout<<j<<"\n";
    cout<<&j<<"\n";

    sun (k);
    cout<<k<<"\n";

 
    return 0;
}