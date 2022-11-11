package Project2;

import java.util.Scanner;

public class BankDemo {
    public static void main(String args[]) {
        Bank acc[] = new Bank[10];
        int accNo, choice = 0, count = 0;
        String holder, bName, type;
        double balance = 0, deposite, withdraw;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Create Account\n2.Deposite Amount\n3.Withdraw Amount\n4.Show Balance");
            System.out.println();
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Enter the account number:");
                    accNo = sc.nextInt();
                    System.out.println("Enter the holder name:");
                    holder = sc.next();
                    System.out.println("Enter the bank name:");
                    bName = sc.next();

                    acc[count] = new Bank(accNo, holder, bName);
                    count++;
                    break;
                }
                case 2: {
                    System.out.println("Enter the existing account number:");
                    accNo = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (acc[i] != null && acc[i].getAccNo() == accNo) {
                            balance = acc[i].getBalance();
                            System.out.println("Your current balance is:" + balance);
                            System.out.println("Enter the amount which you want to deposite in your account:");
                            deposite = sc.nextInt();
                            balance = balance + deposite;
                            acc[i].setBalance(balance);
                            System.out.println("Your new balance is:" + balance);
                            System.out.println("Amount Deposite Successfully");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter the existing account number:");
                    accNo = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (acc[i] != null && acc[i].getAccNo() == accNo) {
                            balance = acc[i].getBalance();
                            System.out.println("Your current balance is:" + balance);
                            System.out.println("Enter the amount which you want to withdraw from the account:");
                            withdraw = sc.nextInt();
                            balance = balance - withdraw;
                            acc[i].setBalance(balance);
                            System.out.println("Your new balance is:" + balance);
                            System.out.println("Amount Withdraw Successfully");
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Show Account:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(acc[i]);
                    }
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                }

            }
        }
        while (choice != 5);
    }
}
