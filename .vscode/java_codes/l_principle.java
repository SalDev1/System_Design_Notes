
/*
  To extend  , override a class in Java  , use extend keyword + @Override Keyword.
  To extend a class in C++ --> use : annotation.
  To override a method in C++ 
  --> define virtual keyword in function defined in parent 
       +
      use the override keyword in function you are overriding 
      in the child class.
*/

/*
  Liskov Subsitution Principle with Solution :-

  Eg :- Let's say we have 1 Parent class and 3 classes.
               Parent
         /       |       \
       C1       C2       C3

  The main aim over here is to understand how to make changes
  and how to avoid it if it violates the L principle.

  The principle says that --> You should be able to swap / substitute the
  objects without breaking the behaviour of it.

  The above approach works perfectly fine when we have Objects such as
  Car , Motocycle extending from the Vehicle class.

  The above approach is downsizing it's capability when we added a child that
  mishandles the method defined in the parent class (Eg :- Bicycle class).

  But what if I had something like a Bicycle extending the vehicle
  class.

  Let's say we have something like this :
                  Vehicle
         /          |          \
      Motorcycle   Car        Bicycle

   For the given bicycle , it will return a null pointer exception.

   How can we solve this and maintain our principle ?? 

   Bicycle has remove the capability of hasEngine by returning null , thus
   narrowing down the capability.
*/

import java.util.ArrayList;
import java.util.List;

/**
 * l_principle
 */

public class l_principle {
  public static void main(String[] args) {

    List<Vehicle> list = new ArrayList<>();

    list.add(new Motorcycle());
    list.add(new Car());
    list.add(new Bicycle());

    // This works well as the getNumberOfWheels method is common in all classes.
    // for (Vehicle v : list) {
    // System.out.println(v.getNumberOfWheels().toString());
    // }

    // This might not work for the hasEngine function.
    // It will only show output for Motorcycle and Car , as only them as the
    // function hasEngine().

  }
}
