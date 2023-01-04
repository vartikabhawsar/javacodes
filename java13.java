import java.util.*;
public class Main
{
public static void main(String[] args) {
String ans;
String ca="james gosling";
int c=0;
System.out.println("Who is the inventor of java?");
Scanner sc = new Scanner(System.in);
while(c<3)
{
ans=sc.nextLine();
if(ans.equals(ca))
{
System.out.println("good");
break;
}
else
{

c++;
if(c!=3){
System.out.println("try again");
}
if (c==3)
{
System.out.println("correct ans is james gosling");
}
}}}}
