public class Test {
    public static void main(String[] args){

        Vehicles vehicles = new Vehicles("奥迪","黑色");
        vehicles.showInfo();

        Car car = new Car("桑塔纳","红色",5);
        car.showCar();

        Truck truck = new Truck("解放","蓝色",10);
        truck.showTruck();
    }
}
