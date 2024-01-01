#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Vehicle
{
public:
    virtual int getNumberOfWheels()
    {
        return 2;
    }

    virtual bool hasEngine()
    {
        return false;
    }
};

class Car : public Vehicle
{
public:
    int getNumberOfWheels() override
    {
        return 4;
    }
    bool hasEngine() override
    {
        return true;
    }
};

int main()
{
    Car c;

    cout << c.getNumberOfWheels() << endl;
    cout << c.hasEngine() << endl;
    return 0;
}