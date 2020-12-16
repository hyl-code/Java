public class Test{
    public static void main(String[] args){
        Car c = new Car();
        c.NoOfWheels();
        Motorbike m = new Motorbike();
        m.NoOfWheels();
    }
}

abstract class Vehicle {
    public void NoOfWheels(){};
}

class Car extends Vehicle{
    public void NoOfWheels(){
        System.out.println("四轮车");
    }
}

class Motorbike extends Vehicle{
    public void NoOfWheels(){
        System.out.println("双轮车");
    }
}