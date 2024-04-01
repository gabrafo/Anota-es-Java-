package Excecoes.exemplo3.V3.application;

import Excecoes.exemplo3.V3.model.entities.Reservation;
import Excecoes.exemplo3.V3.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) { // Programa agora TRATA as exceções ao invés de propagar
        // Solução BOA, usando tratamento de erros.
                Scanner sc = new Scanner(System.in);
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                try {
                    System.out.print("Room number: ");
                    int number = sc.nextInt();
                    System.out.print("Check-in date (dd/MM/yyyy): ");
                    Date checkIn = sdf.parse(sc.next()); // Chamada que pode lançar a exceção
                    System.out.print("Check-out date (dd/MM/yyyy): ");
                    Date checkOut = sdf.parse(sc.next());

                    Reservation reservation = new Reservation(number, checkIn, checkOut);
                    System.out.println("Reservation: " + reservation);

                    System.out.println();
                    System.out.println("Enter data to update the reservation:");
                    checkIn = sdf.parse(sc.next()); // Chamada que pode lançar a exceção
                    System.out.print("Check-out date (dd/MM/yyyy): ");
                    checkOut = sdf.parse(sc.next());

                    reservation.updateDates(checkIn, checkOut);
                    System.out.println("Reservation: " + reservation);
                } catch (ParseException e){
                    System.out.println("Invalid date format");
                } catch(DomainException e){
                    System.out.println("Error in reservation: " + e.getMessage()); // Mostra erro caso ele seja lançado na classe
                } catch (RuntimeException e){
                    System.out.println("Unexpected error"); // Captura qualquer Runtime Exception
                }

                sc.close();
            }
        }

