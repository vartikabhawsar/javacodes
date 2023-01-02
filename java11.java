class Rectangle
{

int length, width;

void area()
{
    int ar;
    ar=length*width;
    System.out.println("area of rectangle "+ar);
}}
interface Circle
{
int radius =14;
static double pie = 3.14;

void area2();
    
}
class Result extends Rectangle implements Circle
{
Result()
{
   length=16;
    width=18;
}
public void area2()
{

double a;
a= pie* radius *radius;
System.out.println("Area of CIRCLE is: "+a);
    
}}
public class Main
{
public static void main(String[] args)
{
Result r1 = new Result();
r1.area2();
r1.area();
 }}
