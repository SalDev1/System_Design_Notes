#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Vehicle
{
public:
    int getNumberOfWheels()
    {
        return 2;
    }
};

class EngineVehicle : public Vehicle
{
public:
    bool hasEngine()
    {
        return true;
    }
};

class BicycleVehicle : public Vehicle
{
};

class MotorCycle : public EngineVehicle
{
};

class Car : public EngineVehicle
{
};

class Bicycle : public BicycleVehicle
{
};

int main()
{

    vector<Vehicle> v;

    MotorCycle mc;
    Bicycle b;
    Car c;

    v.push_back(mc);
    v.push_back(b);
    v.push_back(c);
    for (auto it : v)
    {
        cout << it.getNumberOfWheels() << endl;
    }
    return 0;
}