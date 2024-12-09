package org.example;

public class BMI {

    public static void main(String[] args) {

        double weight = 78;
        double height = 1.59;

        double bmiValue = (weight / Math.pow(height, 2));

        if (!(weight < 0) && !(height < 0)) {

            System.out.println("Rozsah BMI: ");

            if (bmiValue <= 16.5) {
                System.out.println("těžká podvýživa: " + bmiValue);
            } else if (bmiValue > 16.5 && bmiValue < 18.5) {
                System.out.println("podváha: " + bmiValue);
            } else if (bmiValue > 18.5 && bmiValue < 25) {
                System.out.println("ideální (zdravá) váha: " + bmiValue);
            } else if (bmiValue > 25 && bmiValue < 30) {
                System.out.println("nadváha: " + bmiValue);
            } else if (bmiValue > 30 && bmiValue < 35) {
                System.out.println("obezita prvního stupně: " + bmiValue);
            } else if (bmiValue > 35 && bmiValue < 40) {
                System.out.println("obezita druhého stupně: " + bmiValue);
            } else if (bmiValue > 40) {
                System.out.println("obezita třetího stupně (též morbidní obezita): " + bmiValue);
            }
        } else {
            System.out.println("Nelze zadat zapornou vahu nebo vysku");
        }

    }
}