package Overload.Function.Entity;

import java.util.Objects;

public class FractionEntity {
    private int numerator;
    private int denominator;

    public FractionEntity(){
        //this(1, 0);
    }

    public FractionEntity(int numerator, int denominator){
        this.numerator = numerator;
        if (denominator == 0){
            throw new RuntimeException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0){
            throw new RuntimeException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FractionEntity that = (FractionEntity) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
