package application;

import model.entities.Reservetion;
import model.exceptions.DomainExceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExcessaoMuitoRuim {
    public static void man(String []args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Room number");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservetion reservetion = null;
            reservetion = new Reservetion(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservetion);

            System.out.println();
            System.out.println("Enter date to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservetion.updateDate(checkIn, checkOut);
            System.out.println("Reservation: " + reservetion);
    }
    catch(ParseException e){
            System.out.println("Invalid date format");
    }
    catch (DomainExceptions e){
            System.out.println("Error in reservation: " + e.getMessage());
    }
        //String error = reservetion.updateDate(checkIn, checkOut);

        //System.out.println("Reservation: " + reservetion);

        sc.close();
    }
}
