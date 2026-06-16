package application;

import entities.Employe;
import entities.OutsourcedEmploye;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioPolimorfismo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employe> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine(); // consumir quebra de linha

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employe emp = new OutsourcedEmploye(
                        name,
                        hours,
                        valuePerHour,
                        additionalCharge
                );

                list.add(emp);

            } else {

                Employe emp = new Employe(
                        name,
                        hours,
                        valuePerHour
                );

                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employe emp : list) {
            System.out.printf("%s - $ %.2f%n",
                    emp.getName(),
                    emp.payment());
        }

        sc.close();
    }
}