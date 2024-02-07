package Vetores.exercicios.ex9.entities;

public class Estudant {
    private String name;
    private double grade1, grade2;

    public Estudant(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public static void approval(Estudant[] vet){
        final double media = 6.0; // Constante da média dos alunos
        for(int i = 0; i<vet.length; i++){
            if((vet[i].getGrade1() + vet[i].getGrade2())/2>=media){
                System.out.println(vet[i].getName());
            }
        }
    }
}
