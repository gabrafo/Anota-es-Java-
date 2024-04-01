package Excecoes.exemplo3.V3.model.entities;

import Excecoes.exemplo3.V3.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn, checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Colocado como estático pra que não
    // instancie um novo SimpleDateFormat pra cada data

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException { // Propaga as exceções ao invés de tratar
        if(!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date.");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime(); // Devolve a qntd em milissegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // Converte de ms para dias
    }

    public void updateDates(Date checkIn, Date checkOut) throws DomainException { // Lança a exceção para ser tratada no programa principal
        Date now = new Date();
        if(checkIn.before(now) || checkOut.before(now)){
            throw new DomainException("Reservation dates for update must be future dates"); // Lança exceção em caso de erros
            // Exceção para caso argumentos (passagem dos parâmetros) sejam inválidos
        }
        if(!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date.");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override // toString é sempre sobreposição
    public String toString() {
        return "Room " + roomNumber
                + ", check-in: " + sdf.format(checkIn)
                + ", check-out: " + sdf.format(checkOut)
                + ", " + duration() + " nights";
    }
}
