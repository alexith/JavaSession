import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        BankAccount akshayBankAccount = new BankAccount();

        String myNewAccount = akshayBankAccount.accountNumber = scanner.nextLine();

        System.out.println(myNewAccount);

        scanner.close();


    }

}