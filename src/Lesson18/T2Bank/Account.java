package Lesson18.T2Bank;

/*Базовый класс: Account с такими атрибутами, как accountNumber, balance и такими методами, как deposit (), withdraw ().
Производные классы: SavingsAccount, CurrentAccount.
SavingsAccount может иметь дополнительные атрибуты/методы, такие как interestRate и addInterest().
CurrentAccount может иметь такие атрибуты, как overdraftLimit.
Имитируйте банковские операции для обоих типов счетов.*/


import java.util.Objects;

public class Account {
    private int accountNumber;
    protected double balance;

    public Account(){

    }

    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Теперь баланс обновляется
            System.out.println("Пополнение: +" + amount + ". Новый баланс: " + balance);
        } else {
            throw new RuntimeException("Сумма пополнения должна быть положительной!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount; // Теперь баланс обновляется
            System.out.println("Снятие: -" + amount + ". Новый баланс: " + balance);
        } else {
            throw new RuntimeException ("Ошибка: недостаточно средств или неверная сумма!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber && Double.compare(balance, account.balance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }
}
