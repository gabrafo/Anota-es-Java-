package EstruturaRepetitiva;

public class para_cada {
    public static void main(String[] args) {
        String[] vect = new String[] {"Maria", "Bob", "Alex"}; // Instancia três posições

        // FOR CONVENCIONAL
        /*
        for(int i = 0; i< vect.length; i++){
            System.out.println(vect[i]);
        }
        */

        // FOR EACH
        for(String obj : vect){ // String é o tipo, "obj" o apelido (poderia ser qualquer um) e "vect" é a coleção
            System.out.println(obj);
        }

    }
}