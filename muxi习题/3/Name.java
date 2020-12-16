package com.Oracle;

public class Name
{
    public static void main(String[] args)
    {
        Member m=new Member("阿珍");
        System.out.println(m.getName());
        m.setName("阿强");
        System.out.println(m.getName());
    }
}
