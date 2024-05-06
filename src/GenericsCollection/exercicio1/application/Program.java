package GenericsCollection.exercicio1.application;

import GenericsCollection.exercicio1.entities.Course;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many courses there will be? ");

        String[] coursesName = new String[validateIntegerInputs(sc)];

        System.out.println("Enter courses name below...");
        for (int i = 0; i < coursesName.length; i++) {
            coursesName[i] = sc.nextLine();
        }

        Set<Course> coursesData = new HashSet<>();

        System.out.print("How many students for course " + coursesName[0] + "? ");
        int studentsQuantity = validateIntegerInputs(sc);
        for (int i = 0; i < studentsQuantity; i++) {
            coursesData.add(new Course(validateIntegerInputs(sc), coursesName[0]));
        }

        Set<Course> courseDataTmp = new HashSet<>();

        for (int i = 1; i < coursesName.length; i++) {
            System.out.print("How many students for course " + coursesName[i] + "? ");
            studentsQuantity = validateIntegerInputs(sc);
            for (int j = 0; j < studentsQuantity; j++) {
                courseDataTmp.add(new Course(validateIntegerInputs(sc), coursesName[0]));
            }
            coursesData.addAll(courseDataTmp); // União entre conjuntos, não adiciona elementos repetidos
        }

        System.out.println("Total students: " + coursesData.size());

        sc.close();
        }

    public static int validateIntegerInputs(Scanner sc){
        int input = 0;
        try {
            input = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input.");
        }
        return input;
    }
}