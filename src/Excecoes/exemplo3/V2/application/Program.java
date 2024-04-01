package Excecoes.exemplo3.V2.application;

import Excecoes.exemplo3.V2.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        // Solução RUIM, iremos delegar a lógica de validação para a classe Reservation
        // e retornar uma String indicando erro caso ocorra
                Scanner sc = new Scanner(System.in);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                System.out.print("Room number: ");
                int number = sc.nextInt();
                System.out.print("Check-in date (dd/MM/yyyy): ");
                Date checkIn = sdf.parse(sc.next()); // Chamada que pode lançar a exceção
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
                    String error = reservation.updateDates(checkIn, checkOut); // Caso haja erro, será armazenado em error
                    if(error!=null){
                        System.out.println("Error in reservation: " + error);
                    } else {
                        System.out.println("Reservation: " + reservation);
                    }
                }

                // Lógica de checagem deveria estar na classe e não no programa principal

                sc.close();
            }
        }

