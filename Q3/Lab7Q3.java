
import java.util.Scanner;

public class Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            char mode = input.next().charAt(0);

            double discount = 0;
            double amountToPay;

            if (mode == 'C' || mode == 'c') {

                discount = bill * 0.05;
                amountToPay = bill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to Pay: " + amountToPay);

            } else if (mode == 'O' || mode == 'o') {

                amountToPay = bill;

                System.out.println("Discount: 0");
                System.out.println("Amount to Pay: " + amountToPay);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}