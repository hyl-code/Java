package hyl;

public class Addition {

    public int Add1(int a,int b){
        return a+b;
    }

    public long Add2(long a,long b){
        return a+b;
    }

    public float Add3(float a,float b){
        return a+b;
    }

    public double Add4(double a,double b){
        return a+b;
    }

    public static void main(String[] args){
        Addition addition = new Addition();
        System.out.println(addition.Add1(2,3));
        System.out.println(addition.Add2(1000,1050));
        System.out.println(addition.Add3(2.1f, 3.4f));
        System.out.println(addition.Add4(2.2,3.14));
    }
}
