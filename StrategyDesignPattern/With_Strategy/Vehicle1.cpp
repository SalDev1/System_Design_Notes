#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class DriveStrategy
{
public:
    virtual void drive()
    {
        cout << "Drive Capability" << endl;
    }
};

class NormalDrive : public DriveStrategy
{
public:
    void drive() override
    {
        cout << "Normal Drive Capability" << endl;
    }
};

class SpecialDrive : public DriveStrategy
{
public:
    void drive() override
    {
        cout << "Special Drive Capability" << endl;
    }
};

class Vehicle1
{
public:
    DriveStrategy *ds;
    Vehicle1(DriveStrategy *dObject)
    {
        this->ds = dObject;
    }
    void drive()
    {
        ds->drive();
    };
};

class SportsVehicle : public Vehicle1
{
public:
    SportsVehicle() : Vehicle1(new SpecialDrive())
    {
    }
};

class GoodsVehicle : public Vehicle1
{
public:
    GoodsVehicle() : Vehicle1(new DriveStrategy())
    {
    }
};

class PassengerVehicle : public Vehicle1
{
public:
    PassengerVehicle() : Vehicle1(new NormalDrive())
    {
    }
};

class OffRoadVehicle : public Vehicle1
{
public:
    OffRoadVehicle() : Vehicle1(new SpecialDrive())
    {
    }
};

int main()
{
    // Vehicle1 v;
    // v.drive();

    PassengerVehicle p;
    p.drive();

    SportsVehicle sp;
    sp.drive();

    return 0;
}