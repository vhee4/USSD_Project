import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        DisplayOptions.displayMenu();
//        System.getProperty("os.name");
//        ussdCode();
//        clearScreen();

    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // For Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // For Unix-like systems (Linux, macOS, etc.)
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void ussdCode(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the USSD code: ");
            String ussd = scanner.nextLine();
            clearScreen();
            if (ussd.equals("*919#")) {
                System.out.println("successful");
                break;
            } else if (i == 2) {
                System.out.println("You have exceeded the amount of trials");
            } else {
                System.out.println("Please Try again!");
            }

        }
//        return ussd;
    }

    public static void phone(String phoneNumber){
        if (phoneNumber.charAt(0) != '0') {
            System.out.println("This is an invalid phone number");
            System.out.println(phoneNumber.charAt(0));
        }
    }
}
