package Vehicle;

public class interfaceDemo{
    public static void main(String[] args){
        Bike bike = new Bike();
        bike.start();
        bike.stop();
        Bus bus = new Bus();
        bus.start();
        bus.stop();
    }
}

class Bike implements Vehicle {
    public void start(){
        System.out.println("Bike is running.");
    }

    public void stop(){
        System.out.println("Bike is stop.");
    }
}

class Bus implements Vehicle {
    public void start(){
        System.out.println("Bus is running.");
    }

    public void stop(){
        System.out.println("Bus is stop.");
    }
}