/*
 * Program: Pass-by-Value with Objects in Java
 *
 * Description:
 * This program demonstrates how Java passes object references by value.
 * It shows that modifying the state of an object through a reference
 * affects the original object, while assigning a new object to the
 * reference inside a method does not change the original reference.
 *
 * Key Concepts:
 * - Objects and references in Java
 * - Pass-by-value
 * - Modifying object state through a reference
 * - Assigning a new object to a reference
 */
class Car
{
    String color;

    Car(String color)
    {
        this.color = color;
    }
}

// mfc = modify color
public class Pass_By_Value_OBJECT_VS_VARIABLE
{
    public static void main(String args[])
    {
        Car car = new Car("Green");

        System.out.println("Initial color of car = " + car.color);

        // Pass the reference value of the Car object to modify().
        // The method can modify the same object through its parameter.
        modify(car);
    }

    static void modify(Car car) // Takes a Car reference as an argument
    {
        // The parameter 'car' refers to the same object created in main().
        // Therefore, changing its color changes the original object's state.
        car.color = "Red";

        System.out.println("The initial color is changed to " + car.color);

        // A new Car object is created and assigned to the local reference.
        // This does not change the reference held by 'car' in main().
        car = new Car("Blue");

        System.out.println("Initial color is not changed but a new object of Car "
                + "is assigned a color " + car.color);
    }
}