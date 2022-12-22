class Bank
{
String name;
int acc;
int bal;
void get()
{
    name="Vartika";
    acc=654757;
    bal=40000;
}
void put()
{
System.out.println("Account holders Name is "+name);
System.out.println("Account no is "+acc);
System.out.println("Balance is "+bal);
}
void deposit()
{
    System.out.println("Balance after deposit is "+(bal+5000));
}
void withdraw()
{
    System.out.println("Balance after withdraw is "+(bal-500));
}
}
public class Main
{
public static void main(String[] args) {
Bank b1 =new Bank();
b1.get();
b1.put();
b1.deposit();
b1.withdraw();
}}
