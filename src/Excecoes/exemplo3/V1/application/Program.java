package Excecoes.exemplo3.V1.application;

import Excecoes.exemplo3.V1.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Versão de solução MUITO RUIM

public class Program {
    public static void main(String[] args) throws ParseException { // Método main é um método que pode lançar essa exceção
        // Método não trata a exceção ParseException, e sim a propaga
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next()); // CHamada que pode lançar a exceção
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if(!checkOut.after(checkIn)){ // Se: checkOut não for depois de checkIn
            System.out.println("Error in reservation: Check-out date must be after check-in date.");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            checkIn = sdf.parse(sc.next()); // CHamada que pode lançar a exceção
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if(!checkOut.after(checkIn)){
                System.out.println("Error in reservation: Check-out date must be after check-in date.");
            } else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }
        }

        // Lógica de checagem deveria estar na classe e não no programa principal

        sc.close();
    }
}
