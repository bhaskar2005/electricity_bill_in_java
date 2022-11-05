package Assignments;

import java.util.Scanner;

public class Electricity_bill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your unit: ");
        float p = input.nextFloat();
        System.out.print("\nEnter your usage time(hour): ");
        float t = input.nextFloat();

        float e = p / t;
        float er = e / 1000f;

        float dr = 4.69f * er;
        float bill = dr * 30f;
        System.out.println("\nyour total electricity usage : " + er + " KWatt");
        System.out.println("\nYour electricity bill : " + bill + " rupees/month");

    }
}
