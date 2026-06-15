package application;

import entities.Department;
import entities.HourContrat;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class EXResolvido {
    public static void main(String[]args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department name: ");
        String departmentName = sc.nextLine();
        System.out.print("Enter Worker Data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department((departmentName)));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        for (int i=1; i<n; i++){
            System.out.println("Enter contract # " + i + "data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double  valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContrat contrat = new HourContrat(contractDate, valuePerHour, hours);
            worker.addContract(contrat);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY):  ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departement: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ":" + String.format("%.2f", worker.incoume(year, month)));

        sc.close();
    }
}
