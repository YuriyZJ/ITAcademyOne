package Lesson18.T2Bank;

/*SavingsAccount может иметь дополнительные атрибуты/методы, такие как interestRate и addInterest().
CurrentAccount может иметь такие атрибуты, как overdraftLimit.*/

public class CurrentAccount extends Account {
    private double overdraftLimit = 277;

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(int accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance + overdraftLimit); // Добавляем овердрафт сразу
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) { // Учитываем овердрафт
            balance -= amount;
            System.out.println("Снятие: -" + amount + ". Новый баланс: " + balance);
        } else {
            throw new RuntimeException("Ошибка: превышен лимит овердрафта!");
        }
    }
}