package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount firstAccount = new BankAccount("1234 5678 8765 4321");
        firstAccount.deposit(500.00);
        firstAccount.printBalance();
        firstAccount.withdraw(200.00);
        firstAccount.printBalance();
        firstAccount.withdraw(1000.00);
        firstAccount.printBalance();
    }
}
