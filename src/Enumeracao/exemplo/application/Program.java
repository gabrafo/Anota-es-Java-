package Enumeracao.exemplo.application;

import Enumeracao.exemplo.entities.Order;
import Enumeracao.exemplo.entities.enums.OrderStatus;

import java.time.Instant;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, Instant.now(), OrderStatus.PENDING_PAYMENT); // Enum é transformado em String na hora de ser exibido

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // Transforma de String para Enum

        System.out.println(os1);
        System.out.println(os2);
    }
}
