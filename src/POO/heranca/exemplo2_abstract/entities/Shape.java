package POO.heranca.exemplo2_abstract.entities;

import POO.heranca.exemplo2_abstract.entities.enums.Color;

public abstract class Shape {

    private Color color; // Enumeração de cor

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area(); // Método abstrato
}
