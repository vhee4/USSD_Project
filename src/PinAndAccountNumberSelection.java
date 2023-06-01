import java.util.Scanner;

public class PinAndAccountNumberSelection {
    private int pin;
    private String accountNumber;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = Math.abs(pin);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void EnterYourPin(){
        String pin1 = "****";
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("Enter your Pin: ");
             String pin = scanner.nextLine();
//             if (pin.equals("0")){
//                 return -1;
//             }
            if(pin.equals(pin1)){
                AccountNumberForUsersWithMultipleAccounts();
//                DisplayOptions.scrollDown(20);
//                return pin;
                break;
            }else if (pin.length() > 4) {
                System.out.println("Invalid! Enter 4 digits: ");
            } else {
            System.out.println("Incorrect Pin!\n");
            }
        }
//        return -1;
    }

    public static void AccountNumberForUsersWithMultipleAccounts(){
        Scanner scanner = new Scanner(System.in);
            DisplayOptions.scrollDown(20);
        while(true){
            System.out.println("Select your account number: \n1. 2039485673\n2. 2039102635");
            String accountNumber = scanner.nextLine();
            if(Integer.parseInt(accountNumber) == 1){
                DisplayOptions.scrollDown(15);
                System.out.println("You have selected account number: 2039485673");
                break;
            } else if (Integer.parseInt(accountNumber) == 2) {
                DisplayOptions.scrollDown(15);
                System.out.println("You have selected account number: 2039102635");
                break;
            }else{DisplayOptions.scrollDown(15);
                System.out.println("Wrong input! Please Enter 1 or 2");
            }
        }
    }
}
