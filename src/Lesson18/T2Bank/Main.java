package Lesson18.T2Bank;

/*Базовый класс: Account с такими атрибутами, как accountNumber, balance и такими методами, как deposit (), withdraw ().
Производные классы: SavingsAccount (сбергательный), CurrentAccount (текущий счет).
SavingsAccount может иметь дополнительные атрибуты/методы, такие как interestRate (процентная ставка) и addInterest().
CurrentAccount может иметь такие атрибуты, как overdraftLimit.
Имитируйте банковские операции для обоих типов счетов.*/

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Savings Account (Сберегательный счет) =====");
        SavingsAccount savings = new SavingsAccount(1, 2000, 5); // Баланс = 2000, ставка = 5%
        System.out.println("Начальный баланс: " + savings.getBalance());

        savings.deposit(500);
        savings.addInterest(5); // Начисление процентов
        System.out.println("Баланс после начисления процентов: " + savings.getBalance());

        savings.withdraw(2100);
        System.out.println("Баланс после снятия: " + savings.getBalance());

        System.out.println("\n===== Current Account (Текущий счет) =====");
        CurrentAccount current = new CurrentAccount(2, 1000, 500); // Баланс = 1000, овердрафт = 500
        System.out.println("Начальный баланс: " + current.getBalance());

        current.deposit(200);
        current.withdraw(1900); // Баланс = 0, овердрафт разрешен
        System.out.println("Баланс после снятия (уходим в овердрафт): " + current.getBalance());
    }
}

