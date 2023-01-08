import java.util.*;
public class Main
{
static int add(int a, int b)
{
int s = a+b;
System.out.println("Sum = "+s);
return 0;
}
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int a,b;
System.out.print("Enter two numbers: ");
a = obj.nextInt();
b = obj.nextInt();
add(a,b);
}}
