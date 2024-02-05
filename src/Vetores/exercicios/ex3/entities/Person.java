package Vetores.exercicios.ex3.entities;

public class Person {
    private String name;
    private int age;
    private double hight;

    public Person() {
    }

    public Person(String name, int age, double hight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHight() {
        return hight;
    }

    public double avgHight(double totalHight, int n){
        return totalHight/n;
    }

    public void percentage(int cont, final int n, String[] vetName){
        double percentage = ((double) cont /n)*100; // Casting para double
        System.out.printf("Pessoas com menos de 16 anos: %.2f", percentage);
        System.out.println("%");
        for(int i = 0; i<cont; i++){
            System.out.println(vetName[i]);
        }
    }
}
