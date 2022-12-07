import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
       
        int num1, num2, sum1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
       
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
       
        
        sum1 = num1 + num2;
        System.out.println("Sum of these numbers is: "+sum1);}

    }