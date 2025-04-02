package ru.mirea;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CashBack cashBack = new CashBack();

        int actual = cashBack.cashBackCalculation(1000,true);
        int expected = 100;

        System.out.println("cashBack registered for 1000 purchase sum is expected = " + expected +
                " actual = " + actual);
    }
}