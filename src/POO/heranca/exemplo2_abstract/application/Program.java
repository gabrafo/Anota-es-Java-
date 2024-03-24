package POO.heranca.exemplo2_abstract.application;

import POO.heranca.exemplo2_abstract.entities.Circle;
import POO.heranca.exemplo2_abstract.entities.Rectangle;
import POO.heranca.exemplo2_abstract.entities.Shape;
import POO.heranca.exemplo2_abstract.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>(); // Lista do tipo Shape (não está instanciada como Shape, apenas tem tipo Shape)

        for (int i = 0; i<n; i++){
            System.out.println("Shape #" + (i+1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(answer == 'r' || answer == 'R'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height)); // Objetos devem ser instanciados com classes concretas, polimorfismo
            } else if(answer == 'c' || answer == 'C'){
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list){
            System.out.printf("%.2f%n", shape.area());
        }

        sc.close();
    }
}
