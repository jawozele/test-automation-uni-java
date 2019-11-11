

package basics;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]) {

        //0. Get full name.
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();

        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println(fullName);
        System.out.println(".................................");
        System.out.println("Earnings for this week");
        System.out.println(".................................");
        System.out.println(grossPay);
    }


}
