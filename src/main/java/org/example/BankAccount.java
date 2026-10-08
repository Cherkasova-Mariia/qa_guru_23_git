package org.example;

public class BankAccount {
   String accountNumber;
   double balance;

   public BankAccount(String accountNumber){
       this.accountNumber = accountNumber;
       this.balance = 0.0;
   }
   void deposit(double amount){
       balance = balance + amount;

       System.out.println("Баланс пополнен на сумму: " + amount);
   }
   void withdraw(double amount){
       if (amount > balance){
           System.out.println("Недостаточно средств");
       }
       else{
           balance = balance - amount;
           System.out.println("Снято: " + amount);
       }
   }
    void printBalance(){
        System.out.println("Текущий баланс: " + balance);
    }
}
