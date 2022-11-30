#include<iostream>

using namespace std;

template<class T>

T Add(T i , T j)
{
    T ans;
    ans = i + j;
    return ans;

}

int main()
{
    int a = 10, b = 11,  iRet = 0;

    float x = 90.1f, y = 67.5f , fRet = 0.0f;

    double p = 90.11, q =77.88, dRet = 0.0;

    iRet = Add(a,b);

    fRet = Add(x,y);

    dRet = Add(p,q);

    cout<<"Addition of integers is :"<<iRet<<"\n";
    cout<<"Addition of floats is :"<<fRet<<"\n";
    cout<<"Addition of double is :"<<dRet<<"\n";

    return 0;
}