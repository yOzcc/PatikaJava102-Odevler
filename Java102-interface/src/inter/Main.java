package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String terminalId = "1234567";
        final String password = "Deneme123";

        System.out.println(" Enter the amount to withdraw : ");
        double price = scanner.nextDouble();

        System.out.println(" Enter the card number : ");
        String cardNumber = scanner.next();

        System.out.println(" Enter the expiration date : ");
        String expirationDate = scanner.next();

        System.out.println(" Enter the security code : ");
        String cvc = scanner.next();

        System.out.println("1. A Bank : ");
        System.out.println("2. B Bank : ");
        System.out.println("3. C Bank : ");
        System.out.println(" Select the bank : ");
        int selectBank = scanner.nextInt();

        switch (selectBank){
            case 1:
                ABank aPos = new ABank(" A Bank","123456789", "try123");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNumber,expirationDate,cvc);
                break;
            case 2:
                BBank bPos = new BBank(" B Bank","123456789", "try123");
                bPos.connect("127.1.1.1");
                bPos.payment(price, cardNumber,expirationDate,cvc);
                break;
            default:
                System.out.println("Please enter a valid bank.");
        }
    }
}
