package membros.estaticos.V2.util;

public class Calculator {
        public final double PI = 3.14159; // Declaração de membro estático como constante (usa-se CapsLock sempre no nome)

        public double circumference(double radius){ // Como esse método será chamado em uma classe estática (main), ele também tem que ser estático
            return 2*PI*radius;
        }

        public double volume(double radius){
            return 4.0 * PI * Math.pow(radius, 3)/3.0;
        }
    }

