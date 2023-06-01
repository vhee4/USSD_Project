import java.util.Scanner;

public class AliyusMethod {

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose your preferred service:
                            
                1. Airtime-Self
                2. Airtime Others
                3. Trsf - UBA
                4. Trsf - Other Banks
                5. Trsf - Microfinance & Others
                6. Trsf - UBA prepaid
                7. Check Balance
                8. Next
                """
        );
        System.out.println("Enter a number: \r");

    }
    private static void EnterYourPin(){
        int pin1 = 3261;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("Enter your Pin: ");
            int pin = scanner.nextInt();
            if(pin == pin1){
//                AccountNumberForUsersWithMultipleAccounts();
                break;
            }else if (Integer.toString(pin).length() > 4) {
                System.out.println("Invalid! Enter 4 digits: ");
            } else if(pin != pin1){
                System.out.println("Incorrect Pin!\n");
            } else if (i == 2) {
                System.out.println("You have exceeded the amount of trials!");
            }
        }
//        return pin;
    }

    public static void AccountNumberForUsersWithMultipleAccounts(){
        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        int flagValue = -1;
        while(true){
            System.out.println("Select your account number: \n1. 2039485673\n2. 2039102635");
            String accountNumber = scanner.nextLine();
            if(Integer.parseInt(accountNumber) == 1){
                System.out.println("You have selected account number 1");
                break;
            } else if (Integer.parseInt(accountNumber) == 2) {
                System.out.println("You have selected account number 2");
                break;
            }else{
                System.out.println("Wrong input! Please Enter 1 or 2");
            }
//            i++;
        }
        EnterYourPin();
}
}
