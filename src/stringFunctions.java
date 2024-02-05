public class stringFunctions {
    public static void main(String[] args){
        String original = " é san Tas TIII   Cuzzzz   san        ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim(); // Retira espaços nos CANTOS da String
        String s04 = original.substring(3); // Cria uma nova String depois a partir de um index
        String s05 = original.substring(18, 24); // Cria uma nova String a partir de um intervalo determinado
        String s06 = original.replace('C', 's'); // Troca o "C" por "s".
        String s07 = original.replace("Cu", "Co");
        int i = original.indexOf("san"); // Retorna o primeiro índex da substring "san"
        int j = original.lastIndexOf("san"); // Retorna o último índex da substring "san"

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase(): -" + s01 + "-");
        System.out.println("toUpperCase(): -" + s02 + "-");
        System.out.println("trim(): -" + s03 + "-");
        System.out.println("substring(início): -" + s04 + "-");
        System.out.println("substring(início, fim): -" + s05 + "-");
        System.out.println("replace(char, char): -" + s06 + "-");
        System.out.println("replace(String, String): -" + s07 + "-");
        System.out.println("indexOf() san: " + i); // Primeira ocorrência de "san"
        System.out.println("lastIndexOf() san: " + j); // Última ocorrência de "san"
    }
}
