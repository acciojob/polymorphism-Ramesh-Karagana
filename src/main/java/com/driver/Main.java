package com.driver;

public class Main
{
   public int product(int x,int y)
   {
       return x*y;
   }
    public int product(int x,int y,int z)
    {
        return x*y*z;
    }
    public double product(double x,double y)
    {
        return x*y;
    }
    public static void main(String[] args)
    {
        Main p=new Main();
        System.out.println(p.product(2,3));
        System.out.println(p.product(2,3,7));
        System.out.println(p.product(2.1,3.2));
    }

}