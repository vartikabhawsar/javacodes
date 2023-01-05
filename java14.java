public class Main
{
public static void main(String[] args) {
StringBuilder s1 =new StringBuilder("vartika");
s1.append(" bhawsar");
System.out.println(s1);

s1.insert (2," world");
System.out.println(s1);

s1.delete (2,8);
System.out.println(s1);
System.out.println(s1.capacity());}}
