#include<iostream>

using namespace std;
// class declaration
class maths
{
    public:          //Access Specifier
          int iNo1;  //Characterestics
          int iNo2;  //Characterestics
    maths()
    {
        iNo1 = 0;
        iNo2 = 0;

    }

    maths(int A , int B)      // Constructor (parameter)
    {
        iNo1 = A;
        iNo2 = B;
    }
    
    int Addition()            // behavior
    {
        return iNo1 + iNo2;
    }

    int Substraction()          // behavior
    {
        return iNo1 - iNo2;
    }

    ~maths()
    {
        // destructor
    }
};

int main()
{
   maths mobj1;
   maths mobj2(11,10);
   int ret = 0;

   ret = mobj2.Substraction();
   cout<<"addition is : "<<ret<<"\n";

   ret = mobj1.Addition();
   cout<<"addition is : "<<ret<<"\n";

    return 0;
}