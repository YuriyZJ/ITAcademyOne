package Overload.Function.Logic;

import Overload.Function.Entity.FractionEntity;

public class FractionLogic {

    //FractionEntity — тип возвращаемого значения, метод возвращает объект класса FractionEntity.
    //Эта строка объявляет метод, который принимает две дроби (объекты FractionEntity), складывает их и возвращает новый объект FractionEntity с результатом.
    public FractionEntity addition (FractionEntity f1, FractionEntity f2) {
        int num, den;
        num = f1.getNumerator() * f2.getDenominator() + f2.getNumerator() * f1.getDenominator();
        den = f1.getDenominator() * f2.getDenominator();
        FractionEntity result = new FractionEntity (num, den); //Теперь в result хранится объект FractionEntity, представляющий сумму f1 + f2.
        return result;
        //return new FractionEntity(num, den);
    }
    public FractionEntity subtraction (FractionEntity f1, FractionEntity f2) {
        int num, den;
        num = f1.getNumerator() * f2.getDenominator() - f2.getNumerator() * f1.getDenominator();
        den = f1.getDenominator() * f2.getDenominator();
        FractionEntity result = new FractionEntity (num, den);
        return result;
    }
    public FractionEntity multiplication(FractionEntity f1, FractionEntity f2){
        int num, den;
        num = f1.getNumerator() * f2.getNumerator();
        den = f1.getDenominator() * f2.getDenominator();
        FractionEntity result = new FractionEntity (num, den);
        return result;
    }

}
