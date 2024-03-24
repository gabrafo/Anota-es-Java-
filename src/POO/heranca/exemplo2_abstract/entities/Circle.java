package POO.heranca.exemplo2_abstract.entities;

import POO.heranca.exemplo2_abstract.entities.enums.Color;

public class Circle extends Shape{

    public Double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override // Obrigatoriamente tem que sobrescrever o método abstrato da super classe
    public double area() {
        return Math.PI*radius*radius;
    }
}
