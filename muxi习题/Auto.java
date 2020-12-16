public class Auto {
    public int tire;
    public String color;
    public double weight;
    public int speed;
    Auto(){}

    public void SpeedUp(){
        System.out.println("正在加速中");
    }

    public void SpeedDown(){
        System.out.println("正在减速中");
    }

    public void Stop(){
        System.out.println("停车");
    }

    Auto(int tire,String color,double weight,int speed){
        this.tire = tire;
        this.color = color;
        this.weight = weight;
        this.speed = speed;

    }
    public static void main(String[] args){
        car c = new car();
        c.SpeedUp();
        c.SpeedDown();
    }
}

class car extends Auto{
    public String air_condition;
    public String CD;

    public void SpeedUp(){
        System.out.println("小车加速啦");
    }

    public void SpeedDown(){
        System.out.println("小车减速啦");
    }
}
