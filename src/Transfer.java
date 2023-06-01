import java.util.InputMismatchException;
import java.util.Scanner;

public class Transfer{
    public  void transferToUba() throws Exception {
//        PinAndAccountNumberSelection.EnterYourPin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Beneficiary Account Number or name of the beneficiary");
        String accountNumber = scanner.nextLine();
        while (true) {
            if (accountNumber.charAt(0) != '2' || accountNumber.length() != 10) {
                System.out.println("Account not valid");
                accountNumber = scanner.nextLine();
                continue;
            } else {
                System.out.println("Enter the amount");
                double amount = scanner.nextDouble();
                    if (amount < 500.00) {
                        System.out.println("Amount should not be less than 500.00");
                        //amount = scanner.nextDouble();
                        scanner.nextLine();
                        continue;
                    } else if (amount > 1000000.00) {
                        System.out.println("Amount should not exceed 1,000,000.00");
//                        amount = scanner.nextDouble();
                        continue;
                    } else {
                        System.out.printf("You are about to transfer %.2f to %s ", amount,accountNumber);
                        System.out.println("Continue: \n1. YES\n2. NO\n0. MAIN MENU");
                        int confirm = scanner.nextInt();
                        if (confirm == 1) {
                            System.out.printf("You have successfully transferred %.2f to %s ", amount, accountNumber);
                            System.exit(0);

                        } else if (confirm == 0){
                            DisplayOptions.displayMenu();
                            }else {
                            continue;
                        }
                        }

                        break;
                    }
//                break;
            }


    }

    public void transferToOtherBanks()  {
        PinAndAccountNumberSelection.EnterYourPin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Beneficiary Account Number or name of the beneficiary");
        String accountNumber = scanner.nextLine();
        while (true) {
            if (accountNumber.length() != 10) {
                System.out.println("Account not valid");
                accountNumber = scanner.nextLine();
            } else {
                boolean flag = true;
                while(flag){
                    try {
                System.out.println("""
                        Choose the bank
                        1. zenith bank
                        2. access bank
                        3. gt bank
                        """);
                        int input = scanner.nextInt();
                        if (input <= 3) {
                            System.out.println("Please enter the Amount");
                            double amount = scanner.nextDouble();
                            while (true) {
                                if (amount < 500.00) {
                                    System.out.println("Amount should not be less than 500.00");
                                    amount = scanner.nextDouble();
                                } else if (amount > 1000000.00) {
                                    System.out.println("Amount should not exceed 1,000,000.00");
                                    amount = scanner.nextDouble();
                                } else {
                                    System.out.printf("You are about to transfer %.2f to %s ", amount, accountNumber);
                                    System.out.println("Continue: \n1. YES\n2. NO");
                                    int confirm = scanner.nextInt();
                                    if (confirm == 1) {
                                        System.out.printf("You have successfully transferred %f to %s ", amount, accountNumber);
                                    }
                                    break;
                                }
                            }
                        }else{
                            System.err.println("Must be less than 3");
//                            break;
                        }
                    }catch (InputMismatchException e){
                        System.err.println("Please enter a number");
                        scanner.nextLine();
                    }
                }
                break;
            }

        }
    }


//    public void getTransferAmount() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the amount");
//        double amount = scanner.nextDouble();
//        while (true) {
//            if (amount < 500.00) {
//                System.out.println("Amount should not be less than 500.00");
//                amount = scanner.nextDouble();
//            } else if (amount > 1000000.00) {
//                System.out.println("Amount should not exceed 1,000,000.00");
//                amount = scanner.nextDouble();
//            } else {
//                System.out.printf("You are about to transfer %f to %s ", amount,);
//                System.out.println("Continue: \n1. YES\n2. NO");
//                int confirm = scanner.nextInt();
//                if (confirm == 1) {
//                    System.out.printf("You have successfully transferred %f to %s ", amount, getAccountNumber());
//                }
//                break;
//            }
//        }
//    }
                }
