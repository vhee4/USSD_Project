import java.util.Scanner;

public class DisplayOptions {
public static void displayMenu() throws Exception {
    Scanner scanner = new Scanner(System.in);
//    Airtime airtime = new Airtime();
//    while(true){
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
//    System.out.println();
//    System.out.println();
    System.out.println();
    System.out.println(""" 
            1. Airtime-Self
            2. Airtime Others
            3. Trsf - UBA
            4. Trsf - Other Banks
            5. Trsf - Microfinance & Others
            6. Trsf - UBA prepaid
            7. Check Balance
            0. back
            
            Choose your preferred service:
            """
    );
        Transfer transfer = new Transfer();
        int input = scanner.nextInt();
        switch (input) {
            case 1 -> {
                scrollDown(18);
                Airtime.getAmount();
            }
            case 2 -> Airtime.getPhoneNumber();
            case 3 -> transfer.transferToUba();
            case 4 -> {
                try {
                    transfer.transferToOtherBanks();
                } catch (Exception e) {
                    System.out.println("do the right thing");
                }
            }
            case 0 -> {
                return;
            }
        }
    }

    //}
    public static void scrollDown(int numberOfLine){
        for (int i =0; i<numberOfLine; i++){
            System.out.println();
        }
    }
}
