public class stringFunctions2 {
    public static void main(String[] args){
        String s = "potato apple lemon";

        String[] vect = s.split(" "); // String[] vect é a declaração do vetor
        // .split gera um vetor com os intervalos gerados a partir do que foi usado como separação, no nosso caso o espaço em
        // branco
        
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(s);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
    }
}
