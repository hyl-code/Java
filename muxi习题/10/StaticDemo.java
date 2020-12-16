public class StaticDemo {
    private static int a = 10;
    private int b = 5;

    public static void main(String[] args){
        StaticDemo staticDemo=new StaticDemo();
        System.out.println("Static digit = "+staticDemo.a+",Normal digit = "+staticDemo.b);
    }
}
