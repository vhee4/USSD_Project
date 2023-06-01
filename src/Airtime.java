import java.util. Scanner;

public class Airtime extends PinAndAccountNumberSelection {

    private String phoneNumber;

 public void setAmount(double amount) {
     double amount1 = Math.abs(amount);
 }

 public static void getAmount() {
   Scanner scanner = new Scanner(System.in);
//    if(EnterYourPin()==-1){
//        return;
//    }
     EnterYourPin();
   while(true){
    System.out.println("Please enter Amount(50.00 - 10,000.00 )");
    double amount = scanner.nextDouble();
    if (amount < 50 ||  amount > 10000) {
     System.out.println("Invalid amount!\n");
    } else {
       DisplayOptions.scrollDown(20);
     System.out.println("Your transaction is being processed.");
     break;
    }
   }
 }

 public static void getPhoneNumber(){
//   if(EnterYourPin()==-1){
//       return;
//   }else{
   Scanner scanner = new Scanner(System.in);
   while(true) {
     System.out.println("Enter the phone number");
     String phoneNumber = scanner.nextLine();
     if (phoneNumber.charAt(0) != '0' || phoneNumber.length() != 11) {
         System.out.println("This is an invalid phone number");
//         phoneNumber = scanner.nextLine();
    }else {
     getAmountForPhoneNumber();
     break;
    }
   }
//   }
 }

 public static void getAmountForPhoneNumber(){
  Scanner scanner = new Scanner(System.in);
//int amount;
  while(true) {
       System.out.println("Please enter Amount(50.00 - 10,000.00 )");
       double amount = scanner.nextDouble();

       if (amount < 50 ||  amount > 10000) {
            System.out.println("Invalid amount!\n");
       } else {
            System.out.println("Your transaction is being processed.");
            System.exit(0);

       }

  }

 }
 }

