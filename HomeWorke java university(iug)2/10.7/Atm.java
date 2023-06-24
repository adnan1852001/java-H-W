import java.util.Scanner;

public class Atm {
    Account[] accounts = new Account[10];
    
    Atm() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100, 4.5);
        }
    }

    void askUser(){
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("enter the account id: ");
            int id = input.nextInt();
            if (id >= 10) {
                System.out.println("the id is invalid please try again.");
                continue;
            }
            Account account = accounts[id];
            accountLoop: while(true){
                System.out.println();
                System.out.println("Main menu");
                System.out.println("1. check balance");
                System.out.println("2. withdraw");
                System.out.println("3. deposit");
                System.out.println("4. exit");
                System.out.print("enter choise:");
                int choise = input.nextInt();
                double amount=0;
                switch (choise) {
                    case 1:
                        System.out.println("The balance is s" + account.gBalance());
                    break;

                    case 2:
                        System.out.print("enter the amount:");
                        amount = input.nextDouble();
                        account.withdraw(amount);
                    break;
                    
                    case 3:
                        System.out.print("enter the amount:");
                        amount = input.nextDouble();
                        account.deposit(amount);
                    break;
                    
                    case 4:
                        break accountLoop;
                    
                    default:
                        System.out.println("invalid choise");
                    break;
                }
            }
        }
    }
}
