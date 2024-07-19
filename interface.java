import java.util.*;
interface Area
{
final static float pi=3.14F;
float compute(float x,float y);
}
class Rectangle implements Area
{
    public float compute(float x,float y)
    {
        return(x*y);
    }
}
class circle implements Area
{
    public float compute(float x,float y)
    {
        return (pi*x*x); 
    }
}
class Interfacetest
{
    public static void main (String args[])
    {
        Rectangle rect =new Rectangle();
        circle cir =new circle();
        Area area;
        area=rect;
        System.out.println("Area of Rectangle="+ area.compute(10,20));
        area =cir;
        System.out.println("Area of circle ="+area.compute(10, 6));
    }
}