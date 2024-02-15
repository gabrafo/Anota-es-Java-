package EnumeracaoComposicao.exemplo.entities;

import EnumeracaoComposicao.exemplo.entities.enums.OrderStatus;

import java.time.Instant;

public class Order {

    private Integer ID;
    private Instant moment;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer ID, Instant moment, OrderStatus status) {
        this.ID = ID;
        this.moment = moment;
        this.status = status;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
