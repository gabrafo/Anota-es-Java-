package Interfaces.exemplo2.application;

import Interfaces.exemplo1.model.entities.CarRental;
import Interfaces.exemplo1.model.entities.Vehicle;
import Interfaces.exemplo1.model.services.BrazilTaxService;
import Interfaces.exemplo1.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

// COM O USO DE INTERFACES

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        Vehicle vehicle = new Vehicle(sc.nextLine());
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt); // Formata a entrada de dados e atribui à variável start
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, vehicle);

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService()); // BrazilTaxService é um upcasting de TaxService

        rentalService.processInvoice(cr);
        System.out.println();

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
