package Lesson18.T2Bank;

/*SavingsAccount может иметь дополнительные атрибуты/методы, такие как interestRate и addInterest().
CurrentAccount может иметь такие атрибуты, как overdraftLimit.*/

import java.util.Objects;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(int accountNumber,double balance, double interestRate) {
        super(accountNumber, balance); //Если не вызвать super(...), то accountNumber и balance останутся неинициализированными, а Java не позволяет этого.
        this.interestRate = interestRate; //super(...) нужен для вызова конструктора родителя, чтобы правильно инициализировать унаследованные поля (accountNumber, balance).
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double addInterest(double interestRate) {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Начислены проценты: +" + interest + ". Новый баланс: " + balance);
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SavingsAccount that = (SavingsAccount) o;
        return Double.compare(interestRate, that.interestRate) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), interestRate);
    }
}
