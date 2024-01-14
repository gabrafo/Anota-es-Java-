import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual dia da semana você quer visualizar?");
        int dia = sc.nextInt();
        String resp;
        switch (dia){
            case 1:
                resp = "DOMINGO";
                break;
            case 2:
                resp = "SEGUNDA-FEIRA";
                break;
            case 3:
                resp = "TERÇA-FEIRA";
                break;
            case 4:
                resp = "QUARTA-FEIRA";
                break;
            case 5:
                resp = "QUINTA-FEIRA";
                break;
            case 6:
                resp = "SEXTA-FEIRA";
                break;
            case 7:
                resp = "SÁBADO";
                break;
            default:
                resp = "NENHUM";
                break;
        }
        System.out.println(resp);
        sc.close();
    }
}
