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

       
    }
}
