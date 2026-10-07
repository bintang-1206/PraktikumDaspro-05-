import java.util.Scanner;
public class studyCase105 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int  pricePerCup = 18000;
        int amountCup, moneyPayment;
        int totalPrice, discount, totalPayment;
        int change, notEnough;

        System.out.print("Enter the amount of cups\t: ");
        amountCup = input.nextInt();
        System.out.print("Enter the money for payment\t: ");
        moneyPayment = input.nextInt();
        totalPrice = pricePerCup * amountCup;

        if (totalPrice >= 50000) {
            discount = totalPrice * 10 / 100;
        } else {
            discount = 0;
        }
        totalPayment = totalPrice - discount;

        System.out.println("Total price\t: " + totalPrice);
        System.out.println("Discount\t: " + discount);
        System.out.println("Total payment\t: " + totalPayment);

        if (moneyPayment >= totalPayment) {
            change = moneyPayment - totalPayment;
            System.out.println("Change\t\t: " + change);
        } else {
            notEnough = totalPayment - moneyPayment;
            System.out.println("Not enough money, you need: " + notEnough);
        }
        input.close();
    }
}
