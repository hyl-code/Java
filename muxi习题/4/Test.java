package com.Oracle;

public class Test {
    public static void main(String[] args)
    {
        WuMingFen f1 = new WuMingFen("牛肉",3,true);
        WuMingFen f2 = new WuMingFen("牛肉",2);
        WuMingFen f3 = new WuMingFen("酸辣粉",2,true);
        System.out.println(f1.check(f1.getQuantity()));
        System.out.println(f2.check(f2.getQuantity()));
        System.out.println(f3.check(f3.getQuantity()));
        System.out.println("面码:"+f1.theMa+"\n"+"粉的分量:"+f1.quantity+"\n"+"是否带汤:"+f1.likeSoup);
        System.out.println("面码:"+f2.theMa+"\n"+"粉的分量:"+f2.quantity+"\n"+"是否带汤:未知");
        System.out.println("面码:"+f3.theMa+"\n"+"粉的分量:"+f3.quantity+"\n"+"是否带汤:"+f3.likeSoup);

    }
}
