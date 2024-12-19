package javapackage;
import java.util.Scanner;
class Bank_account{
    double account_balance = 0;

    double deposit(double deposit){
        account_balance =  account_balance + deposit;
        return account_balance;
    }

    double withdraw(double ammount_to_be_withdrawn)
    {
        account_balance = account_balance - ammount_to_be_withdrawn;
        return account_balance;
    }

    double check_balance(){
        return account_balance;
    }
}


public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        Bank_account user = new Bank_account(); 

        System.out.println("\nATM Machine:-\nOur Services\n");

        System.out.println("Press 1 to check balance\nPress 2 to deposit balance\nPress 3 to withdraw balance");
        int opted_service = sc.nextInt();

        double withdraw_ammount = 0;
        double deposit_ammount = 0;
        double account_balance = 0;

        while (opted_service != 4){

           
            if (opted_service == 1){
                account_balance = user.check_balance();
                System.out.println("Balance = " + account_balance);
                System.out.println();
            }
           
            else if (opted_service == 2) {
                System.out.print("Enter Ammount to be deposited : ");
                deposit_ammount = sc.nextDouble();
                if (deposit_ammount <= 0){                  
                    System.out.println("Invalid Ammount.");
                }
                else {
                    account_balance = user.deposit(deposit_ammount);
                    System.out.println("Ammount is deposited.total balance is " + account_balance);
                    System.out.println();
                }
            }
            
            else{
                System.out.print("Enter Ammount to be withdrawn : ");
                withdraw_ammount = sc.nextDouble();
                if (withdraw_ammount <= 0){                 
                    System.out.println("Invalid Ammount.\n");
                    System.out.println();
                }
                else{                                       
                    account_balance = user.check_balance();
                    if (account_balance < withdraw_ammount){
                        System.out.println("Insufficient Balance.Transaction Failed");
                        System.out.println();
                    }
                    else {
                        account_balance = user.withdraw(withdraw_ammount);     
                        System.out.println("Ammount is withdrawn.total balance is " + account_balance);
                        System.out.println();
                    }
                }
            }
            System.out.println("Press 1 to check balance\nPress 2 to deposit balance\nPress 3 to withdraw balance\nPress 4 to Exit\n");
            opted_service = sc.nextInt();    
        }
        System.out.println("Thank You for using our services.Good Day.");

        sc.close();
    }
}
