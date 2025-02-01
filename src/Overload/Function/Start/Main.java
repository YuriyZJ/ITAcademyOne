package Overload.Function.Start;

import Overload.Function.Entity.FractionEntity;
import Overload.Function.Logic.FractionLogic;
import Overload.Function.View.FractionView;

public class Main {
    public static void main(String[] args) {

        FractionEntity fraction1 = new FractionEntity(1, 2);
        FractionEntity fraction2 = new FractionEntity(3, 4);

        FractionLogic fLogic = new FractionLogic();
        FractionEntity result = fLogic.addition(fraction1, fraction2);

        FractionView fView = new FractionView();

        fView.printFraction("Сумма дробей равна: ");

        fView.printFraction(fraction1);
        fView.printFraction(fraction2);

        fView.printFraction("Дробь один: ", fraction1);
        fView.printFraction("Дробь два: ", fraction2);

        fView.printFraction(fraction1, fraction2, result, '+');

        FractionEntity result2 = fLogic.multiplication(fraction1, fraction2);

        fView.printFraction(fraction1, fraction2, result2, '*');
    }
}
