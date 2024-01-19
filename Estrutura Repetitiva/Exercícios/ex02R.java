import java.util.Scanner;

public class ex02R {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char r;
        double num;
        do {
            System.out.print("Insira um número: ");
            num = sc.nextDouble();
            if(num%2==0){
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
            System.out.println("Deseja repetir a operação? (s/n)");
            r = sc.next().charAt(0);
        } while(r!='n');

        sc.close();
    }
}
