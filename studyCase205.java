import java.util.Scanner;   
public class studyCase205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, activity;
        int numDocuments, winnerRank;
        int pkmStatus;

        System.out.print("Enter your name\t\t: ");
        name = input.nextLine(). trim();
        System.out.print("Enter your activity\t: ");
        activity = input.nextLine(). trim(). toUpperCase();

        switch (activity) {
            case "BELMAWA":
            case "BAKORMA":
            case "MANDIRI":
                System.out.print("Enter the number of documents\t: ");
                numDocuments = input.nextInt();
                System.out.print("Enter your winner rank\t\t: ");
                winnerRank = input.nextInt();
                if (numDocuments == 4 && winnerRank <= 3) {
                    System.out.println("Congratulations " + name + ", you are eligible for achivement fund!");
                } else if (numDocuments < 4) {
                    System.out.println("Sorry " + name + ", your documnets incomplete, you have tp fulfill " + (4 - numDocuments) + " more documents.");
                } else if (winnerRank > 3) {
                    System.out.println("Sorry " + name + ", your rank is not eligible for achivement fund.");
                } else {
                    System.out.println("Sorry " + name + ", your documnets incomplete, you have tp fulfill " + (4 - numDocuments) + " more documents.\n Also, your rank is not eligible for achivement fund.");
                } break;
            
        }
        input.close();
        
    }
}
