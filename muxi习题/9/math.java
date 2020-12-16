public class math {
    public math(int x, int y) {
        if (x > y) {
            System.out.println("The max is " + x);
        } else
            System.out.println("The max is " + y);
    }

    public math(double a, double b, double c) {
        double d = a * b * c;
        System.out.println("The multiply result is " + d);
    }

    public math(String i, String j) {
        boolean k;
        if (i.equals(j)) {
            k = true;
        } else {
            k = false;
        }
        System.out.println(k);
    }

    public static void main(String[] args){
        math c1=new math(5,8);
        math c2=new math(2,3,5);
        math c3=new math("hello","hello");
    }
}