#include<iostream>

using namespace std;

int Add(int i , int j)
{
    int ans = 0;
    ans = i + j;
    return ans;

}

float Addf(float i , float j)
{
    float ans = 0.0;
    ans = i + j;

    return ans;
}
int main()
{
    int a = 10, b = 11,  iRet = 0;

    float x = 90.1f, y = 67.5f , fRet = 0.0f;

    iRet = Add(a,b);

    fRet = (x,y);

    cout<<"Addition of integers is :"<<iRet<<"\n";
    cout<<"Addition of floats is :"<<fRet<<"\n";

    return 0;
}