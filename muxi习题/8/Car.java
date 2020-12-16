public class Car {
    private int num;
    private String color;
    private double weight;

    public Car(int num,String color,double weight){
        this.num = num;
        this.color = color;
        this.weight = weight;
    }

    public void speedup(){
        System.out.println("加速成功");
    }
    public void speeddown() {
        System.out.println("减速成功");
    }
    public void stop(){
        System.out.println("成功停车");
    }

    public static void main(String[] args){
        Car c1=new Car(4,"黑",1.45);
        c1.speedup();
        c1.speeddown();
        c1.stop();
    }
}
