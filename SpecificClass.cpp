#include<iostream>

using namespace std;

class Array 
{
    public :
    int *Arr;
    int size;

    Array(int length)
    {
        size = length;
        Arr = new int[size];
    }
    void Accept()
    {
        cout<<"Enter the values\n";
        for(int i = 0; i < size; i++)
        {
            cin>>Arr[i];
        }
    }
    void Display()
    {
        cout<<"vlaues of array are\n";
        for(int i = 0; i < size; i++)
        {
            cout<<Arr[i]<<"\t";
        }

    }
};

int main()
{
    Array obj1(5);

    obj1.Accept();
    obj1.Display();
    

    return 0;
}