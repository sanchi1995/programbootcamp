public class InstanceofExample {
public static void main(String[] args)
{
Vehicle vehicle= new Vehicle();
Car car=new Car();
MotorCycle moto = new MotorCycle();
System.out.println("vehicle instance of vehical:" +(Vehicle instanceof Vehicle));
System.out.println("car instance of vehical:"+(car instanceof Car));
System.out.println("vehical instance of drivercar:"+(car instanceof Drivercar));
System.out.println("moto instance of motorcycle:"+(moto instanceof Car));

System.out.println("vehical instance of car:"+(Vehicle instanceof Car));
System.out.println("vehical instance of drivercar:"+(car instanceof Drivercar));
System.out.println("moto instance of motorcycle:"+(moto instanceof Drivercar));

car=null;

System.out.println("(car=null) instance of vehicle:"+(car instanceof Vehicle));
System.out.println(" (car=null) instance of car:"+(car instanceof Car));
}
}
class Vehicle{
}
class Car extends Vehicle implements Drivercar{
}
class MotorCycle extends Vehical
{
}
interface DriveCar {
}