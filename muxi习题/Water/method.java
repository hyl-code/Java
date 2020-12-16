package Water;

public class method {
    public static void main(String[] args){
        PureWater pw = new PureWater();
        pw.缓冲();
        pw.过滤();
        pw.加热();
        pw.放糖();
    }
}

abstract class Water{
    public void 缓冲(){};
    public void 过滤(){};
    public void 加热(){};
    public void 放糖(){};
}

class PureWater extends Water implements operation{
    public void 缓冲(){
        System.out.println("第一步，水缓冲。");
    }

    public void 过滤() {
        System.out.println("第二步，水过滤。");
    }

    public void 加热() {
        System.out.println("第三步，水加热。");
    }

    public void 放糖() {
        System.out.println("第四步，水放糖。");
    }
}