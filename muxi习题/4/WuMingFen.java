package com.Oracle;

public class WuMingFen
{
    String theMa;
    int quantity;
    boolean likeSoup;

    public String getTheMa()
    {
        return theMa;
    }

    public void setTheMa(String theMa)
    {
        this.theMa = theMa;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public boolean isLikeSoup()
    {
        return likeSoup;
    }

    public void setLikeSoup(boolean likeSoup)
    {
        this.likeSoup = likeSoup;
    }

    public WuMingFen (String theMa,int quantity,boolean likeSoup)
    {
        super();
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }

    public WuMingFen (String theMa,int quantity)
    {
        super();
        this.theMa = theMa;
        this.quantity = quantity;
    }

    boolean check(int quantity)
    {
        if(quantity>1)
        {
            return true;
        }
        return false;
    }
}
