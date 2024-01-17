import java.util.Scanner;

public class ex01R {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String gab, gab1;
        int cont = 0;

        for(int i = 0; i<10; i++){
            System.out.println("Digite as respostas do gabarito (exemplo: A, B, C, D) e as separe a partir da tecla Enter: ");
            gab = sc.nextLine();
            if(gab.length()!=1){
                System.out.println("Tamanho inválido, insira apenas um caractére.");
                i--;
            } else {
                System.out.println("Questão " + (i+1) + ": " + gab + "\n");
                System.out.println("Agora insira a resposta da mesma questão da aluna Tailane: ");
                gab1 = sc.nextLine();
                String r = gab.toUpperCase(), r1 = gab1.toUpperCase(); // .toUpperCase() faz uma String ter seu conteúdo todo maiúsculo
                if(gab1.length()!=1){ // .length() se refere ao tamanho de uma String
                    System.out.println("Tamanho inválido, insira apenas um caractére.");
                    i--;
                } else {
                    if (r1.equals(r)) { // .equals() compara o conteúdo de duas Strings
                        System.out.println("A aluna acertou a questão!");
                        cont++;
                    } else {
                        System.out.println("A aluna errou a questão.");
                    }
                }
            }
        }

        System.out.println("Tailane acertou " + cont + "/10 da prova.");

        sc.close();
    }
}
