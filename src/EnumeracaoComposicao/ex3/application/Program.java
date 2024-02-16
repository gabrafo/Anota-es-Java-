package EnumeracaoComposicao.ex3.application;

import EnumeracaoComposicao.ex3.entities.Client;
import EnumeracaoComposicao.ex3.entities.Order;
import EnumeracaoComposicao.ex3.entities.OrderItem;
import EnumeracaoComposicao.ex3.entities.Product;
import EnumeracaoComposicao.ex3.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String dateTmp = sc.nextLine();
        LocalDate date = LocalDate.parse(dateTmp, fmt);
        Client client = new Client(name, email, date);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String statusTmp = sc.nextLine();
        OrderStatus status = OrderStatus.valueOf(statusTmp);
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume quebra de linha
        LocalDateTime moment = LocalDateTime.now();
        Order order = new Order(moment, status, client);

        for(int i = 1; i<=n; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            Product p = new Product(nameProduct, price);
            System.out.print("Quantity: ");
            int qnt = sc.nextInt();
            sc.nextLine(); // Consume quebra de linha
            order.addItem(new OrderItem(qnt, price, p));
        }

        System.out.println(order);

        sc.close();;
    }
}
