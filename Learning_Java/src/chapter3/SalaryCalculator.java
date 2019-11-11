package chapter3;

/*
IF Statement.
All Salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an additional bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]) {

        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;


        // Get values for the unknown
        System.out.println("Please enter your full name: ");
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        System.out.println("How many sales did the employee make this week?: ");
        int sales = scanner.nextInt();


        // Quick detour for the bonus earners
        if (sales > 10) {
            salary = salary + bonus;
        }
        // Output
        System.out.println("Hello " + fullName);
        System.out.println("Your pay is $" + salary);
        System.out.println("*********************\n");
        System.out.println("app done()");


    }
}
