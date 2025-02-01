package Overload.Function.View;

import Overload.Function.Entity.FractionEntity;

public class FractionView {

    public void printFraction(String title){
        System.out.println("------------------------------------------");
        System.out.println("\t\t" + title);
        System.out.println("------------------------------------------");
    }

    public void printFraction(FractionEntity f){
        System.out.println(f.getNumerator() + "/" + f.getDenominator());
    }

    public void printFraction(String title, FractionEntity f){
        System.out.print("\n|||" + title);
        System.out.print(f.getNumerator() + "/" + f.getDenominator());
    }

    public void printFraction(FractionEntity f1, FractionEntity f2, FractionEntity rez, char operator){
        System.out.print("\n\t\t" + f1.getNumerator() + "/" + f1. getDenominator());
        System.out.print(" " + operator + " ");
        System.out.print(f2.getNumerator() + "/" + f2.getDenominator());
        System.out.print(" = ");
        System.out.println(rez.getNumerator() + "/" + rez.getDenominator());
    }
}
