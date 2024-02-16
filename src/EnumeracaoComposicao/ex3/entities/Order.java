package EnumeracaoComposicao.ex3.entities;

import EnumeracaoComposicao.ex3.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double total = 0;
        for (OrderItem item : items) { // Percorre todos os itens, multiplicando seu preço e quantidade e adicionando o resultado à variável total
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:" + "\n");
        sb.append("Order moment: " + moment.format(fmt) + "\n");
        sb.append("Order status: " + status + "\n");

        sb.append("Client: " + client + "\n");

        sb.append("Order items:" + "\n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }

        sb.append("Total price: $" + String.format("%.2f", total()));

        return sb.toString();
    }
}
