#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Vehicle
{
public:
    virtual void drive()
    {
        cout << "Normal Drive Capability" << endl;
    };
};

class OffRoadVehicle : public Vehicle
{
public:
    void drive() override
    {
        cout << "Off Drive Capability" << endl;
    }
};

class SportVehicle : public Vehicle
{
public:
    void drive() override
    {
        cout << "Sport Drive Capability" << endl;
    }
};

class PassengerVehicle : public Vehicle
{
};

class GoodVehicle : public Vehicle
{
};

int main()
{
    Vehicle v;
    v.drive();

    OffRoadVehicle of;
    of.drive();

    SportVehicle sv;
    sv.drive();

    return 0;
}