public class Car extends Vehicles
{
    public Car c;
    private int seats;
    public Car(String brand,String color,int seats)
    {
        super(brand,color);
        this.seats=seats;
    }
    public void showCar()
    {
        System.out.println("座位:" + seats + "个");
    }
}