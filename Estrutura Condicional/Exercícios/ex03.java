import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva um digito: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x%y==0 || y%x==0){
            System.out.println("Multiplos");
        } else {
            System.out.println("Não multiplos");
        }

        sc.close();
    }
}
