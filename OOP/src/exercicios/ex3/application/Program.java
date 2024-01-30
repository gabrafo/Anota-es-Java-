package exercicios.ex3.application;
import exercicios.ex3.entities.Student;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        for(int i = 0; i<3; i++) {
            student.grade = sc.nextDouble();
            student.sumGrade();
        }
        student.finalGrade();

        sc.close();
    }
}
