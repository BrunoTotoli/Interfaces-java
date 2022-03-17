package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rental data:");
        System.out.println("Car model: ");
        String carModel = sc.nextLine();
        System.out.println("Pickup (dd/MM/yyyy HH:ss): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.println("Return (dd/MM/yyyy HH:ss): ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Enter price per hour: ");
        Double pricePerHour = sc.nextDouble();
        System.out.println("Enter price per day: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println(carRental.getInvoice());

        sc.close();

    }

}
