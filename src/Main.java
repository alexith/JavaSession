import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        BankAccount akshayBankAccount = new BankAccount();

        System.out.println("Please enter the account number: ");
        String myNewAccount = akshayBankAccount.accountNumber = scanner.nextLine();

        System.out.println("Please, enter the name: ");
        String myName = akshayBankAccount.customerName = scanner.nextLine();

        System.out.println("Hello, " + myName);
        System.out.println("Your entered account no. : " + myNewAccount);


        System.out.println("Do you want to (1)withdraw or (2)deposit ? (1/2) ");
        String withdrawOrDeposit = scanner.nextLine();

        if(withdrawOrDeposit.equals("1")) {
            System.out.println("Please enter the amount you want to withdraw: ");
            Double withdrawAmount = akshayBankAccount.currentAmount = scanner.nextDouble();
        } else if(withdrawOrDeposit.equals("2")){
            System.out.println("Please enter the amount you want to deposit: ");
            Double depositAmount = akshayBankAccount.currentAmount = scanner.nextDouble();
        }

        scanner.close();


    }

}