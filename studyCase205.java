import java.util.Scanner;   
public class studyCase205 {
    @SuppressWarnings("ConvertToTryWithResources")
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
            case "BELMAWA", "BAKORMA", "MANDIRI" -> {
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
            case "PKM" -> {
                System.out.print("Enter your PKM status (1 for funded, 0 for not funded)\t: ");
                pkmStatus = input.nextInt();
                if (pkmStatus == 1) {
                    System.out.print("Enter the number of documents\t: ");
                    numDocuments = input.nextInt();
                    System.out.print("Enter your winner rank\t\t: ");
                    winnerRank = input.nextInt();
                
                    if (numDocuments == 4 && winnerRank <= 3) {
                        System.out.println("Congratulations " + name + ", you are eligible for achivement fund!");
                    } else if (numDocuments < 4 && winnerRank <= 3) {
                        System.out.println("Sorry " + name + ", your documnets incomplete, you have tp fulfill " + (4 - numDocuments) + " more documents.");
                    } else if (winnerRank > 3 && numDocuments == 4) {
                        System.out.println("Sorry " + name + ", your rank is not eligible for achivement fund.");
                    } else if (numDocuments < 4 && winnerRank > 3) {
                        System.out.println("Sorry " + name + ", your documents incomplete, you have tp fulfill " + (4 - numDocuments) + " more documents.\nAlso, your rank is not eligible for achivement fund.");
                    } 
                } else {
                    System.out.println("Sorry " + name + ", your PKM status is rejected, you are not eligible for achivement fund.");
                }
                break; 
            } 
            default -> System.out.println("Sorry " + name + ", your activity is not eligible for achivement fund.");
            
        }
        input.close();
       
    }
}
